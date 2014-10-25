package CssLocators;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class NewTest {
	
	
	WebDriver driver;
	
  @Test
  public void f() {
	  driver=new FirefoxDriver();
	  //System.setProperty("webdriver.chrome.driver","C:/Selenium/ChromeDriver.exe");
	  //driver=new InternetExplorerDriver();
	  //river=new ChromeDriver();
      
	  driver.get("http://newtours.demoaut.com/");
	  WebElement c=driver.findElement(By.cssSelector("input[name=userName]"));
	  c.sendKeys("charles");
	  WebElement v=driver.findElement(By.cssSelector("input[name=password]"));
	  v.sendKeys("123pass");
	 
	  WebElement submit=driver.findElement(By.cssSelector("input[name=login]"));
	  submit.click();
  }
}
