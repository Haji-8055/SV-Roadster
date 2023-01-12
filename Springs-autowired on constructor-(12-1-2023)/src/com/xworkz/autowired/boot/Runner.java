package com.xworkz.autowired.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.autowired.component.Engine;
import com.xworkz.autowired.component.Ghost;
import com.xworkz.autowired.component.NewsPaper;
import com.xworkz.autowired.component.Snake;
import com.xworkz.autowired.configuration.SpringConfiguration;

public class Runner {

	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(SpringConfiguration.class);

		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));

		Engine run = container.getBean(Engine.class);
		System.out.println("========Details of engine=========");
		System.out.println(run);

		System.out.println("=========Details of snake==========");
		Snake s = container.getBean(Snake.class);
		System.out.println(s);

		NewsPaper news = container.getBean("newsPaper", NewsPaper.class);
		System.out.println("==========Details of newspaper==========");
		System.out.println(news);

		Ghost ghost = container.getBean(Ghost.class);
		System.out.println("==========Details of ghost==========");
		System.out.println(ghost);
	}

}