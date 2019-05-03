package com.interdepartmental.controller;

import com.interdepartmental.model.Poll;
import com.interdepartmental.service.PollService;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.Map;

@RestController
@RequestMapping("api/v1/poll")
public class PollController {
    private PollService pollService;

    public PollController(PollService pollService){
        this.pollService = pollService;
    }

    @PostMapping
    public Map post(@RequestBody Poll poll) {
        pollService.post(poll);
        return Collections.singletonMap("result", "ok");
    }

    @GetMapping
    public Poll get(@RequestParam String topic) {
        return pollService.get(topic);
    }
}
