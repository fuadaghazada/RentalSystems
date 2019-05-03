package com.interdepartmental.service;

import com.interdepartmental.model.Announcement;
import com.interdepartmental.model.Tenant;
import com.interdepartmental.repository.TenantRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TenantServiceImpl implements TenantService {
    private TenantRepository tenantRepository;

    public TenantServiceImpl(TenantRepository tenantRepository){
        this.tenantRepository = tenantRepository;
    }

    @Override
    public Tenant post(Tenant tenant){
        return tenantRepository.post(tenant);
    }

    @Override
    public ArrayList<Tenant> get(){
        return tenantRepository.get();
    }
}
