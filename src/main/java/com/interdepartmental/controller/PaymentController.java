package com.interdepartmental.controller;

import com.interdepartmental.model.Payment;
import com.interdepartmental.service.PaymentService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

@RestController
@RequestMapping("api/v1/payment")
public class PaymentController {
    private PaymentService paymentService;

    PaymentController(PaymentService paymentService){
        this.paymentService = paymentService;
    }

    @GetMapping
    public ArrayList<Payment> get()
    {
        return paymentService.get();
    }

    @PostMapping
    public Map post(@RequestBody Payment payment)
    {
        paymentService.post(payment);
        return Collections.singletonMap("result", "ok");
    }
}
