package com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.UserBean;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

		applicationContext.registerShutdownHook();
		System.out.println(applicationContext);// null | hashCode

//        UserBean user = (UserBean)applicationContext.getBean("userBean");

		UserBean user = applicationContext.getBean("userBean", UserBean.class);
		System.out.println(user);
		UserBean user1 = applicationContext.getBean("userBean", UserBean.class);
		System.out.println(user1);
		UserBean user2 = applicationContext.getBean("userBean", UserBean.class);
		System.out.println(user2);
		UserBean user3 = applicationContext.getBean("userBean", UserBean.class);
		System.out.println(user3);

		System.out.println(user.getFirstName());

	}
}
