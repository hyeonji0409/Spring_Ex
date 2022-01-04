package com.di.no_spring_di_constructor;

public class NameMain {

	public static void main(String[] args) {
		// NameController에게 전달할 NameService 클래스 객체 생성
		NameService nameService = new NameService();
		
		// NameController에게 생성자를 통해 주입
		NameController controller = new NameController(nameService);
		controller.show("이몽룡");
		controller.show("adlf");
	}

}

/*
	NameMain 클래스에서 NameService 객체를 생성해서
	NameController 클래스의 인자로 전달(주입)하고
	NameController 클래스의 생성자에서 매개변수로 전달받아 NameService 객체를
	멤버변수에 넣고 초기화해서 사용
	
	이렇게 생성자를 이용하여 필욯나 객체를 넣어주는 Injection 방법을
	생성자를 이용한 의존성 주입(Dependency Injection)이라고 함
*/