package com.interdepartmental.repository;

import com.interdepartmental.model.Tenant;

import java.util.ArrayList;

public interface TenantRepository {
    Tenant post(Tenant tenant);

    ArrayList<Tenant> get();
}
