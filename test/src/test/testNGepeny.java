package test;

import org.testng.annotations.Test;

public class testNGepeny {
    @Test() 
	public void sslc(){
		System.out.println("10th pass");
	}
    @Test (dependsOnMethods="sslc")
	public void twelth(){
		System.out.println("12th pass" );
	}
    @Test (dependsOnMethods="twelth")
	public void eng(){
		System.out.println("eng pass");
	}
    
}
