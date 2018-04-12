package com.xw.cxmanage;

import org.springframework.boot.context.embedded.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;

import com.xw.cxmanage.flter.MySiteMeshFilter;


/**
 * Created by shenzhongwu on 2018年4月11日
 */
@Configuration
public class WebConfig{
	 	@Bean
	    public FilterRegistrationBean filterRegistrationBean() {
	        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
	        MySiteMeshFilter siteMeshFilter = new MySiteMeshFilter();  
	        filterRegistrationBean.setFilter(siteMeshFilter);
	        filterRegistrationBean.addUrlPatterns("/*");
	        filterRegistrationBean.setEnabled(true);
	        return filterRegistrationBean;
	    }
}
