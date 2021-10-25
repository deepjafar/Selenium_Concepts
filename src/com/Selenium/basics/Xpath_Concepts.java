package com.Selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Concepts {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pachaiappanDe\\eclipse-workspace\\Selenium_Concepts\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
		username.sendKeys("deepika28.1991@gmail.com");
		Thread.sleep(3000);
		
		
	}

}
