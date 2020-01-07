package com.younahShop.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class GoodsRepository  {

	@Autowired
    JdbcTemplate jdbcTemplate;

	public List selectGoods(String param) {
		ArrayList result = null;
		return result;
		
	}
}
