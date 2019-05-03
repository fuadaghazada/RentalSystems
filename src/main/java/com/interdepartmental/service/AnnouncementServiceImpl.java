package com.interdepartmental.service;

import com.interdepartmental.model.Announcement;
import com.interdepartmental.repository.AnnouncementRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AnnouncementServiceImpl implements AnnouncementService {
    private AnnouncementRepository announcementRepository;

    public AnnouncementServiceImpl(AnnouncementRepository announcementRepository){
        this.announcementRepository = announcementRepository;
    }

    @Override
    public void post(Announcement announcement){
        announcementRepository.post(announcement);
    }

    @Override
    public Announcement get(String topic){
        for(Announcement announcement : announcementRepository.get()){
            if(announcement.getTopic().equals(topic)){
                return announcement;
            }
        }
        return null;
    }
}
