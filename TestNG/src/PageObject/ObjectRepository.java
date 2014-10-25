package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class ObjectRepository {
	WebDriver driver;
@BeforeTest
public void Test()
{
	WebDriver driver=new FirefoxDriver();
	driver.get("http://www.google.com");
}
public WebElement getUsername()
{
	WebElement username=driver.findElement(By.id(""));
	return username;
	
}
}
