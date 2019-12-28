package com.younahShop.goods;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GoodsController {
	
	@RequestMapping("/")
	public String Hello() {
		return "main"; //main.jsp 호출
	}
}
