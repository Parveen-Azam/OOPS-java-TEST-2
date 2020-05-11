package com.exam.encapsulation;

public class Student {
	
		private String StudentName;
		private int StudentAge;
		private String Department;
	
		
		public String getName()
		{
			return StudentName;
		}
		public int getAge()
		{
			return StudentAge;
		}
		public String getDep()
		
		{
			return Department;     
		}
		
		public void setName(String StudentName)
		{
			this.StudentName = StudentName;
		}
		public void setAge(int StudentAge)
		{
			this.StudentAge = StudentAge;
		}
		public void setDep(String Department)
		{
			this.Department = Department;
		}

}
