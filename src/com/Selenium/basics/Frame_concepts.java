package com.Selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Frame_concepts {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pachaiappanDe\\eclipse-workspace\\Selenium_Concepts\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.switchTo().frame("SingleFrame");
		
		WebElement textbox = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		textbox.sendKeys("frame1");
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		WebElement iframe = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		iframe.click();
		
		
		WebElement parentframe = driver.findElement(By.xpath("//*[@id=\"Multiple\"]/iframe"));
		driver.switchTo().frame(parentframe);
		
		WebElement childframe = driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
		driver.switchTo().frame(childframe);

		WebElement textbox2 = driver.findElement(By.xpath("/html/body/section/div/div/div/input"));
		textbox2.sendKeys("frame2");
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		
		WebElement navi = driver.findElement(By.xpath("//a[@class='dropdown-toggle']"));
		Actions ac=new Actions(driver);
		ac.moveToElement(navi).build().perform();
		
		WebElement fff = driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/ul/li[3]/a"));
		fff.click();
		
	}

}
