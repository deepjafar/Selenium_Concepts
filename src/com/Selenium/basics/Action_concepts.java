package com.Selenium.basics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_concepts {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pachaiappanDe\\eclipse-workspace\\Selenium_Concepts\\Drivers3\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement gmail = driver.findElement(By.xpath("//a[text()='Gmail']"));
		Actions ac=new Actions(driver);
		ac.contextClick(gmail).build().perform();
		
		Robot rc=new Robot();
		rc.keyPress(KeyEvent.VK_DOWN);
		rc.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		
		rc.keyPress(KeyEvent.VK_DOWN);
		rc.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		
		rc.keyPress(KeyEvent.VK_DOWN);
		rc.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
        
		rc.keyPress(KeyEvent.VK_ENTER);
		rc.keyRelease(KeyEvent.VK_ENTER);
		
	}
}
