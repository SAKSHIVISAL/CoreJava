package com.edubridge.synchronization;

public class MyThread extends Thread {
	Welcome w;

	public MyThread(Welcome w) {
		super();
		this.w = w;
	}
	public void run()
	{
		//to access  static method use class name.methodname();
		Welcome.display(getName());
	}

}
