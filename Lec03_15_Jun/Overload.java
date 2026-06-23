package Practice;

public class Overload {
	
	public static void m1(String d)
	{
		System.out.println("String class");
	}
	
	public static void m1(StringBuffer o)
	{
		System.out.println("StringBuffer class");
	}
	
	
	
	public static void main(String[] args) {
//		m1(10);
//		m1(10.5);
//		m1('f');
//		byte b = 80;
//		m1(b);
//		long l = 20;
//		m1(l);
		m1(null);
		
		Object o = new Object();
	
	}

}
