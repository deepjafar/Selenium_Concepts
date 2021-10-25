package com.Selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_Concepts {
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\pachaiappanDe\\eclipse-workspace\\Selenium_Concepts\\Drivers\\chromedriver.exe");

	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.navigate().to("https://www.facebook.com/");
	Thread.sleep(3000);
	
	// locator id used below//
	WebElement userName = driver.findElement(By.id("email"));
	userName.sendKeys("deepika28.1991@gmail.com");
	Thread.sleep(3000);
	
	//locator name is used below//
	WebElement passWord = driver.findElement(By.name("pass"));
	passWord.sendKeys("Saibaba1");
	Thread.sleep(3000);
	
	//locator name is used below//
	WebElement login = driver.findElement(By.name("login"));
	login.click();
}

}