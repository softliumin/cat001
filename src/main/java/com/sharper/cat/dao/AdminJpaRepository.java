package com.sharper.cat.dao;


import com.sharper.cat.bean.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminJpaRepository extends JpaRepository<Admin,Integer> {


}
