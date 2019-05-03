package com.interdepartmental.service;

import com.interdepartmental.model.Poll;
import com.interdepartmental.repository.PollRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PollServiceImpl implements PollService {
    private PollRepository pollRepository;

    public PollServiceImpl(PollRepository pollRepository){
        this.pollRepository = pollRepository;
    }

    @Override
    public void post(Poll poll){
        pollRepository.post(poll);
    }

    @Override
    public Poll get(String topic){
        for(Poll poll : pollRepository.get()){
            if(poll.getPollTopic().equals(topic)){
                return poll;
            }
        }
        return null;
    }
}
