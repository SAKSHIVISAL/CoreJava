package com.edubridge.generices;

import java.util.ArrayList;
import java.util.List;

public class GenericesAdvantageDemo {

	public static void main(String[] args) {
		//1. typr-safety
	List<String>obj=new ArrayList<>();
	obj.add("sakshi");
	obj.add("22");
	//obj.add(11);//3.compile time checking
	System.out.println(obj);
	
	//2.type-casting is not required
	List<String>obj1=new ArrayList<>();
	obj1.add("sakshi v");//o index
	obj1.add("visal");//1 index
	//without generic type casting is required
	//String str1=(String) obj1.get(0)
	String str1=obj1.get(0);
	System.out.println(str1);

	}

}
