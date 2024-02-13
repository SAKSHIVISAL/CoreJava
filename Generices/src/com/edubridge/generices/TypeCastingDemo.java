package com.edubridge.generices;

public class TypeCastingDemo {

	public static void main(String[] args) {
		//implicite type casting or widening
		//smaller to larger data type size
		char c='b';
		int num=c;
		System.out.println(num);
		
		//explicit or narrowing type casting
		//larger to smaller data type size
		int num1=36;
		char x=(char)num1;
		System.out.println(x);
	}

}
