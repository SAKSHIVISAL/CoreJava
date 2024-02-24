package com.edubridge.assignment;

import java.util.Scanner;
//given string is vowel or not
public class StringVowelsAndConstants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		char c=s.next().charAt(0);
		if(c=='a'|| c=='e'||c=='i'||c=='o'||c=='u')
		System.out.println("it is vowel");
		else
			System.out.println("it is not vowel");

	}

}
