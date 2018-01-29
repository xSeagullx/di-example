package com.xseagullx.angel.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyOtherConfiguration {
	@Bean String hello() {
		return "hello world";
	}
}
