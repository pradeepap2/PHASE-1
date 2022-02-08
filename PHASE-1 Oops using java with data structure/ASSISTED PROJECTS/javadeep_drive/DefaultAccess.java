package com.javadeep_drive;

public class DefaultAccess {
	void display() 
	 { 
	 System.out.println("You are using defalut access specifier"); 
	 } 
public static void main(String[] args) {

	DefaultAccess obj = new DefaultAccess(); 
	 obj.display(); 
	}

}
