package com.Selenium.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_launch {
	
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\pachaiappanDe\\eclipse-workspace\\Selenium_Concepts\\Drivers\\chromedriver.exe");
	
	       WebDriver driver = new ChromeDriver();
	       
	       driver.get("https://www.google.co.in/");
	       driver.manage().window().maximize();
	
}

}
