package org.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rames\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		WebElement cna = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		cna.click();
		WebElement b = driver.findElement(By.id("year"));
		b.click();
		Select s = new Select(b);
		s.selectByIndex(1);

		List<WebElement> all = s.getOptions();
		for (int i = 0; i < all.size(); i++) {
			WebElement option = all.get(i);
			String Text = option.getText();
			System.out.println(Text);

		}

	}
}
