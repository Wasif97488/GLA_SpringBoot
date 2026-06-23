package Wish;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Company {
	public static void ceo()
	{
		System.out.println("ceo");
		try
		{
			manager();
		}
		catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println("Hello i am Wasif");
		}
	}

	private static void manager() throws FileNotFoundException{
		// TODO Auto-generated method stub
		teamLead();
		System.out.println("Manager");
	}

	private static void teamLead() throws FileNotFoundException{
		// TODO Auto-generated method stub
		employee();
		System.out.println("Team Lead");
		
	}

	private static void employee() throws FileNotFoundException{
		// TODO Auto-generated method stub
//		System.out.println("EMployee");
		FileReader fr = new FileReader("wasif.txt");
		
	}
	public static void main(String[] args) {
		ceo();
	}
	

}
