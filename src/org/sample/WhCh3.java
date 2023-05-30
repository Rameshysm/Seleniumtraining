package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WhCh3 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\rames\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.homedepot.com/");
	driver.manage().window().maximize();
	WebElement Searchbox = driver.findElement(By.xpath("//input[@class='SearchBox__input']"));
	Searchbox.sendKeys("Celing fan");
	WebElement SearchButton = driver.findElement(By.xpath("//button[@class='SearchBox__button']"));
    SearchButton.click();
    WebElement Sentence = driver.findElement(By.xpath("//h2[@class='section-heading__text--6fd88']"));
    JavascriptExecutor js=(JavascriptExecutor)driver;
    js.executeScript("arguments[0].scrollIntoView();",Sentence);
     WebElement Product = driver.findElement(By.xpath("(//span[@class='product-pod__title__product'])[2]"));
     Product.click();
}
}
