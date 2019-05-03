package com.interdepartmental.repository;

import com.interdepartmental.model.Poll;

import java.util.ArrayList;

public interface PollRepository {
    void post(Poll poll);

    ArrayList<Poll> get();
}
