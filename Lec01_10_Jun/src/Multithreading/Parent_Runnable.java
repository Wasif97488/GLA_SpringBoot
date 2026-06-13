package Multithreading;

public class Parent_Runnable {
	
	public static void main(String[] args) {
		
		MyThread_runnable mtr = new MyThread_runnable();
		Thread t = new Thread(mtr);
		t.start();
		for(int i=1;i<=100;i++)
		{
			System.out.println("Parent Class");
		}
	}

}
