package com.danni;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
	}

	@RequestMapping(value = "/call",method ={RequestMethod.POST,RequestMethod.GET})
	public void call(String str) {
		System.out.println(str);
		// 修改打印字符，不重启不生效。增加spring-boot-devtools，只是自动重启tomcat而已。
		System.out.println("stop");
	}
	
	
}
