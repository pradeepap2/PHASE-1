package com.multithreading_exception_handling;

public class MyException extends Exception {
	//public class egException extends Exception{
		   String str1;
		   MyException(String str2) {
			str1=str2;
		   }
		   public String toString(){ 
			return ("Exception Occurred: "+str1) ;
		   }
public static void main(String args[]){
			try{
				System.out.println("Starting of try block");
				// I'm throwing the custom exception using throw
				throw new MyException("This is an error Message");
			}
			catch(MyException exp){
				System.out.println("Catch Block") ;
				System.out.println(exp) ;
			}
		   }
}
