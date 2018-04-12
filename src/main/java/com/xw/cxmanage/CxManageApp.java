package com.xw.cxmanage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ImportResource;

/**
 * Hello world!
 *
 */
@ImportResource("classpath:/META-INF/spring/application*.xml")
@SpringBootApplication(scanBasePackages={"com.xw.cxmanage"})
public class CxManageApp extends SpringBootServletInitializer{
    public static void main( String[] args )
    {
       SpringApplication.run(CxManageApp.class, args);
    }
}
