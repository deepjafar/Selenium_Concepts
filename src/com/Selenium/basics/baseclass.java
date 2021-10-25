package com.Selenium.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseclass {
	
	public static WebDriver driver; 
	
	public static WebDriver getBrowser(String browsername) {
		
	 try {
		if (browsername.equalsIgnoreCase("chrome")) {
			 
				System.setProperty("webdriver.chrome.driver", 
						"C:\\Users\\pachaiappanDe\\eclipse-workspace\\Selenium_Concepts\\Drivers\\chromedriver.exe");
				
				      driver = new ChromeDriver();
			 
		 }
		 else {
			System.out.println("invalid broswer");
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	 driver.manage().window().maximize();
	 
	 return driver;
	  
	}

	public static void getUrl(String url) {
		
		try {
			driver.get(url);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}

}	
