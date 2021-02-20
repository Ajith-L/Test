package test;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class exceldata {
	  String [][] data= null;
	  
	  @DataProvider( name="tree")
	  public String[][] getdata() throws BiffException, IOException{
		  data=getexceldata();
		  return  data;
	  }
	  
	  public String[][] getexceldata() throws BiffException, IOException{
		 FileInputStream file = new FileInputStream("C:\\sel execel\\Book1.xls");
		 Workbook book = Workbook.getWorkbook(file);
		 Sheet sheet = book.getSheet(0);
		 int row=sheet.getRows();
		 int col= sheet.getColumns();
		 String  newdata [][] = new String[row-1][col];
		 
		 for(int i=1;i<row;i++){
			 for(int j=0;j<col;j++){
				newdata[i-1][j]= sheet.getCell(j,i).getContents();
			 }
			 
		 }
		 return newdata;
	  }
	  

	  @Test(dataProvider="tree")
	  public void login(String username,String password){
		  System.setProperty("webdriver.chrome.driver","C:\\chrome drive\\driver_ves88\\88.exe");
			 WebDriver driver = new ChromeDriver();
			 driver.get("https://opensource-demo.orangehrmlive.com/");
			 WebElement usn = driver.findElement(By.id("txtUsername"));
			 usn.sendKeys(username);
			  WebElement pwd =driver.findElement(By.id("txtPassword"));
			  pwd.sendKeys(password);
			  
			  WebElement btn =driver.findElement(By.id("btnLogin"));
			  btn.click();
			  
			  driver.close();
	  }
}
