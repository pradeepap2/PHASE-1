package com.javabasic;

public class Modifiers_Public_EX {

	//another class same package 
			public static void main(String[] args) {
				ModifiersEx obj=new ModifiersEx();
				obj.methodPublic();
				obj.methodDefault();
				//obj.methodPrivate();
				//if we execute line 10 we will get error
				obj.methodProtected();
			}
	
	}

//ModifiersEx class program executing in different class
//private cannot access outside the class 


