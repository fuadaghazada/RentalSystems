package com.interdepartmental.repository;

import com.interdepartmental.model.Poll;

import java.util.ArrayList;

public interface PollRepository {
    Poll post(Poll poll);

    ArrayList<Poll> get();
}
