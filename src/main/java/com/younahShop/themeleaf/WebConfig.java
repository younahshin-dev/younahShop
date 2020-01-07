package com.younahShop.themeleaf;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
//@EnableWebMvc
@ComponentScan("com.younahShop")
public class WebConfig extends WebMvcConfigurationSupport {

	    @Override
	    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//	    	 registry.addResourceHandler("/rss/**").addResourceLocations("/rss/");
	        registry.addResourceHandler(
	                "/css/**",
	                "/fonts/**",
	                "/images/**",
	                "/js/**",
	                "/lib/**",
	                "/php/**",
	                "/webfonts/**")
	                .addResourceLocations(
	                        "/rss/css/",    
	                        "/rss/fonts/",  
	                        "/rss/images/", 
	                        "/rss/js/",     
	                        "/rss/lib/",    
	                        "/rss/php/",    
	                        "/rss/webfonts/");
	    }

}
