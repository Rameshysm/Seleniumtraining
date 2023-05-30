package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jsexech1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\rames\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/login/");
	driver.manage().window().maximize();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	WebElement Email=driver.findElement(By.id("email"));
	js.executeScript("arguments[0].setAttribute('Value','rameshyrs67@gmail.com')", Email);
	Object Emailinput = js.executeScript("return arguments[0].getAttribute('value')", Email);
	System.out.println(Emailinput);
	
	Thread.sleep(3000);
	WebElement password = driver.findElement(By.xpath("//input[@class='inputtext _55r1 inputtext _9npi inputtext _9npi']"));
    js.executeScript("arguments[0].setAttribute('Value','Rameshyrs')", password);
    Object passwordinput = js.executeScript("return arguments[0].getAttribute('value')", password);
	System.out.println(passwordinput);
    
    WebElement Loginbtn = driver.findElement(By.name("login"));
    js.executeScript("arguments[0].click()",Loginbtn);
}

}
