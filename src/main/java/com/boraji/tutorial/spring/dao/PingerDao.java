package com.boraji.tutorial.spring.dao;

import com.boraji.tutorial.spring.serviceEntities.Pinger;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.util.List;


public class PingerDao extends CrudImpl<Pinger> {
  //  Session session = super.getSessionFactory().getCurrentSession();

   // public List<Pinger> getAll() {

   //     return session.createQuery("from Pinger").getResultList();
  //  }
}
