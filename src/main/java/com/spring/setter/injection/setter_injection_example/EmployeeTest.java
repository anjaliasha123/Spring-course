package com.spring.setter.injection.setter_injection_example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		Employee emp = (Employee)ctx.getBean("emp");
		System.out.println(emp.getId()+" is the ID");
		System.out.println(emp);

	}

}
