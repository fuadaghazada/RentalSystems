package com.interdepartmental.repository;

import com.interdepartmental.model.Poll;
import com.interdepartmental.model.Tenant;

import java.util.ArrayList;

public interface PollRepository {
    Poll post(Poll poll);
    void put(String topic, Tenant tenant, boolean isFirstSelected);
    ArrayList<Poll> get();
    boolean didTenantAttendToPoll(String topic, Tenant tenant);
}
