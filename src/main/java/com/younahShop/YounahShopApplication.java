package com.younahShop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SpringBootApplication
public class YounahShopApplication {


//    @RequestMapping("/")
//    public String welcome() {
//        return "themeleaf/index";
//    }
    
    @RequestMapping("/")
    public ModelAndView index () {
        ModelAndView modelAndView = new ModelAndView();
        // 로직 수행 

        modelAndView.setViewName("index");
        return modelAndView;
    }

	public static void main(String[] args) {
		SpringApplication.run(YounahShopApplication.class, args);
	}
}
