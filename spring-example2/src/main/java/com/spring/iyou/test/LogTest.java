package com.spring.iyou.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * <B>主类名称：</B>LogTest<BR>
 * <B>概要说明：</B><BR>
 *
 * @author SunJing
 * @since 2023-07-01 18:22
 */
public class LogTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println(context.getBean(AppConfig.class));
	}


	static class AppConfig {

	}
}
