package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class testNgsite {
	WebDriver driver;
	@BeforeSuite
	public void lanch(){
	System.setProperty("webdriver.chrome.driver","C:\\chrome drive\\driver_ves88\\88.exe");
	 driver = new ChromeDriver();
	}
    @Test
	public void opengmail(){
		
		
		driver.get("http://www.gmail.com/");
	}
	@Test
	public void openntn(){
		
		//WebDriver driver = new ChromeDriver();
		driver.get("http://www.ntclogistics.in/");
	}
	
	@AfterSuite
	public void end(){
		driver.close();
		
	}
}
