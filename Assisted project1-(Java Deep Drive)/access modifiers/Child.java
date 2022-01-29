package com.modifiersEx_Another;

import com.javabasic.ModifiersEx;

public class Child extends ModifiersEx {

	//child class different package 
	public static void main(String[] args) {
		Child obj=new Child();
		
		obj.methodPublic();
		obj.methodProtected();

		//obj.methodDefault();
		//obj.methodPrivate();
		//if we execute 14,15 line we will get error
		//child will be able to access protected and public properties
	}
}
	


