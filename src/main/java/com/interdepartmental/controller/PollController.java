package com.interdepartmental.controller;

import com.interdepartmental.model.Poll;
import com.interdepartmental.model.Tenant;
import com.interdepartmental.service.PollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.Collections;
import java.util.Map;

@RestController
@RequestMapping("api/v1/poll")
public class PollController {
    private PollService pollService;
    @Autowired
    private FeatureFlagController flag;

    public PollController(PollService pollService){
        this.pollService = pollService;
    }

    @PostMapping
    public Poll post(@RequestHeader(value="User-Agent") final String currentUserAgent, HttpServletResponse response,
                    @RequestBody Poll poll) {
        if(!flag.checkFeatureFlag("conductPoll")){
            response.setStatus(HttpServletResponse.SC_METHOD_NOT_ALLOWED);
            return null;
        }
        final UserAgentController.UserAgent expectedUserAgent = UserAgentController.UserAgent.MANAGER;
        if(!UserAgentController.checkUserAgent(expectedUserAgent, currentUserAgent)){
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            return null;
        }
        return pollService.post(poll);
    }

    @PutMapping
    public Map put(@RequestHeader(value="User-Agent") final String currentUserAgent, HttpServletResponse response,
                    @RequestParam String topic, @RequestBody Tenant tenant, @RequestParam boolean isFirstSelected) {
        if(!flag.checkFeatureFlag("attendPoll")){
            response.setStatus(HttpServletResponse.SC_METHOD_NOT_ALLOWED);
            return Collections.singletonMap("result", "METHOD NOT ALLOWED");
        }
        final UserAgentController.UserAgent expectedUserAgent = UserAgentController.UserAgent.TENANT;
        if(!UserAgentController.checkUserAgent(expectedUserAgent, currentUserAgent)){
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            return Collections.singletonMap("result", "UNAUTHORIZED");
        }
        return Collections.singletonMap("result", pollService.put(topic, tenant, isFirstSelected));
    }

    @GetMapping
    public Poll get(@RequestHeader(value="User-Agent") final String currentUserAgent, HttpServletResponse response,
                    @RequestParam String topic) {
        if(!flag.checkFeatureFlag("announcePoll")){
            response.setStatus(HttpServletResponse.SC_METHOD_NOT_ALLOWED);
            return null;
        }
        final UserAgentController.UserAgent expectedUserAgent = UserAgentController.UserAgent.MANAGER;
        if(!UserAgentController.checkUserAgent(expectedUserAgent, currentUserAgent)){
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            return null;
        }
        return pollService.get(topic);
    }
}
