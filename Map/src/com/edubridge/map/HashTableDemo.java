package com.edubridge.map;

import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {

	public static void main(String[] args) {
		Map<Integer,Object>obj=new Hashtable<>();
		obj.put(1, "abc");
		obj.put(2, "xyz");
		obj.put(3, "sak");
		obj.put(4, "vis");
		System.out.println(obj);//we cn't use key and value as'null' 
		//else  we will get a null pointer exception

	}

}
