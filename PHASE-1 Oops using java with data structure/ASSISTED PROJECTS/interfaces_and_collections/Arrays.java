package com.interfaces_and_collections;

public class Arrays {

public static void main(String[] args) {

//single-dimensional array
int a[]= {5,10,15,20,25};
for(int i=0;i<5;i++) {
System.out.println("Elements of array a: "+a[i]);
}


//multidimensional array
int[][] b = {
            {9, 8, 7, 6}, 
            {3, 4, 9} };
      
      System.out.println("\nLength of row 1: " + b[0].length);
      }

}

