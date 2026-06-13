package Multithreading;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Scanner;
public class MyThread extends Thread{
	static Thread t;

//	@Override
	public void run()
	{
		for(int j=1;j<=100;j++)
		{
			try {
				System.out.println("Thread Class");
				t.join();
		}
			catch (Exception e) {
				// TODO: handle exception
			}}
	}
	
	public void run(int i)
	{
		System.out.println(i);
	}
//	
//	ArrayList<Integer> al = new ArrayList<>();
//	String s = new String();
//	
//   Scanner sc = new Scanner(System.in);	
//	

}
