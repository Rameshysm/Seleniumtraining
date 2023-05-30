package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InmakesScrolldown {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\rames\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://inmakesedu.com/");
	driver.manage().window().maximize();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	WebElement txt = driver.findElement(By.xpath("//h2[contains(text(),'You Always Get the ')]"));
	js.executeScript("arguments[0].scrollIntoView(true)",txt);
    String text = driver.findElement(By.xpath("//h2[contains(text(),'You Always Get the ')]")).getText();
	System.out.println(text);
	
}
}
