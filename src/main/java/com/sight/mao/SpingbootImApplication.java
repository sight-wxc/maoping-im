package com.sight.mao;

import com.github.pagehelper.autoconfigure.PageHelperAutoConfiguration;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class,PageHelperAutoConfiguration.class})
@MapperScan("com.sight.mao.modular.dao")
public class SpingbootImApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpingbootImApplication.class, args);
	}

}
