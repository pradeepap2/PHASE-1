package com.multithreading_exception_handling;

public class Array_Bounds {

	public static void main(String args[]) 
    {
        int[] array = new int[6];
        try 
        {
            array[8] = 6;
        }
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Array index is out of bounds!"); 
        }
        finally 
        {
            System.out.println("The Size of the array is: " + array.length);
        }
    }
}