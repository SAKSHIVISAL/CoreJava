package com.edubridge.multithreadingdemo;

public class ThreadDemo extends Thread {
	public void run()
	{
		//current Thread() method will gives a current executing thread name
		System.out.println("thread isin running satate"+" "+Thread.currentThread());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ThreadDemo t1=new ThreadDemo();//
		//ThreadDemo t2=new ThreadDemo();//
		
		for(int i=1;i<4;i++)
		{
			ThreadDemo t1=new ThreadDemo();
			ThreadDemo t2=new ThreadDemo();
			t1.start();
			t2.start();
		//	System.out.println(t1.getName()+" "+t2.getName());
		}
		//when we call start() method automatically it calls to the run()method
		//t1.start();
		//t2.start();
		
		

	}

}
