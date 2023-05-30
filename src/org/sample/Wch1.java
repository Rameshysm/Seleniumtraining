package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wch1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\rames\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe" );
	 WebDriver d=new ChromeDriver();
	 d.get("https://www.amazon.com/");
	 d.manage().window().maximize();
	 Thread.sleep(300);
	 WebElement SearchBox = d.findElement(By.id("twotabsearchtextbox"));
	 SearchBox.sendKeys("Realme");
	 WebElement Searchbtn = d.findElement(By.id("nav-search-submit-button"));
     Searchbtn.click();
     WebElement iphone = d.findElement(By.xpath("//img[@Class='s-image']"));
     iphone.click();
    
     WebElement price = d.findElement(By.xpath("(//span[contains(text(),'$')])[3]"));
     String text = price.getText();
     System.out.println(text);
     WebElement AdToC = d.findElement(By.xpath("//span[@id='exportsUndeliverable-cart-announce']"));
     AdToC.click();
     
}
}
