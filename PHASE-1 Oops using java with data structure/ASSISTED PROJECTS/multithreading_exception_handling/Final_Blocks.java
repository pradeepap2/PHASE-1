package com.multithreading_exception_handling;

public class Final_Blocks {
	public static void main(String[] args)
    {
        int a=59,b=0,rs=0;
        try
        {
            rs = a / b;
        }
        catch(ArithmeticException Ex)
        {
            System.out.print("\n\tError : " + Ex.getMessage());
        }
        finally
        {
            System.out.print("\n\tThe result of the arithmetic operation is : " + rs);
        }
    }
}
