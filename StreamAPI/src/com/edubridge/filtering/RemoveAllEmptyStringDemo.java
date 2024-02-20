package com.edubridge.filtering;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveAllEmptyStringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>obj=Arrays.asList("","sak" ,"","visal");
		List<String>res=obj.stream().filter(i->!i.isEmpty()).collect(Collectors.toList());//remove all the empty string
		//List<String>res=obj.stream().filter(i->i.isEmpty()).collect(Collectors.toList());
		System.out.println(res);
		

	}

}
