package com.edubridgr.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternSyntaxExceptionDemo {
	
	static  String regex="[";
	static String input ="i love mumbai";
	static String replace="cat";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Pattern pattern=Pattern.compile(regex);
			Matcher matcher=pattern.matcher(input);
		}
		catch(PatternSyntaxException e)
		{
			System.out.println("PatternSyntaxException");
			System.out.println(e.getDescription());
			System.out.println(e.getIndex());
			System.out.println(e.getMessage());
			System.out.println(e.getPattern());
		}

	}

}
