package com.jjp.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.ulisesbocchio.jasyptspringboot.environment.StandardEncryptableEnvironment;

@Configuration
@MapperScan(basePackages = "com.jjp.admin") 
@SpringBootApplication(scanBasePackages={"com.jjp.admin"})
@PropertySource({ "classpath:/config/application-${spring.profiles.active}.properties"
				})
public class AdminVueApplication {
	private static Logger log = LoggerFactory.getLogger(AdminVueApplication.class);

	public static void main(String[] args) {
		log.info("####################[ JJPlatformApplication Start ]####################");
//      SpringApplication.run(JJPlatformApplication.class, args);
  	// 사용자 정의를 사용한 초기 초기화 속성 암호화
      new SpringApplicationBuilder().environment(new StandardEncryptableEnvironment()).sources(AdminVueApplication.class).run(args);
	}

}
