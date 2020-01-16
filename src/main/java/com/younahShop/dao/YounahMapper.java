package com.younahShop.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
public interface YounahMapper<T> {

	int selectBoardListCnt() throws Exception;
	
	List<T> selectBoardList() throws Exception;
}