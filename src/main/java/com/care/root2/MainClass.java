package com.care.root2;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		String path = "classpath:applicationsST.xml";
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(path);
		STBean stBean = ctx.getBean("stb", STBean.class);
		
		//STBean stBean = new STBean();
		//stBean.setName("홍길동111111");
		//stBean.setAge(20111111);
		
		//stBean.setSt(new Student());
		stBean.namePrint();
		stBean.agePrint();
	
	}
}
