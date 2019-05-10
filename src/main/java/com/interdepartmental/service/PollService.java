package com.interdepartmental.service;

import com.interdepartmental.model.Poll;

public interface PollService {
    Poll post(Poll poll);

    Poll get(String topic);
}
