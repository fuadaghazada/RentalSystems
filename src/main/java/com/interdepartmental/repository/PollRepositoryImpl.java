package com.interdepartmental.repository;

import com.interdepartmental.model.Poll;
import com.interdepartmental.model.Tenant;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class PollRepositoryImpl implements PollRepository {
    private ArrayList<Poll> polls = new ArrayList<>();

    @Override
    public Poll post(Poll poll){
        polls.add(poll);
        return poll;
    }

    @Override
    public void put(String topic, Tenant tenant, boolean isFirstSelected){
        for(Poll poll : polls){
            if(poll.getPollTopic().equals(topic)){
                poll.getParticipants().add(tenant);
                if(isFirstSelected){
                    poll.setFirstOptionCount(poll.getFirstOptionCount()+1);
                }else{
                    poll.setSecondOptionCount(poll.getSecondOptionCount()+1);
                }
                return;
            }
        }
    }

    @Override
    public ArrayList<Poll> get(){
        return polls;
    }

    @Override
    public boolean didTenantAttendToPoll(String topic, Tenant tenant){
        for(Poll poll : polls){
            if(poll.getPollTopic().equals(topic)) {
                if(poll.getParticipants().indexOf(tenant) > -1){
                    return true;
                }
            }
        }
        return false;
    }

}
