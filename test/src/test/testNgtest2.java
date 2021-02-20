package test;

import org.testng.annotations.Test;

public class testNgtest2 {
	@Test (priority=0  )
	public void startCar(){
		System.out.println("start car");
	}
	
	@Test (priority=1)
	public void firstgear(){
		System.out.println("first gear");
	}
	
	@Test (priority=2)
	public void seecondgear(){
		System.out.println("second gear");
	}

	@Test (priority=3)
	public void thirdgear(){
		System.out.println("third gear");
	}


}
