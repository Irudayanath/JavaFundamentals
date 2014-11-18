package Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Chrome {
	WebDriver driver;
  @Test
  @Parameters("browser")
  public void f(String browser) {
	  if(browser.equalsIgnoreCase("Chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver","c:/Selenium/chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("http://www.google.com");
		  

	  }
	  else if(browser.equalsIgnoreCase("FireFox"))
	  {
		  driver=new FirefoxDriver();
		  driver.get("http://www.jesuscalls.org");
	  }
  }
}
