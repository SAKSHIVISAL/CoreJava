package com.edubridge.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		Map<Integer,Object>obj=new LinkedHashMap<>();
		obj.put(1, "shreyash");
		obj.put(2, "akshay");
		obj.put(3, "shifa");
		obj.put(1, null);
		System.out.println(obj);
		//to exact the element of map
		for(Map.Entry<Integer, Object> itr:obj.entrySet())
		{
			System.out.println(itr.getKey()+" "+itr.getValue());
		}
		
		

	}

}
