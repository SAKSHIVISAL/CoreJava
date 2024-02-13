package com.edubridge.equalmethod;

public class Executor {

	public static void main(String[] args) {
		String str="edubridge";
		String str1="edubridge";
		System.out.println(str.equals(str1));
		System.out.println(str.hashCode());
		System.out.println(str1.hashCode());
		
		
		String str2="edubridge";
		String str3="edubridge";
		System.out.println(str2.equals(str3));
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		
		
		
		
		Site s=new Site("edubridge",1);
		Site s1=new Site("edubridge",1);
		System.out.println(s.equals(s1));
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		


	}

}
