package com.edubridge.interfacereference;
//programto demonstrate on reference to a instance mathod
public class LearnerImplementation {
	
	public void learnMockito()
	{
		System.out.println("Mockito with Junit 5");
	}

	public static void main(String[] args) {
		//references to a instance method
		LearnerImplementation l1=new LearnerImplementation();
		Learner l=l1::learnMockito;
		l.learn();
	}

}
