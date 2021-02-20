package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testpara {
	@Test
	@Parameters ("name")
	public void send(String name){
		System.out.println("enter the name:" +name);
	}

}
