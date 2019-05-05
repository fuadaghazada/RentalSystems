package com.interdepartmental.repository;

import com.interdepartmental.model.Announcement;

import java.util.ArrayList;

public interface AnnouncementRepository {
    void post(Announcement announcement);

    ArrayList<Announcement> get();
}
