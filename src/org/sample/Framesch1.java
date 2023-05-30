package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framesch1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\rames\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://en.wikipedia.org/wiki/Bird");
	driver.manage().window().maximize();
	JavascriptExecutor je=(JavascriptExecutor)driver;
	WebElement Title = driver.findElement(By.xpath("//span[@class='mw-page-title-main']"));
	je.executeScript("arguments[0].scrollIntoView(false)", Title);
	WebElement img = driver.findElement(By.cssSelector("a[id='wlf2023chref']"));
	img.click();
	WebElement Size= driver.findElement(By.tagName("iFrame"));
	Size.getSize();
}
}
