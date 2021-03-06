package com.di.spring_di_annotation_component2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class NameMain {

	public static void main(String[] args) {
		AbstractApplicationContext context = new GenericXmlApplicationContext("application-context3.xml");
		
		NameController controller = context.getBean("nameController", NameController.class);
		controller.show("이민혁");
		context.close();

	}

}
