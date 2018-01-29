package com.xseagullx.angel.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);

		ElizabethTower tower = context.getBean(ElizabethTower.class);
		Integer answer = context.getBean(Integer.class);
		String helloWorld = context.getBean(String.class);
		tower.be();
		context.close();
	}
}
