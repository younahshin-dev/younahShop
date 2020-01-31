package com.younahShop.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface YounahMapper<T> {

	int selectGoodsListCnt() throws Exception;
	
	List<T> selectGoodsList(String qId, T obj) throws Exception;
}