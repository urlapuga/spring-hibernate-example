package com.boraji.tutorial.spring.dao;

import com.boraji.tutorial.spring.entity.User;
import com.boraji.tutorial.spring.serviceEntities.Companies;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;


@Repository
public class CompaniesDaoImpl implements CompaniesDao{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public boolean create(Companies c) {
        sessionFactory.getCurrentSession().save(c);
        return true;
    }

    @Override
    public List<Companies> read() {
        @SuppressWarnings("unchecked")

        TypedQuery<Companies> query=sessionFactory.getCurrentSession().createQuery("from Companies ");
            //    Query query=sessionFactory.getCurrentSession().createNativeQuery("SELECT * from companies");


        return query.getResultList();
    }

    @Override
    public boolean update(Companies o) {
        return false;
    }

    @Override
    public boolean delete(Companies o) {
        return false;
    }
}
