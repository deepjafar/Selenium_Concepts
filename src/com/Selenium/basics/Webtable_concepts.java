package com.Selenium.basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable_concepts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pachaiappanDe\\eclipse-workspace\\Selenium_Concepts\\Drivers2\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("https://www.w3schools.com/html/html_tables.asp");
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	    
	    System.out.println("--------------All Row----------");
	    List<WebElement> alldata = driver.findElements(By.xpath("//table[@id='customers']//tbody//tr//td"));
	    for (WebElement data : alldata) {
	    	System.out.println(data.getText());
	    }
	    System.out.println("------------Particular Row-----------");
	    	List<WebElement> parow = driver.findElements(By.xpath("//table[@id='customers']//tbody//tr[2]//td"));
	    	for (WebElement prow : parow) {
				System.out.println(prow.getText());
			}
	    	
	    	
			
	    System.out.println("--------Particular Data---------- ");
	  List<WebElement> pdata = driver.findElements(By.xpath("//table[@id='customers']//tbody//tr[6]//td[3]"));
	  for (WebElement data2 : pdata) {
		  System.out.println(data2.getText());
		
	}
	    
		
	}
}
