package com.younahShop.dao;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.younahShop.mapper.GoodsMapper;

@Repository
public class GoodsDao {
	public static final Logger Log = null;
	
	@Autowired
	SqlSession sqlSession;
	
	public List selectGoodsList(Object obj) throws Exception {
		GoodsMapper gm = sqlSession.getMapper(GoodsMapper.class);
		return gm.selectGoodsList(obj);
	}

}

