package org.sample;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmzSSCh3 {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\rames\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	TakesScreenshot azn=(TakesScreenshot)driver;
	File img=azn.getScreenshotAs(OutputType.FILE);
	File f=new File("C:\\Users\\rames\\eclipse-workspace\\SeleniumProject\\ScreenShots\\amazonhomepage.png");
	FileUtils.copyFile(img, f);
	
}
}
