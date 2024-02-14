package com.edubridge.generices;
class Dictionary<K,V>{
	K key;
	V value;
	
	void print(K key, V value)
	{
		this.key=key;
		this.value=value;
		System.out.println(key+" "+value);
	}
}

public class GenericesClassForMap {

	public static void main(String[] args) {
		Dictionary< Character,String>obj=new Dictionary<>();
		obj.print('c', "cyclone");
		obj.print('d', "dynamic");

	}

}
