package com.edubridge.typeofvariables;

public class TypeOfVariables {
	float salary=7800.66f;
	static int x=1-0;
	String display()
	{
		char x='z';
		System.out.println(x);
		return"local variable";
	}

	public static void main(String[] args) {
		System.out.println(x);
		TypeOfVariables obj=new TypeOfVariables();
		System.out.println(obj.display());
		System.out.println(obj.salary);

	}

}
