package com.Selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Practice_Task {
	
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\pachaiappanDe\\eclipse-workspace\\Selenium_Concepts\\Drivers2\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("http://automationpractice.com/index.php");
	driver.manage().window().maximize();
	Thread.sleep(3000);

	WebElement login = driver.findElement(By.xpath("//a[contains(@class,'login')]"));
	login.click();
	Thread.sleep(3000);
	
	WebElement emailadd = driver.findElement(By.xpath("(//input[contains(@type,'text')])[2]"));
	emailadd.sendKeys("deepjafar2891@gmail.com");
	
	WebElement createacc = driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span"));
	createacc.click();
	Thread.sleep(3000);
	
	//register info//
	
	driver.findElement(By.xpath("//*[@id=\"id_gender2\"]")).click();
	
	
    WebElement firstname = driver.findElement(By.id("customer_firstname"));
    firstname.sendKeys("Deepika");
    
    WebElement lastname = driver.findElement(By.id("customer_lastname"));
    lastname.sendKeys("Pachai");
    
    WebElement paswrd = driver.findElement(By.name("passwd"));
    paswrd.sendKeys("Welcome@1");
    
    WebElement days = driver.findElement(By.name("days"));
    Select s1=new Select(days);
    s1.selectByIndex(28);
    
    WebElement months = driver.findElement(By.name("months"));
    Select s2=new Select(months);
    s2.selectByIndex(7);
    
    WebElement years = driver.findElement(By.name("years"));
    Select s3=new Select(years);
    s3.selectByValue("1991");;
    
    WebElement company = driver.findElement(By.id("company"));
    company.sendKeys("ckp office");
    
    WebElement add1 = driver.findElement(By.id("address1"));
    add1.sendKeys("Viva vito, SBI colony 1st street");
    
    WebElement add2 = driver.findElement(By.id("address2"));
    add2.sendKeys("Pammal");
    
    WebElement city = driver.findElement(By.id("city"));
    city.sendKeys("Chennai");
    
    WebElement state = driver.findElement(By.id("id_state"));
    Select s4 =new Select(state);
    s4.selectByVisibleText("Indiana");
    
    WebElement postcode = driver.findElement(By.id("postcode"));
    postcode.sendKeys("60075");
    
    WebElement phone = driver.findElement(By.id("phone_mobile"));
    phone.sendKeys("9999999999");
    
    WebElement register = driver.findElement(By.xpath("//*[@id=\"submitAccount\"]/span"));
    register.click();
    
   // ordering details//
 
    WebElement women = driver.findElement(By.xpath("//a[text()='Women']"));
    Actions ac=new Actions(driver);
    ac.moveToElement(women).build().perform();
    
    
    WebElement casualdress = driver.findElement(By.xpath("((//a[contains(@title,'Summer Dresses')])[1]"));
    Actions ac1=new Actions(driver);
    ac1.click().build().perform();
    Thread.sleep(2000);
    
    WebElement scrolldown = driver.findElement(By.xpath("(//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]/span"));
    JavascriptExecutor js=(JavascriptExecutor) driver;
    js.executeScript("Arguments[0], ScrollIntoView();",scrolldown);
    scrolldown.click();
    
  driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")).click();
    
    
    
	
	}
	
	
	
}
