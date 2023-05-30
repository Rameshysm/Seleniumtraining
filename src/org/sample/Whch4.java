package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Whch4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rames\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		WebElement SearchBox = driver.findElement(By.xpath("//input[@class='col-xs-20 searchformInput keyword']"));
		SearchBox.sendKeys(" Hand Sanitizer");
		WebElement Button = driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']"));
		Button.click();
		Thread.sleep(3000);
		WebElement p = driver
				.findElement(By.xpath("//p[@title='ZERMERO - Antibacterial Hand Sanitizer 2000 mL (Pack of 1)']"));
		p.click();
		Thread.sleep(1500);
		WebElement AdtoC = driver.findElement(By.xpath("(//div[@supc='SDL763977778'])[2]"));
		AdtoC.click();
		
		WebElement ViewCart = driver.findElement(By.xpath("//div[@class='cartInner']"));
	    JavascriptExecutor Click=(JavascriptExecutor)driver;
	Click.executeScript("arguments[0].click()",ViewCart);
	}
}
