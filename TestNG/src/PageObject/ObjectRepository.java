package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class ObjectRepository {
	WebDriver driver;
	WebElement username,password;	
@BeforeTest
public void Test()
{
	System.setProperty("webdriver.chrome.driver","c:/Selenium/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.google.com");
}
@org.testng.annotations.Test
public void getUsername(String username1)
{
    username=driver.findElement(By.xpath("//input[@name='q']"));
	username.sendKeys(username1);
}

public void setPassword(String enterpassword)
{
	password=driver.findElement(By.xpath(""));
	password.sendKeys(enterpassword);
}

public String returnTitle()
{
	String title=driver.getTitle();
	return title;
	
}
public void getPassword(String password)
{
	WebElement password1=driver.findElement(By.xpath(""));
	password1.sendKeys(password);

}
public String getTitle()
{
	return driver.getTitle();
}

public void setEmpName(String empname)
{
	WebElement empnames=driver.findElement(By.xpath(""));
	empnames.sendKeys(empname);
}
public WebElement setUser()
{
	WebElement e=driver.findElement(By.xpath(""));
	return e;
}
}
