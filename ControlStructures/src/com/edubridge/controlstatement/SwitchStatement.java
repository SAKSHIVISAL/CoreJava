package com.edubridge.controlstatement;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int week=s.nextInt();
		switch(week) {
		case 1:
			System.out.println("mon");
        break;		
		case 2:
			System.out.println("tue");
        break;		
		case 3:
			System.out.println("wed");
        break;		
		case 4:
			System.out.println("thu");
        break;	
        default:
        	System.out.println("noo week");
		}
	}

}
