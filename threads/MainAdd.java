package com.jsp.threads;

public class MainAdd 
{

	public static void addempdetails()
	  {
		  Employee e1=new Employee("virat",1);
		  Employee e2=new Employee("abd",2);
		  Employee e3=new Employee("dhoni",3);
		  Employee e4=new Employee("rohit",4);
		  //Create emp array
		  Employee []emp= {e1,e2,e3,e4};
		  //Object [] obj =new Object[100];
		  //Employee [] emp =new Employee[100];
		  for(int i=0;i<=emp.length-1;i++)
		  {
			  System.out.println(emp[i]);
		  }
	  }
	  public static void main(String [] args)
	  {
		  addempdetails();
	  }
}
