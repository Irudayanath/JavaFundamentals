package FunctionalTest;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest {
	  WebDriver driver,driverc;

  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","c:/Selenium/ChromeDriver.exe");
	  driverc=new ChromeDriver();
	  driverc.get("http://demo.guru99.com/V4/");
	  WebElement userid=driver.findElement(By.xpath("//td/input[@name='uid']"));
	  userid.sendKeys("charles");
	  WebElement password=driver.findElement(By.xpath("//td/input[@name='password']"));
      password.sendKeys("123*pass");
	  Thread.sleep(5000);
	  WebElement labelid=driver.findElement(By.xpath("//td/label[@id='message23']"));
	  boolean s=labelid.isDisplayed();
	  System.out.println(s);
	  
	  driver.quit();
  }


  
}
