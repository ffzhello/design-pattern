package com.ffzhello.designpattern;

import com.ffzhello.designpattern.strategy.Order;
import com.ffzhello.designpattern.strategy.StrategyTest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author ff.zheng
 * @date 2020-05-05
 */
@SpringBootApplication
public class DesignPatternApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(DesignPatternApplication.class, args);

		Order order = new Order();
		order.setSource("pc");
		order.setDetail("detail");

		StrategyTest strategyTest = applicationContext.getBean(StrategyTest.class);
		strategyTest.handle(order);

	}
}
