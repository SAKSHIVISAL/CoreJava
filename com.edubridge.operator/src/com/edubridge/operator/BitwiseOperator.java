package com.edubridge.operator;

import java.util.Scanner;
//Bitwise and shift operator

public class BitwiseOperator {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println(a&b);
		System.out.println(a|b);
		System.out.println(a^b);
		System.out.println(a<<b);
		System.out.println(a>>b);
		s.close();
	}

}
