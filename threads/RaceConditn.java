package com.jsp.threads;
// Race Condition By using Synchronized methods
class Task
{
	synchronized public void printAsc()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}

	synchronized public void printDesc()
	{
		for(int i=10;i>=1;i--)
		{
			System.out.print(i+" ");
		}
	}
}
class Thread1 extends Thread
{
	Task t1;
	public Thread1(Task t1)
	{
		this.t1=t1;
	}
	@Override
	public void run()
	{
		t1.printAsc();	
	}
	
}
class Thread2 extends Thread
{
	Task t2;
	public Thread2(Task t2)
	{
		this.t2=t2;
	}
	@Override
	public void run()
	{
		t2.printDesc();	
	}
}

public class RaceConditn 
{

	public static void main(String[] args) 
	{
		Task task=new Task();
		Thread1 th1=new Thread1(task);
		th1.start();
		
		Thread2 th2=new Thread2(task);
		th2.start();
		

	}

}
