package com.boraji.tutorial.spring.dao;

import java.util.List;

public interface Crud<T> {
    void create(T t);
    List<T> read();
    void update(T t);
    void delete(T t);
}
