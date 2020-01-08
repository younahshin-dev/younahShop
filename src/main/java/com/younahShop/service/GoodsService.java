package com.younahShop.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.younahShop.dao.GoodsMapper;

@Service
public class GoodsService {
	
	@Autowired
	static GoodsMapper goodsMapper;
	
	@RequestMapping
	public static List getGoodsList(String param) {
		List resultList = goodsMapper.findAll();
		return resultList;
		
	}

}
