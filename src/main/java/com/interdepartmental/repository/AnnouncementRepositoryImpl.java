package com.interdepartmental.repository;

import com.interdepartmental.model.Announcement;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class AnnouncementRepositoryImpl implements AnnouncementRepository {
    private ArrayList<Announcement> announcements = new ArrayList<>();

    @Override
    public void post(Announcement announcement){
        announcements.add(announcement);
    }

    @Override
    public ArrayList<Announcement> get(){
        return announcements;
    }

}
