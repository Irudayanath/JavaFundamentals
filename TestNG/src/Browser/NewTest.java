package Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;
  @Test(dataProvider="search")
  @Parameters({"Author","Demo"})
  public void f(String Author,String Demo) {
	  
	  WebElement e=driver.findElement(By.xpath(""));
	  e.sendKeys("Author");
	  e.sendKeys("Demo");
	  
	  

  }
  @DataProvider(name="search")

  public Object[][] dp1()
  {
  	return new Object[][]
  			{
  			{"weclome","hi"},
  			{"hi","fdfd"},
  				
  			
  			};
  }
  
  @DataProvider(name="serac")
  @Test(dataProvider="serac")
  public Object[][]  dp()
  {
	  return new Object[][]
			  {
			  {"we","g"},
			  {"fg","ggg"},
			  
			  };
  }
}
//**


File screenshot=((TakeScreenshot)driver).getScreenshotAs("OUTPUT.FILE");
FileUtils.copyfiles(screenshot,new File(C:/sleleniu/scree.png));