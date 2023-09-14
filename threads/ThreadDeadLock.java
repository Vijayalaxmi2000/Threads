package com.jsp.threads;

class ThreadTaskOne extends Thread
{
	String s1;
	String s2;
	public ThreadTaskOne(String s1, String s2)
	{
		this.s1=s1;
		this.s2=s2;
	}
	@Override
	public void run()
	{
		System.out.println("t1 is waiting  to lock s1");
		synchronized(s1)
		{
			System.out.println("t1 locks s1");
			System.out.println("t1 is waiting to lock s2");
			
		
			try
			{
				System.out.println("t1 pause the execution");
				s1.wait();
				System.out.println("t1 resume the execution");
				
			} 
			catch (InterruptedException e) 
			{
			
				e.printStackTrace();
			}
			synchronized(s2)
			{
				
				System.out.println("t1 locks s2");	
			}
			System.out.println("t1 unlock the s1");
			System.out.println("t1 unlock the s2");
		}
	}
}
class ThreadTaskTwo extends Thread
{
	String s1;
	String s2;
	public ThreadTaskTwo(String s1, String s2) 
	{
		this.s1 = s1;
		this.s2 = s2;
	}
	@Override
	public void run()
	{
		System.out.println("t2 is waiting to lock s2");
		synchronized(s2)
		{
			System.out.println("t2 locks s2");
			System.out.println("t2 is waiting to lock s1");
			
			synchronized(s1)
			{
				System.out.println("t2 lock s1");
				s1.notify();
			}
			System.out.println("t2 unlock s2");
			System.out.println("t2 unlock s1");
			
		}
	}
}
public class ThreadDeadLock 
{

	public static void main(String[] args) 
	{
		String str1="Java";
		String str2="SQL";
		ThreadTaskOne t1=new ThreadTaskOne(str1,str2);
		ThreadTaskTwo t2=new ThreadTaskTwo(str1,str2);
		t1.start();
		t2.start();
	}
}
