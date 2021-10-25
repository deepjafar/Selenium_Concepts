package com.Selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Concepts {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pachaiappanDe\\eclipse-workspace\\Selenium_Concepts\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement createAcc = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		createAcc.click();
		Thread.sleep(3000);
		
		WebElement day = driver.findElement(By.id("day"));
		Select s=new Select(day);
		s.selectByIndex(5);
		Thread.sleep(3000);
		
		 WebElement month = driver.findElement(By.id("month"));
		 Select s1=new Select(month);
		 s1.selectByValue("5");
		 Thread.sleep(3000);
		 
		 WebElement year = driver.findElement(By.id("year"));
		 Select s2=new Select(year);
		 s2.selectByVisibleText("2000");
		 
	}

}
