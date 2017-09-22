package com.boraji.tutorial.spring.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class CrudImpl<T> implements Crud<T> {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void create(T t) {
        sessionFactory.getCurrentSession().save(t);
    }
//TODO:implement method read in dao.CrudImpl
    @Override
    public List<T> read() {
        return sessionFactory.getCurrentSession().createQuery("from Companies ").getResultList();
    }

    @Override
    public void update(T t) {
        sessionFactory.getCurrentSession().update(t);
    }

    @Override
    public void delete(T t) {
        sessionFactory.getCurrentSession().delete(t);
    }
}
