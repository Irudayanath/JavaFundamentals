package Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class PageFactory {
	
	WebDriver driver;
	 @FindBy(xpath="")
	  WebElement text1;
	  public PageFactory (WebDriver driver)
	  {
		 this.driver=driver;
		 org.openqa.selenium.support.PageFactory.initElements(driver,this);
	  }
  @Test
  public void f() {
	 
  }
}
