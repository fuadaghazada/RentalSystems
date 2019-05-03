package com.interdepartmental.repository;

import com.interdepartmental.model.Poll;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class PollRepositoryImpl implements PollRepository {
    private ArrayList<Poll> polls = new ArrayList<>();

    @Override
    public void post(Poll poll){
        polls.add(poll);
    }

    @Override
    public ArrayList<Poll> get(){
        return polls;
    }

}
