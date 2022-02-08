package com.interfaces_and_collections;

public class Method_Call {

	
		int value=150;

		int operation(int value) {
			value =value*10/100;
			return(value);
		}

		public static void main(String args[]) {
			Method_Call d = new Method_Call();
			System.out.println("Before operation value of data is "+d.value);
			d.operation(100);
			System.out.println("After operation value of data is "+d.value);
			}
		}