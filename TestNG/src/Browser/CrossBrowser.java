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
  @Parameters({"browser"})
  public void f(String browser) {
	  if(browser.equalsIgnoreCase("Chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver","C:/Selenium/ChromeDriver.exe");
		  driver=new ChromeDriver();
	  }
	  else if(browser.equalsIgnoreCase("FireFox"))
	  {
		  driver=new FirefoxDriver();
	  }
	  
	  
	  
  }


@Test(dataProvider="Search")

public void Test(String name,String Age)
{
	
}

@DataProvider(name="Search")
public Object[][] getDataFromDataProvider()

{
	
	return new Object[][]
			{
	  {"Chr","wel"},
	  {"wel","joe"}
	  
};
}
@DataProvider(name="Paramer")
public Object[][] getDatafromDataProvider()
{
	return new Object[][]
			{
			{
				"cjjr","ckdjk"
			},
			{
			"cdf","dffgfr"	
			}
			
			};
}

}

