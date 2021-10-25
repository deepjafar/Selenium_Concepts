package com.Selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Concepts {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pachaiappanDe\\eclipse-workspace\\Selenium_Concepts\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement okalert = driver.findElement(By.xpath("(//button[contains(@class,'btn')])[2]"));
		okalert.click();
		Thread.sleep(3000);
		
	    driver.switchTo().alert().accept();
	    Thread.sleep(3000);
		
	    WebElement confirmalert = driver.findElement(By.xpath("//a[contains(text(),' OK & Cancel ')]"));
	    confirmalert.click();
	    Thread.sleep(3000);
	    
	    WebElement click = driver.findElement(By.xpath("//button[contains(text(),'confirm box ')]"));
	    click.click();
	    Thread.sleep(3000);
	    
	    driver.switchTo().alert().dismiss();
	    Thread.sleep(3000);
	    
	    WebElement prompt = driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox ')]"));
	    prompt.click();
	    Thread.sleep(3000);
	    
	    WebElement click2 = driver.findElement(By.xpath("//button[contains(@class,'btn btn-info')]"));
	    click2.click();
	    Thread.sleep(3000);
	    
	    driver.switchTo().alert().sendKeys("Deepika");
	    driver.switchTo().alert().accept();
		
	}

}
