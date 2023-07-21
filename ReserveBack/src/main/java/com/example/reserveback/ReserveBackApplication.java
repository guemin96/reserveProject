package com.example.reserveback;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan(basePackages = {"com.**.mapper"})
@ComponentScan(basePackages = {"com.web.reserve.mapper","com.web.reserve.controller","com.web.reserve.service"})
public class ReserveBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReserveBackApplication.class, args);
	}

}
