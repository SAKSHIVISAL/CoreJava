package com.edubridge.map;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
	SortedMap<String,Float>obj=new TreeMap<>();
	obj.put("shreya",88.8f);
	obj.put("sakshi",75.5f);
	obj.put("shifaa",70.5f);
	for(Map.Entry<String, Float>iyr:obj.entrySet())
	{
		System.out.println(iyr.getKey()+" "+iyr.getValue());
	}
	

	}

}
