package com.interdepartmental.service;

import com.interdepartmental.model.Poll;

public interface PollService {
    void post(Poll poll);

    Poll get(String topic);
}
