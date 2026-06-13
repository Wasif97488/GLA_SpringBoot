package Multithreading;

public class MyThread_runnable implements Runnable{
	
	public void run()
	{
		for(int j=1;j<=100;j++)
		{
			System.out.println("Thread Class");
		}
	}

}
