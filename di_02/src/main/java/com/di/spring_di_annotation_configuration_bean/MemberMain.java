package com.di.spring_di_annotation_configuration_bean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MemberMain {

	public static void main(String[] args) {
		// 스프링 컨테이너 생성
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		// 빈 가져오기
		Member member = context.getBean("member", Member.class);
		System.out.println(member);  // toString() 자동 호출
		member.showBMI();
		
		context.close();
	}

}
