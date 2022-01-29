package com.typecasting;

public class Implicit_TypeCasting {
//this is also called as widening type casting
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			byte a= 17;

			System.out.println("Byte "+a);

			short b= 1;
			System.out.println("Converted Byte to short "+b);

			int c=2;
			System.out.println("Converted Short to int "+c);

			int d=3;
			System.out.println("Converted Byte to int "+d);

			float e=4.8f;
			System.out.println("Converted Int to float "+e);

			double f=9.88888;
			System.out.println("converted Float to double "+f);

			double g=d;
			System.out.println("Converted int to double "+g);
		}
	

	}


