package com.exam.encapsulation;

public class Department {
	
	String DepartmentName;
	int Id;
	String Location;
	
	Department()
	{
		//System.out.println("Department Details");
	}
	
	Department(String n,int i)
	{
		DepartmentName=n;
		Id=i;
	}

	Department(String n,int i,String l)
	{
		DepartmentName=n;
		Id=i;
		Location=l;
	}
	
	void show1()
	{
		System.out.println("Department Details");
	}
		
	void show2()
	{
		System.out.println(DepartmentName+" " +Id+ " ");
	}
	
	void show3()
	{
		System.out.println(DepartmentName+" " +Id+ " "+Location+ " ");
	}
	

	public static void main(String args[])
	{
		Department d1=new Department();
		Department d2=new Department("CSE", 508);
		Department d3=new Department("CSE",508,"Right to the Campus");
		
		d1.show1();
		d2.show2();
		d3.show3();
		
	}
}
