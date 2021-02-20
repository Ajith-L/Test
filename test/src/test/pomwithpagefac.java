package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageobjectmodel.pompagefactexample;

public class pomwithpagefac {
	
	@Test
	public void login(){
	System.setProperty("webdriver.chrome.driver","C:\\chrome drive\\driver_ves88\\88.exe");
	WebDriver driver = new ChromeDriver();
    driver.get("https://opensource-demo.orangehrmlive.com/");
    PageFactory.initElements(driver, pompagefactexample.class);
    pompagefactexample.username.sendKeys("Admin");
    pompagefactexample.password.sendKeys("admin123");
    pompagefactexample.btn.click();
	}

}

