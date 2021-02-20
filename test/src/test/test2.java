package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chrome drive\\driver_ves88\\88.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("http://www.leafground.com/");
        
        WebElement sort =driver.findElement(By.linkText("Sortable"));
        sort.click();
        WebElement a= driver.findElement(By.xpath("//*[@id='sortable']/li[1]"));
       // WebElement b=driver.findElement(By.xpath("//*[@id='sortable']/li[6]"));
        Actions act2 = new Actions(driver);
        act2.clickAndHold(a).release().build().perform();
        
        driver.navigate().back();
        
        WebElement ato = driver.findElement(By.linkText("autoComplete"));
        ato.click();
	}
}
