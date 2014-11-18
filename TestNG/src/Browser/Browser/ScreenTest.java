package Browser.Browser;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ScreenTest {
WebDriver driver;
//@Test(dataProvider="Browser")
@Test
@Parameters("Browser")
public void f(String Browser) {
	  if(Browser.equalsIgnoreCase("f"))
	  {
		  System.out.println("f");
	  }
	  
  }
public void f1(String Browser)
{
	if(Browser.equalsIgnoreCase("f1"))
	{
		System.out.println("Methods");

	}
}
  /**@DataProvider(name="Browser")
  public Object[][] dp()
  {
	  return new Object[][]
			  {
			  {"chrome"},
			  {"FireFox"}
			  };
  }
}**/
}