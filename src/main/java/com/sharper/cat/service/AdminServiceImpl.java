package com.sharper.cat.service;

import java.util.List;

import com.sharper.cat.bean.Admin;
import com.sharper.cat.dao.AdminJpaRepository;
import com.sharper.cat.dao.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AdminServiceImpl implements  AdminService{

    @Autowired
    private AdminJpaRepository adminJpaRepository;
    @Autowired
    private AdminRepository adminRepository;


    @Override
    public List<Admin> findAll() {
        List<Admin> list=  adminJpaRepository.findAll();
        return list;
    }
}
