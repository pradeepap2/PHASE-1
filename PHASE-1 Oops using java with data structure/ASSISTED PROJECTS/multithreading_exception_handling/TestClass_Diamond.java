package com.multithreading_exception_handling;

interface First 
{  
    default void show() 
    { 
        System.out.println("Default First"); 
    } 
} 
interface Second 
{  
    default void show() 
    { 
        System.out.println("Default Second"); 
    } 
}  

public class TestClass_Diamond implements First, Second  {



    public void show() 
    {  
        First.super.show(); 
        Second.super.show(); 
    } 
    public static void main(String args[]) 
    { 
    	TestClass_Diamond ob = new TestClass_Diamond(); 
        ob.show(); 
    } 
}

	
