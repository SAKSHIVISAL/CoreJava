package com.edubridge.generices;

public class GenericMethodDemo {
	public static <E> void accept(E[]arr)
	{
		for(E itr:arr)
		{
			System.out.print(itr+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Integer[]arr1= {22,34,45,56};
		String []arr2= {"sak","visal","shreyash","shifa"};
		System.out.print("First array is:");
		GenericMethodDemo.accept(arr1);
		
		
		System.out.print("Second array is:");
		GenericMethodDemo.accept(arr2);

	}

}
