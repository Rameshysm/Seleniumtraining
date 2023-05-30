package org.sample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertch3 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\rames\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.automationtesting.in/Alerts.html");
	driver.manage().window().maximize();
	WebElement TextBox = driver.findElement(By.xpath("//a[contains(text(),'Textbox')]"));
    TextBox.click();
    Thread.sleep(3000);
	WebElement PromptBox = driver.findElement(By.xpath("//button[contains(text(),'prompt')]"));
	PromptBox.click();
    Alert a = driver.switchTo().alert();
    a.sendKeys("Ramesh");
    a.accept();
}
}
