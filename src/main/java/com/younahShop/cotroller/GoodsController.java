package com.younahShop.cotroller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.younahShop.service.GoodsService;

@Controller
public class GoodsController {
	
	@RequestMapping(method = RequestMethod.POST, value="/")
	public String goodsList() {
		String param="";
		ArrayList goodsList = GoodsService.getGoodsList(param);
		return "main"; //main.jsp 호출
	}
}
