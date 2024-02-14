package com.edubridge.generices;
//generic class by passing single  type
class  Citizen<T>//T- type of data type
{
	//where  T define any kind of data type
    T str;
    T str1;
    void print(T str, T str1)//method
    {
    	this.str=str;
    	this.str1=str1;
    	System.out.println(str+"  "+str1);
    	
    }
    
}

public class GenericClassDemo {
//driver class
	public static void main(String[] args) {
	Citizen <String>c=new Citizen<>();
	c.print("mumbai", "Indian");

	}

}
