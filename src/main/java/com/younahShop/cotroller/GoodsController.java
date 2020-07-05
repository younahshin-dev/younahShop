package com.younahShop.cotroller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.younahShop.service.GoodsService;

@Controller
@EnableAutoConfiguration
public class GoodsController {
	
	@Autowired
	GoodsService goodsService;
	
	@RequestMapping(value="/index")
	public String goodsList() {
		String param="";
		ArrayList goodsList = (ArrayList) goodsService.getGoodsList(param);
		return "themeleaf/index"; //main.jsp 호출
	}
}
