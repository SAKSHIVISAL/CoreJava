package com.edubridge.compileinput;
 import java.util.Scanner;

public class IntegerDataType {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		byte num =s.nextByte();
		short num2 =s.nextShort();
		int num3=s.nextInt();
		long num4=s.nextLong();
		System.out.println("The byte value is :"+num);
		System.out.println("The byte value is :"+num2);
		System.out.println("The byte value is :"+num3);
		System.out.println("The byte value is :"+num4);
		s.close();
		

	}

}
