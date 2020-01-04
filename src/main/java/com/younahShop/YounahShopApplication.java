package com.younahShop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication
public class YounahShopApplication {


    @RequestMapping("/")
    public String welcome() {
        return "themeleaf/index";
    }

	public static void main(String[] args) {
		SpringApplication.run(YounahShopApplication.class, args);
	}

}
