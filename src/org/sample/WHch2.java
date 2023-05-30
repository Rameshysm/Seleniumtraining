package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WHch2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rames\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.snapdeal.com/");
		d.manage().window().maximize();
		Thread.sleep(300);
		WebElement Sb = d.findElement(By.name("keyword"));
		Sb.sendKeys("iphone7");
		WebElement Sbutton = d.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']"));
		Sbutton.click();
		WebElement img = d.findElement(By.xpath("(//img[@class='product-image '])[1]"));
		img.click();
		Thread.sleep(300);
		WebElement price = d.findElement(By.xpath("(//span[contains(text(),'Rs')])[3]"));
		String Amt = price.getText();
		System.out.println(Amt);

	}
}
