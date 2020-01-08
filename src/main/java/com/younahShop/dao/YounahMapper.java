package com.younahShop.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface YounahMapper<T> {

    List<T> selectOne(long id);

    List<T> findAll();

    void insert(T object);
}