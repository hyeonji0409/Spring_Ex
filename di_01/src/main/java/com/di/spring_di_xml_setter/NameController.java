package com.di.spring_di_xml_setter;

public class NameController {
	NameService nameService;
	
	// NameService 객체를 new 연산자를 통해 직접 만들지 않고
	// 생성자를 통해 객체를 전달받음
	// 의미 : 생성자를 통해 외부에서 주입 받음 (injection)
	
	public void setNameService(NameService nameService) {
		this.nameService = nameService;
	}
	
	public void show(String name) {
		System.out.println("NameController : " + nameService.showName(name));
	}
}

