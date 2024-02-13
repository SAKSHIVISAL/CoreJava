package com.edubridge.assignment;

import java.util.Scanner;
public class FloatInput {

	public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	float x=scan.nextFloat();
	System.out.print("%.2f",x);
	scan.close();
	

	}
}
