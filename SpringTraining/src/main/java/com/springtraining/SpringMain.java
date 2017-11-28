package com.springtraining;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.springtraining.VO.AddressVO;
import com.springtraining.controller.AddressController;

@SpringBootApplication
@EnableWebMvc
//@EnableEurekaServer
public class SpringMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(SpringMain.class, args);
		AddressVO address = new AddressVO();
		AddressController controller = new AddressController();
		
		for(int i=0;i<2000;i++) {
		controller.insertJunk(address);
		}
	}

}
