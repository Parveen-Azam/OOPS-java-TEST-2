package com.exam.encapsulation;

public class StudentDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s=new Student();
		s.setName("Parveen" );
	    s.setAge(27);
	    s.setDep("Computer Science");
	    
	    System.out.println(s.getName());
	    System.out.println(s.getAge());
	    System.out.println(s.getDep());
	    
	}

}
