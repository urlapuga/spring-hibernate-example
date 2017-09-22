package com.boraji.tutorial.spring.service;

import com.boraji.tutorial.spring.dao.Crud;
import com.boraji.tutorial.spring.serviceEntities.Companies;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public interface CompaniesService{

    @Transactional
    boolean create(Companies companies);

    @Transactional(readOnly = true)
    List<Companies> read();

    @Transactional
    boolean update(Companies companies);

    @Transactional
    boolean delete(Companies companies);
}
