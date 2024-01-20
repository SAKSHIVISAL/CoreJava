package com.edubridge.operator;

public class IncrementAndDecreamentOperator {

	public static void main(String[] args) {
		int a=6,b=3;
		int res=a++ - ++b;
		int res2=--a+ b--;
		
		System.out.println(a);
		System.out.println(b);

	}

}
