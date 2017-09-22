package com.boraji.tutorial.spring.dao;

import java.util.List;

public interface Crud<T> {
    boolean create(T t);
    List<T> read();
    boolean update(T t);
    boolean delete(T t);
}
