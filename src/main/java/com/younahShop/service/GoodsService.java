package com.younahShop.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.younahShop.dao.GoodsDao;

@Service
@Transactional
public class GoodsService {
	static Logger Log;
	@Autowired
	static GoodsDao goodsDao;
	
	public static List getGoodsList(String param) {
		 System.out.println("진입");
		Object obj = new Object();
		List resultList = null;
		try {
			resultList = goodsDao.selectGoodsList(obj);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resultList;
		
	}

}
