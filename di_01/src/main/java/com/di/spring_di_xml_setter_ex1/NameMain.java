package com.di.spring_di_xml_setter_ex1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.di.no_spring_di_setter.NameController;
import com.di.no_spring_di_setter.NameService;

public class NameMain {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new GenericXmlApplicationContext("application-context4.xml");
		
		Speaker speaker = new Speaker();
		TV tv = new TV();
		
		// Setter 메소드를 통해 nameService 객체 전달(주입: Injection)
		tv.setSpeaker(speaker);
		tv.volumeUp();
		tv.volumeDown();

	}

}
