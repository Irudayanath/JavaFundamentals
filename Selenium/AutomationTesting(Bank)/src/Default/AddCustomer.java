package Default;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import 
public class AddCustomer  {
	
	WebDriver driver;
	WebElement CustomerName,Address,Location,MobileNumber,Email,DOB,Click;
	String title="Welcome To Bank";
	public void WebDriver(WebDriver driver)
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
	      Click=driver.findElement(By.xpath("")); 
	  }
	  @Test(dataProvider="dp")
	  
	public void test(String n,String m,String k)
	{
	  driver=new FirefoxDriver();
	  CustomerName.sendKeys("n");
      Address.sendKeys("m");
      Location.sendKeys("k");
      MobileNumber.sendKeys("9600511634");
      Email.sendKeys("irudayanath@gmail.com");
      DOB.sendKeys("1/7/1984");
      Click.click();
      String getTitle=driver.getTitle();
      if(getTitle==title)
      {
    	  System.out.println("Success");
      }
}
	  @DataProvider
	  Object[][] dp()
	  {
		return new Object[][]{
				
				{
					"charles","shanthiNager","hosur"
				}
				
		};
		  
	  }
	  
}
