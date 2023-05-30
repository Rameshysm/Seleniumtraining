package org.sample;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Whch5 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\rames\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	WebElement Xmark = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
	Xmark.click();
	WebElement Sb = driver.findElement(By.name("q"));
	Sb.sendKeys("Redmi phone");
	WebElement Sbtn = driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
	Sbtn.click();
	
    driver.get(driver.getCurrentUrl());
	WebElement Product = driver.findElement(By.xpath("(//img[@class='_396cs4'])[1]"));
	Product.click();
	
	String Wd1 = driver.getWindowHandle();
	
	Set<String> Wd = driver.getWindowHandles();
	
	for (String Str : Wd) {
		if(Str!=Wd1) {
			driver.switchTo().window(Str);
		}
	}
	WebElement Price = driver.findElement(By.xpath("//div[@class='_30jeq3 _16Jk6d']"));
	String Amt = Price.getText();
    System.out.println(Amt);
}
}
