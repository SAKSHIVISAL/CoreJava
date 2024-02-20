package com.edubridge.synchronization;
//thread 2
public class ThreadTwo extends Thread {
	//reference object of synchronized method class to access print()
	SynchronizedMethod m2;

	public ThreadTwo(SynchronizedMethod m2) {
		super();
		this.m2 = m2;
	}
	public void run()
	{
		m2.print(5);
	}
}
