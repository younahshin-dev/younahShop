package com.younahShop;

import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.younahShop.service.GoodsService;

import java.util.ArrayList;


@SpringBootApplication
@EnableWebMvc
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
//        ArrayList resultList = (ArrayList) GoodsService.getGoodsList(param);
//        modelAndView.addObject("GoodsList", resultList);
        
//        Log.debug("진입 1 : ", resultList);
        
        modelAndView.setViewName("index");
        return modelAndView;
    }

	public static void main(String[] args) {
		SpringApplication.run(YounahShopApplication.class, args);
	}
}
