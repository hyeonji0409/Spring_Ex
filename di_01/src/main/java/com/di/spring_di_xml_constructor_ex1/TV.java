package com.di.spring_di_xml_constructor_ex1;

public class TV {
	Speaker speaker;
	
	public TV(Speaker speaker) {
		// 전달받은 값으로 멤버변수 초기화
		this.speaker = speaker;
	}
	
	public void volumeUp() {
		speaker.volumeUp();
	}
	
	public void volumeDown() {
		speaker.volumeDown();
	}

}
