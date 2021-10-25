package com.Selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass_browserlan extends baseclass {
	
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException{
		
	    driver = getBrowser("chrome");
		getUrl("https://www.google.com/");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mobile");
		
	}

}
