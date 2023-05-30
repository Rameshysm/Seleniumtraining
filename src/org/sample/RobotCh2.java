package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotCh2 {
public static void main(String[] args)  {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\rames\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.co.in/");
	driver.manage().window().maximize();
	
	WebElement Searchbox = driver.findElement(By.name("q"));
	Searchbox.sendKeys("InmakesInfotech");
	Actions a=new Actions(driver);
	
    a.doubleClick(Searchbox).perform();
    
	
	
}
}
