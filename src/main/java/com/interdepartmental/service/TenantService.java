package com.interdepartmental.service;

import com.interdepartmental.model.Tenant;

import java.util.ArrayList;

public interface TenantService {
    Tenant post(Tenant tenant);

    ArrayList<Tenant> get();
}
