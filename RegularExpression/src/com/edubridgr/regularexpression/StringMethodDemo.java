package com.edubridgr.regularexpression;

public class StringMethodDemo {

	public static void main(String[] args) {
		//split method
		String str="hello,world";
		String[] res=str.split(",");
		for(String itr:res)
		{
			System.out.print(itr+" ");
		}
		System.out.println();
		//Replace 0-all method
		String str1="there are 4 member in my family";
		String rev="\\d+";
		String res1=str1.replaceAll(rev, "four");
		System.out.println(res1);
		
		
	

	}

}
