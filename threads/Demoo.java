package com.jsp.threads;

public class Demoo implements Runnable
{
    @Override
    public void run()
    {
    	for(int i=10;i>=1;i--)
    	{
    		System.out.print(i+" ");
    		try
    		{
    			Thread.sleep(1000);
    		}
    		catch(Exception e)
    		{
    			e.printStackTrace();
    		}
    	}
    }
	public static void main(String[] args) 
	{
		Demoo d1 = new Demoo();
		Thread t1=new Thread(d1);
		t1.start();

	}

}
