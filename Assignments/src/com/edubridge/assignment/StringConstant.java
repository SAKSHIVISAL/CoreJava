package com.edubridge.assignment;

import java.util.Scanner;

public class StringConstant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.next();
		str.toLowerCase();
		int vowelcount=0;
		int constantcount=0;
		for(int i=0;i<str.length();i++)
		{
		  char c=str.charAt(i);
		  if(c=='a'|| c=='e'||c=='i'||c=='o'||c=='u')
		  {
			  vowelcount++;
		  }
		  else
		  {
			  constantcount++;
		  }
		}
		System.out.println("is vowel");
		System.out.println("is constant");
		
		

	}

}
