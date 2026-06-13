package Multithreading;

import java.io.BufferedReader;

public class Parent {
	
	public static void main(String[] args) throws InterruptedException{
		
		MyThread mt = new MyThread();
		mt.start();
//		mt.run();
		
//		mt.join();
//		mt.yield();
		Thread t = Thread.currentThread();
		
//		System.out.println(mt.getPriority());
//		System.out.println(Thread.currentThread().getPriority());
//		
//		mt.setPriority(8);
//		System.out.println(mt.getPriority());
		
		for(int i=1;i<=100;i++)
		{
			System.out.println("Parent Class");
//			Thread.sleep(5000);
		}	
		
		
//		mt.start();
		
//		System.out.println(mt.getName());;
//		System.out.println(Thread.currentThread().getName());
//		mt.setName("MyThread");
//		System.out.println(mt.getName());
		
	}
	
	

}
