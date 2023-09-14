package com.jsp.threads;

public class Sample extends Thread
{
	//@Override
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.print(i+" ");
			try
			{
				Thread.sleep(2000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}
	}

	public static void main(String[] args) 
	{
	    Sample s1=new Sample();
	    s1.start();

	}

}
