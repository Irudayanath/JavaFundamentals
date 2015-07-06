package Browser;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {
	WebDriver driver;
  @BeforeTest
  @Parameters("browser")
  public void f(String browser) {
	  if(browser.equalsIgnoreCase("Chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver","C:/Selenium/ChromeDriver.exe");
		  driver=new ChromeDriver();
		  driver.get("http://www.google.com");
	  }
	  else if(browser.equalsIgnoreCase("FireFox"))
	  {
		  driver=new FirefoxDriver();
	  }
	  
	  
	  
  }
@Test(groups={"Regression,Suite"})
public void Login()
{
	System.out.println("Grips");
}

@DataProvider(name="Login")
public Object[][] dp1()
{
	return new Object[][]
			{
			{"cgr","wef"},
			
			
			};
	
}
}
