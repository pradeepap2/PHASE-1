package com.interfaces_and_collections;

public class Method_Overloading {
	public void area(int b,int h)
    {
         System.out.println("Area of Triangle : "+(0.5*b*h));
    }
    public void area(int r) 
    {
         System.out.println("Area of Circle : "+(3.14*r*r));
    }

    public static void main(String args[])
   {
    	Method_Overloading  ob=new Method_Overloading ();
       ob.area(50,20);
       ob.area(7);  
   }
}


