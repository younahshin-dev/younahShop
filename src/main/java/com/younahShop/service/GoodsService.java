package com.younahShop.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.younahShop.dao.GoodsMapper;

@Service
public class GoodsService {
	static Logger Log;
	@Autowired
	static GoodsMapper goodsMapper;
	
	public static List getGoodsList(String param) {
		 System.out.println("진입");
		Object obj = new Object();
		List resultList = goodsMapper.selectGoodsList(obj);
		return resultList;
		
	}

}
