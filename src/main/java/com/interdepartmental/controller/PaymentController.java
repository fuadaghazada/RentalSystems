package com.interdepartmental.controller;

import com.interdepartmental.model.Bill;
import com.interdepartmental.model.MaintenanceFee;
import com.interdepartmental.model.Payment;
import com.interdepartmental.model.Rent;
import com.interdepartmental.service.PaymentService;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
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
    public ArrayList<Payment> get(@RequestHeader(value="User-Agent") final String currentUserAgent, HttpServletResponse response) {
        final UserAgentController.UserAgent expectedUserAgent = UserAgentController.UserAgent.MANAGER;
        if(!UserAgentController.checkUserAgent(expectedUserAgent, currentUserAgent)){
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            return null;
        }

        return paymentService.get();
    }

    @PostMapping
    public Payment payRent(@RequestHeader(value="User-Agent") final String currentUserAgent, HttpServletResponse response,
                        @RequestBody Rent payment)
    {
        final UserAgentController.UserAgent expectedUserAgent = UserAgentController.UserAgent.TENANT;
        if(!UserAgentController.checkUserAgent(expectedUserAgent, currentUserAgent)){
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            return null;
        }
        return paymentService.post(payment);
    }

    @PostMapping
    @RequestMapping("maintenanceFee")
    public Payment payMaintenanceFee(@RequestHeader(value="User-Agent") final String currentUserAgent, HttpServletResponse response,
                        @RequestBody MaintenanceFee payment)
    {
        final UserAgentController.UserAgent expectedUserAgent = UserAgentController.UserAgent.TENANT;
        if(!UserAgentController.checkUserAgent(expectedUserAgent, currentUserAgent)){
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            return null;
        }
        return paymentService.post(payment);
    }

    @PostMapping
    @RequestMapping("bill")
    public Payment payBill(@RequestHeader(value="User-Agent") final String currentUserAgent, HttpServletResponse response,
                        @RequestBody Bill payment)
    {
        final UserAgentController.UserAgent expectedUserAgent = UserAgentController.UserAgent.TENANT;
        if(!UserAgentController.checkUserAgent(expectedUserAgent, currentUserAgent)){
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            return null;
        }
        return paymentService.post(payment);
    }
}
