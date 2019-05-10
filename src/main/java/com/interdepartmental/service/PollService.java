package com.interdepartmental.service;

import com.interdepartmental.model.Poll;
import com.interdepartmental.model.Tenant;

public interface PollService {
    Poll post(Poll poll);
    String put(String topic, Tenant tenant, boolean isFirstSelected);
    Poll get(String topic);
}
