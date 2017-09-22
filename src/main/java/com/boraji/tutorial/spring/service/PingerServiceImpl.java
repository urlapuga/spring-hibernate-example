package com.boraji.tutorial.spring.service;

import com.boraji.tutorial.spring.dao.PingerDao;
import com.boraji.tutorial.spring.serviceEntities.Pinger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class PingerServiceImpl implements PingerService {

    private PingerDao pingerDao = new PingerDao();
    @Transactional
    @Override
    public List<Pinger> pingList() {
        return null;
    }

    @Override
    public void update(Pinger p) {

    }

    @Override
    public void add(Pinger p) {
        pingerDao.create(p);
    }

    @Override
    public void alert(Pinger p) {

    }
}
