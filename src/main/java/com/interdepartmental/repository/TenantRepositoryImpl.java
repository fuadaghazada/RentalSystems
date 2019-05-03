package com.interdepartmental.repository;

import com.interdepartmental.model.Tenant;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class TenantRepositoryImpl implements TenantRepository {
    private ArrayList<Tenant> tenants = new ArrayList<>();

    @Override
    public Tenant post(Tenant tenant){
        tenants.add(tenant);
        return tenant;
    }

    @Override
    public ArrayList<Tenant> get(){
        return tenants;
    }
}
