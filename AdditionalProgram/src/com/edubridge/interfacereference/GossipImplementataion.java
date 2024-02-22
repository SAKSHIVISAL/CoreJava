package com.edubridge.interfacereference;
//program to demonstrate on references to a static method
public class GossipImplementataion {
	//static method
	public static void classroomGossip()
	{
		System.out.println("implementing a functional references");
		
	}
	public static void main(String[] args) {
	Gossip g=GossipImplementataion ::classroomGossip;
	g.talk();
	}

}
