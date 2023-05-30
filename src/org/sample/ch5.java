package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ch5 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\rames\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://adactinhotelapp.com/");
	driver.manage().window().maximize();
	JavascriptExecutor Logininfo=(JavascriptExecutor)driver;
	WebElement Username = driver.findElement(By.id("username"));
	Logininfo.executeScript("arguments[0].setAttribute('value','rameshyrs67@gmail.com')", Username);
	WebElement Password = driver.findElement(By.name("password"));
    Logininfo.executeScript("arguments[0].setAttribute('value','Ramesh@143')", Password);
    WebElement Login = driver.findElement(By.xpath("//input[@class='login_button']"));
    Logininfo.executeScript("arguments[0].click()",Login);


}
}
