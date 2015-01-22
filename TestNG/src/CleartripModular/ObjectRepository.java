package CleartripModular;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ObjectRepository {

	
WebElement roundtrip,from,to,departon,Adults,child,infants,searchflights;
WebDriver driver;
public ObjectRepository(WebDriver driver)
{
	driver=this.driver;
	if(driver.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver","C:/Seleniun/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.cleartrip.com");
		
	}
	else if(driver.equals("Firefox"))
	{
		driver=new FirefoxDriver();
		driver.get("http://www.cleartrip.com");
	}
}
}
