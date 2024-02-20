package com.edubridge.synchronization;

public class StsticSynchronizationExecutor {

	public static void main(String[] args) {
		Flat f=new Flat();
		BlockA  b = new BlockA(f);
		BlockA  b1 = new BlockA(f);
		b.start();
		b1.start();
		

	}

}
