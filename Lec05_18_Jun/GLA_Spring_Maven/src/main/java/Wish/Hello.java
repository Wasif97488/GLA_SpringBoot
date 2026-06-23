package Wish;

import org.springframework.stereotype.Component;

@Component
public class Hello {
	
	private int hello;
	private String going;
	public int getHello() {
		return hello;
	}
	public void setHello(int hello) {
		this.hello = hello;
	}
	public String getGoing() {
		return going;
	}
	public void setGoing(String going) {
		this.going = going;
	}
	public Hello(int hello, String going) {
		super();
		this.hello = hello;
		this.going = going;
	}
	
	public Hello()
	{
		
	}

}
