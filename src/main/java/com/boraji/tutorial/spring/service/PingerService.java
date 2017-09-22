package com.boraji.tutorial.spring.service;

import com.boraji.tutorial.spring.serviceEntities.Pinger;

import java.util.List;

public interface PingerService {
    List<Pinger> pingList();
    void update(Pinger p);
    void add(Pinger p);
    void alert(Pinger p);
}
