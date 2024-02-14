package com.edubridgr.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="the book is of 50  Rs";
		String regex=".*s";
		
		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(input);
		
		
		System.out.println(m.matches());
	}

}
