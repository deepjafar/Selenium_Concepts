package com.Selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollupdown_Concepts {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pachaiappanDe\\eclipse-workspace\\Selenium_Concepts\\Drivers2\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement scrolldown = driver.findElement(By.xpath("//a[text()='Gift a Smile']"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", scrolldown);
		scrolldown.click();
		Thread.sleep(3000);
		
		//Javascriptexecutor is an interface and driver also an interface so we do type casting and create an object //
	
		WebElement scrollup = driver.findElement(By.xpath("//img[contains(@alt,'Big Savings')]"));
		js.executeScript("arguments[0].scrollIntoView();", scrollup);
        scrollup.click();
        
		
	}

}
