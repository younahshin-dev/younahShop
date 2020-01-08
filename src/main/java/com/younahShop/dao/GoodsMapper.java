package com.younahShop.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Mapper
public class GoodsMapper implements YounahMapper {

	@Autowired
	private SqlSession sqlSession;

	@Override
	public List selectOne(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List findAll() {
		List resultList= (ArrayList)sqlSession.selectList("goodsMapper.selectGoodsList", "");
		return resultList;
	}

	@Override
	public void insert(Object object) {
		// TODO Auto-generated method stub
		
	}
	
	/*
	 * @Override public int count() { return sqlSession.selectOne("Account.count");
	 * }
	 * 
	 * @Override public long save(Account account) {
	 * sqlSession.insert("Account.save", account); return account.getId();
	 * //Generated Id }
	 * 
	 * @Override public int update(Account account) { return
	 * sqlSession.update("Account.update", account); }
	 * 
	 * @Override public int deleteById(Long id) { return
	 * sqlSession.delete("Account.deleteById", id); }
	 * 
	 * @Override public void deleteAll() { sqlSession.delete("Account.deleteAll"); }
	 * 
	 * @Override public List<Account> findAll() { return
	 * sqlSession.selectList("Account.findAll"); }
	 * 
	 * @Override public Account findById(Long id) { return
	 * sqlSession.selectOne("Account.findById", id); }
	 * 
	 * @Override public Account findByEmail(String email) { return
	 * sqlSession.selectOne("Account.findByEmail", email); }
	 */
}

