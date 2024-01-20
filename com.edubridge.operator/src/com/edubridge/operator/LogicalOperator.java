package com.edubridge.operator;

import java.util.Scanner;
//logical operator

public class LogicalOperator {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println(a==3 && b<a);
		System.out.println(a==3 || b<a);
		System.out.println(!(a<=b));
		s.close();
				
	}

}
