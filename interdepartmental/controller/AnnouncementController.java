package com.interdepartmental.controller;

import com.interdepartmental.model.Announcement;
import com.interdepartmental.service.AnnouncementService;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.Map;

@RestController
@RequestMapping("api/v1/announcement")
public class AnnouncementController {
    private AnnouncementService announcementService;

    public AnnouncementController(AnnouncementService announcementService){
        this.announcementService = announcementService;
    }

    @PostMapping
    public Map post(@RequestBody Announcement announcement) {
        announcementService.post(announcement);
        return Collections.singletonMap("result", "ok");
    }

    @GetMapping
    public Announcement get(@RequestParam String topic) {
        return announcementService.get(topic);
    }
}
