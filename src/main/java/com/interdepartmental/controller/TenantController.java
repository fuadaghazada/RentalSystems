package com.interdepartmental.controller;

import com.interdepartmental.model.Announcement;
import com.interdepartmental.model.Tenant;
import com.interdepartmental.service.TenantService;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Map;

@RestController
@RequestMapping("api/v1/tenant")
public class TenantController {
    private TenantService tenantService;

    public TenantController(TenantService tenantService){
        this.tenantService = tenantService;
    }

    @PostMapping
    public Tenant post(@RequestHeader(value="User-Agent") final String currentUserAgent, HttpServletResponse response,
                       @RequestBody Tenant tenant) {

        final UserAgentController.UserAgent expectedUserAgent = UserAgentController.UserAgent.MANAGER;
        if(!UserAgentController.checkUserAgent(expectedUserAgent, currentUserAgent)){
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            return null;
        }

        return tenantService.post(tenant);
    }

    @GetMapping
    public ArrayList<Tenant> get(@RequestHeader(value="User-Agent") final String currentUserAgent, HttpServletResponse response) {

        final UserAgentController.UserAgent expectedUserAgent = UserAgentController.UserAgent.MANAGER;
        if(!UserAgentController.checkUserAgent(expectedUserAgent, currentUserAgent)){
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            return null;
        }

        return tenantService.get();
    }
}
