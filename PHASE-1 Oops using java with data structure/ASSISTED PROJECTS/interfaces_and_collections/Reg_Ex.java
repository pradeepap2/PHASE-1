package com.interfaces_and_collections;

import java.util.regex.*;

public class Reg_Ex {
	{
	String pattern = "[a-z]+";
	String check = "Regular Expressions";
	Pattern p = Pattern.compile(pattern);
	Matcher c = p.matcher(check);
	
	while (c.find())
     	System.out.println( check.substring( c.start(), c.end() ) );
	}
}

