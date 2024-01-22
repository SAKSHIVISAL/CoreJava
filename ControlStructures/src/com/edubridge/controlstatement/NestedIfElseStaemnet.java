package com.edubridge.controlstatement;

import java.util.Scanner;

public class NestedIfElseStaemnet {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int age=s.nextInt();
		int weight=s.nextInt();
		if(age>=12)
		{
			if((weight>=45 && weight <=110) || weight>=110)
			{
				System.out.println("eligiable");
			}
			else
			{
				System.out.println("not eligiable");
			}
		}
		else
		{
			System.out.println("not eligiable");
		}

	}

}
