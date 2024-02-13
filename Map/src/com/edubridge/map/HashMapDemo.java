package com.edubridge.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
	Map<Integer,String>obj=new HashMap<>();
	obj.put(1, "shreyash");
	obj.put(2, "akshay");
	obj.put(3, "shifa");
	obj.put(1, null);//it contains null
	System.out.println(obj);
	System.out.println(obj.containsKey(1));
	obj.remove(1);//it removes entire entries of key 1
	System.out.println(obj);

	}

}
