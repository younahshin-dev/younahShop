package com.younahShop.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GoodsMapper {
	List selectGoodsList(Object obj);
}
