package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Chrome {
	WebDriver driver;
  @Test
  public void f() {
	  driver.get("http://www.google.com");
       WebElement username=driver.findElement(By.xpath("//input[@name='q']"));
	   username.sendKeys("welcome");
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.ie.driver","c:/selenium/IEDriverServer.exe");
	  driver=new InternetExplorerDriver();
	 
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
