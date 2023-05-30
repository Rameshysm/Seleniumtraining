package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Toolspa {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\rames\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
	driver.get("https://toolsqa.com/");
	driver.manage().window().maximize();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	//goto Top to Bottom
	WebElement findus = driver.findElement(By.xpath("//div[@class='col-12 col-lg-auto find-us-text text-white find-us-text']"));
	js.executeScript("arguments[0].scrollIntoView(true)", findus);
     Thread.sleep(3000);
	//goto Bottom to Top
	WebElement BtT = driver.findElement(By.xpath("//div[contains(text(),'Online')]"));
	js.executeScript("arguments[0].scrollIntoView(false)",BtT);
}
}
