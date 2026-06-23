package Practice;

public class Overloading {
	
	public static void main(String[] args) {
		byte b = 10;
		m1(null);
//		System.out.println(10);
//		System.out.println("10");
//		System.out.println(true);
//		System.out.println(10.5);
		
		
	}
	
	public static void m1(String a)
	{
		System.out.println("Integer value "+a);
	}
	
	public static void m1(Object a)
	{
		System.out.println("double value "+a);
	}


}
