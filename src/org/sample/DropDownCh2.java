package org.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownCh2 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\rames\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/newtours/register.php");
	driver.manage().window().maximize();
	
	WebElement country = driver.findElement(By.name("country"));
	Select AllContry=new Select(country);
	boolean multi = AllContry.isMultiple();
	System.out.println(multi);
	
	List<WebElement> alloptions = AllContry.getAllSelectedOptions();
	for (int i = 0; i < alloptions.size(); i++) {
		WebElement all = alloptions.get(i);
          String attribute = all.getAttribute("Value");	
          System.out.println(attribute);
	}
}
}
