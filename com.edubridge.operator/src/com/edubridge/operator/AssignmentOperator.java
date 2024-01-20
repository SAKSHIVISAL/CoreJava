package com.edubridge.operator;

import java.util.Scanner;

// assignment operator
public class AssignmentOperator {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println(a+=b);
		System.out.println(a-=b);
		System.out.println(a*=b);
		System.out.println(a/=b);
		s.close();

	}

}
