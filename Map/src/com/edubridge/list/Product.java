package com.edubridge.list;

import java.util.ArrayList;
import java.util.Collections;

public class Product implements Comparable<Product>{
	
	private String pname;
	private int price;
	private int rating;

	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		return this.price -o.price;
	}

	
	
	
	public Product(String pname, int price, int rating) {
		super();
		this.pname = pname;
		this.price = price;
		this.rating = rating;
	}




	public String getPname() {
		return pname;
	}




	public void setPname(String pname) {
		this.pname = pname;
	}




	public int getPrice() {
		return price;
	}




	public void setPrice(int price) {
		this.price = price;
	}




	public int getRating() {
		return rating;
	}




	public void setRating(int rating) {
		this.rating = rating;
	}




	public static void main(String[] args) {
	ArrayList<Product>list=new ArrayList<Product>();
	list.add(new Product ("speaker",4,1));
	list.add(new Product ("bt",4,2));
	     Collections.sort(list);
	     for(Product p1:list)
	     {
	    	 System.out.println("product name:" +p1.getPname()+"product price"+p1.price+"product rating"+p1.rating);
	     }
	     System.out.println("Comparing rating by comparator");
	     RatingCompare r=new RatingCompare();
	     Collections.sort(list,r);
	     for(Product pp:list) {
	    	 System.out.println("product name"+pp.pname+pp.price+pp.rating);
	     }
	}





}
