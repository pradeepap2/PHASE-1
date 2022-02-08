package com.interfaces_and_collections;

public class Method_Example {

	
		public int multipynumbers(int a,int b) {
			int z=a*b;
			return z;
		}

		public static void main(String[] args) {

			Method_Example  b=new Method_Example ();
			int ans= b.multipynumbers(7,6);
			System.out.println("Multipilcation is :"+ans);
			}
}
