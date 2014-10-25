package FunctionalTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.host.Element;

public class AddCustomer {
	WebDriver driver;
	WebElement CustomerName,Address,Location,MobileNumber,Email,DOB,CustomerNameCheck;
	WebElement CustomerNameCheck1,CustomerNameCheck2;
	WebElement LocationCheck1,LocationCheck2;
	public void webdriver(WebDriver driver)
	{
		this.driver=driver;
	}
  @BeforeTest
  public void CustomerDetails()
  {
	  CustomerName=driver.findElement(By.xpath(""));
	  Address=driver.findElement(By.xpath(""));
	  Location=driver.findElement(By.xpath(""));
	  MobileNumber=driver.findElement(By.xpath(""));
	  Email=driver.findElement(By.xpath(""));
	  DOB=driver.findElement(By.xpath(""));
      CustomerNameCheck=driver.findElement(By.xpath(""));  
  }
			  
			  
	@Test
  public void AddCustomer() {
	
  
  }
	public void CheckCustomerFunctionality()
	{
		  CustomerName.sendKeys("  ");
		  CustomerNameCheck.isDisplayed();
          CustomerName.sendKeys("#$@@");
          CustomerNameCheck1.isDisplayed();
	}
}
