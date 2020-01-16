package com.younahShop.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.slf4j.Logger;

@Mapper
public interface GoodsMapper {

	public static final Logger Log = null;


	public List selectGoodsList();

	  
	}

