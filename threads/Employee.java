package com.jsp.threads;
public class Employee 
{
  String name;
  int eid;
  public Employee(String name, int eid) 
  {
	
	   this.name = name;
	   this.eid = eid;
  }
  @Override
  public String toString()
  {
	  return "Employee[name="+name+" , eid="+eid+"]";
  }
}
