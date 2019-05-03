package com.interdepartmental.service;

import com.interdepartmental.model.Announcement;

public interface AnnouncementService {
    void post(Announcement announcement);

    Announcement get(String topic);
}
