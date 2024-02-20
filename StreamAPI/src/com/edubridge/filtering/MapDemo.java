package com.edubridge.filtering;

import java.util.Arrays;
import java.util.List;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>obj=Arrays.asList("shifa","sakshi","shreyash");
		obj.stream().map(i ->i.toUpperCase()).forEach(i->System.out.print(i+" "));

	}

}
