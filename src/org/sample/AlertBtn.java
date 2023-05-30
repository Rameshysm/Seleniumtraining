package org.sample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBtn {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\rames\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://demo.automationtesting.in/Alerts.html");
driver.manage().window().maximize();
Thread.sleep(1000);
WebElement AlertBox = driver.findElement(By.xpath("//button[contains(text(),'alert box')]"));
AlertBox.click();
Thread.sleep(1000);
Alert a = driver.switchTo().alert();

System.out.println(a.getText());
Thread.sleep(3000);
a.accept();

}
}
