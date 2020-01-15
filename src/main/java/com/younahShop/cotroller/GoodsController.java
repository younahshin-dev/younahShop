package com.younahShop.cotroller;

import java.util.ArrayList;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.younahShop.service.GoodsService;

@Controller
@EnableAutoConfiguration
public class GoodsController {
	
//	@RequestMapping(value="/")
//	public String goodsList() {
//		String param="";
//		ArrayList goodsList = GoodsService.getGoodsList(param);
//		return "themeleaf/index"; //main.jsp 호출
//	}
}
