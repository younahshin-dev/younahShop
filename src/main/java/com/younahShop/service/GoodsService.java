package com.younahShop.service;

import java.util.List;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.younahShop.dao.GoodsDao;

@Service
@Transactional
public class GoodsService {
	static Logger Log;
	@Autowired
	private GoodsDao goodsDao;
	
	public List getGoodsList(String param) {
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
