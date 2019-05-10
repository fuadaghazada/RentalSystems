package com.interdepartmental.service;

import com.interdepartmental.model.Poll;
import com.interdepartmental.model.PropertyManager;
import com.interdepartmental.model.Tenant;
import com.interdepartmental.repository.PollRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Date;

@Service
public class PollServiceImpl implements PollService {
    private PollRepository pollRepository;

    public PollServiceImpl(PollRepository pollRepository){
        this.pollRepository = pollRepository;
    }

    @Override
    public Poll post(Poll poll){
        poll.setPollDate(new Date());
        poll.setPollConductor(new PropertyManager());
        poll.setParticipants(new ArrayList<Tenant>());
        return pollRepository.post(poll);
    }

    @Override
    public String put(String topic, Tenant tenant, boolean isFirstSelected){
        if(!pollRepository.didTenantAttendToPoll(topic, tenant)){
            pollRepository.put(topic, tenant, isFirstSelected);
            return "Your vote is successfully saved!";
        }else{
            return "You have already voted!";
        }

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
