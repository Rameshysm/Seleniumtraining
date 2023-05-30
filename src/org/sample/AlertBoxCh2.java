package org.sample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBoxCh2 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\rames\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Alerts.html");
	driver.manage().window().maximize();
	WebElement  Tags= driver.findElement(By.xpath("(//a[@data-toggle='tab'])[2]"));
	Tags.click();
	WebElement confirmbox = driver.findElement(By.xpath("//button[contains(text(),'confirm box ')]"));
	confirmbox.click();
	Thread.sleep(3000);
	Alert Cancelbtn = driver.switchTo().alert();
	Cancelbtn.dismiss();
	
}
}
