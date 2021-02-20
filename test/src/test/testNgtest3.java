package test;

import org.testng.annotations.Test;

public class testNgtest3 {
	@Test(priority=0)
	public void startcar(){
		System.out.println("start a car");
	}
	@Test(priority=1,enabled=false)
	public void startfm(){
		System.out.println("start a FM");
	}
	@Test(priority=2)
	public void firstgear(){
		System.out.println("first gear");
	}
	@Test(priority=4)
	public void thirdgear(){
		System.out.println("third gear");
	}
	@Test(priority=5)
	public void forthgear(){
		System.out.println("forth gear");
	}
	@Test(priority=3)
	public void secondgear(){
		System.out.println("second gear");
	}
}
