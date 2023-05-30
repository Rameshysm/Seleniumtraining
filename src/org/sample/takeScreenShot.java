package org.sample;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class takeScreenShot {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\rames\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://adactinhotelapp.com/");
	driver.manage().window().maximize();
	TakesScreenshot ts=(TakesScreenshot)driver;
	File ss = ts.getScreenshotAs(OutputType.FILE);
	File file=new File("C:\\Users\\rames\\eclipse-workspace\\SeleniumProject\\ScreenShots\\adacthotelapp.png");
	FileUtils.copyFile(ss,file);
}
}

