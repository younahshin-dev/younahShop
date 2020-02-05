package com.younahShop;


import com.younahShop.service.GoodsService;

import java.util.ArrayList;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SpringBootApplication
@MapperScan(basePackages="com.younahShop.dao")
public class YounahShopApplication {

		Logger Log;
//    @RequestMapping("/")
//    public String welcome() {
//        return "themeleaf/index";
//    }
    
    @RequestMapping("/index")
    public ModelAndView index () {
        ModelAndView modelAndView = new ModelAndView();
        
        String param = "";
        // 로직 수행 
        ArrayList resultList = (ArrayList) GoodsService.getGoodsList(param);
        modelAndView.addObject("GoodsList", resultList);
        
        
        modelAndView.setViewName("themeleaf/index");
        return modelAndView;
    }

	public static void main(String[] args) {
		SpringApplication.run(YounahShopApplication.class, args);
	}
	
	@Bean
	public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
		
		SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
		
		sessionFactory.setDataSource(dataSource);
		sessionFactory.setMapperLocations(
				new PathMatchingResourcePatternResolver().getResources("classpath:mapper/*.xml"));
		sessionFactory.setConfigLocation(new ClassPathResource("mybatis-config.xml"));
		return sessionFactory.getObject();
	}
	
}
