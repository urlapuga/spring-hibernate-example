package com.boraji.tutorial.spring.service;

import com.boraji.tutorial.spring.dao.CompaniesDao;
import com.boraji.tutorial.spring.serviceEntities.Companies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CompaniesServiceImpl implements CompaniesService {

    @Autowired
    private CompaniesDao companiesDao;

    @Transactional
    @Override
    public boolean create(Companies companies) {
        companiesDao.create(companies);
        return false;
    }

    @Transactional(readOnly = true)
    @Override
    public List<Companies> read() {
        return companiesDao.read();
    }

    @Transactional
    @Override
    public boolean update(Companies companies) {
        return false;
    }

    @Transactional
    @Override
    public boolean delete(Companies companies) {
        return false;
    }
}
