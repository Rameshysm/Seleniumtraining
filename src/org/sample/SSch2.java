package org.sample;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SSch2 {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\rames\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	TakesScreenshot ft=(TakesScreenshot)driver;
	File img=ft.getScreenshotAs(OutputType.FILE);
	File f=new File("C:\\Users\\rames\\eclipse-workspace\\SeleniumProject\\ScreenShots\\flipkartHomeSS.png");
	FileUtils.copyFile(img, f);
	
}
}
