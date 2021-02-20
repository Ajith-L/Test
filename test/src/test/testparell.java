package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testparell {
	@Test
	public void opengoogle(){
		System.setProperty("webdriver.chrome.driver","C:\\chrome drive\\driver_ves88\\88.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.ntclogistics.in/");
	}
	@Test
	public void openfacebook(){
		System.setProperty("webdriver.chrome.driver","C:\\chrome drive\\driver_ves88\\88.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}

}
