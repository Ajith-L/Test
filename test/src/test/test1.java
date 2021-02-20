package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.setProperty("webdriver.chrome.driver","C:\\chrome drive\\driver_ves88\\88.exe");
       WebDriver driver =new ChromeDriver();
       driver.get("http://www.leafground.com/");
       
       WebElement edit = driver.findElement(By.linkText("Edit"));
       edit.click();
       WebElement txtb = driver.findElement(By.id("email"));
       txtb.sendKeys("ajith");
       
       driver.navigate().back();
       
       WebElement button = driver.findElement(By.linkText("Button"));
       button.click();
       WebElement btn= driver.findElement(By.id("home"));
       btn.click();
       
       WebElement hylin =driver.findElement(By.linkText("HyperLink"));
       hylin.click();
       WebElement link = driver.findElement(By.linkText("Go to Home Page"));
       link.click();
       
       WebElement img = driver.findElement(By.linkText("Image"));
       img.click();
       WebElement im1 = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[1]/div/div/img"));
       im1.click();
       
       
       WebElement dropdown = driver.findElement(By.linkText("Drop down"));
       dropdown.click();
       WebElement sel = driver.findElement(By.xpath("//*[@id='dropdown1']"));
       sel.sendKeys("Appium");
       
       driver.navigate().back();
       
       WebElement rb =driver.findElement(By.linkText("Radio Button"));
       rb.click();
       WebElement rb1 = driver.findElement(By.xpath("//*[@id='first']/label[2]"));
       rb1.click();
       
       driver.navigate().back();
       
       WebElement  cb = driver.findElement(By.linkText("Checkbox"));
       cb.click();
       WebElement cb1 =driver.findElement(By.xpath("//*[@id='contentblock']/section/div[1]/div[1]/input"));
       cb1.click();
       
       driver.navigate().back();
       
       WebElement tables = driver.findElement(By.linkText("Table"));
       tables.click();
             WebElement ta = driver.findElement(By.tagName("th"));
            String txt= ta.getText();
            System.out.println(txt);
       
       driver.navigate().back();
       
       WebElement alert =driver.findElement(By.linkText("Alert"));
       alert.click();
       WebElement ab=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[1]/div/div/button"));
     
       ab.click(); 
       
       driver.switchTo().alert().accept();
       
       driver.navigate().back();
       
      
       
       WebElement cal = driver.findElement(By.linkText("Calendar"));
       cal.click();
       WebElement ca=driver.findElement(By.id("datepicker"));
        ca.sendKeys("01/03/2021");
       
        
        driver.navigate().back();
        
       
        WebElement drag = driver.findElement(By.linkText("Draggable"));
        drag.click();
        WebElement dr=driver.findElement(By.xpath("//*[@id='draggable']"));
        WebElement traget=driver.findElement(By.xpath("//*[@id='wrapper']"));
        Actions act= new Actions(driver);
        act.dragAndDrop(dr, traget).build().perform();
        
        
        driver.navigate().back();
        
        
        WebElement drop = driver.findElement(By.linkText("Droppable"));
        drop.click();
        WebElement x = driver.findElement(By.xpath("//*[@id='draggable']"));
        WebElement y= driver.findElement(By.xpath("//*[@id='droppable']"));
        Actions act1= new Actions(driver);
        act1.click(x).dragAndDrop(x, y).build().perform();
        
        driver.navigate().back();
        
        WebElement sele= driver.findElement(By.linkText("Selectable"));
        sele.click();
        WebElement se= driver.findElement(By.xpath("//*[@id='selectable']/li[4]"));
        se.click();
           
        driver.navigate().back();
        
        WebElement sort =driver.findElement(By.linkText("Sortable"));
        sort.click();
        WebElement a= driver.findElement(By.xpath("//*[@id='sortable']/li[1]"));
        WebElement b=driver.findElement(By.xpath("//*[@id='sortable']/li[6]"));
        Actions act2 = new Actions(driver);
        act2.dragAndDrop(a, b).build().perform();
       
       
	}

}
