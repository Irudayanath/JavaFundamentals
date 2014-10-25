package Default;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class ManagerLogin {
  @Test
  public void managerLogin() throws InterruptedException {
	  WebDriver driver=new ChromeDriver();
	  System.setProperty("webdriver.chrome.driver","C:/selenium/ChromeDriver");
	  System.setProperty("webdriver.ie.driver", null);
	  System.setProperty("webdriver.chrome.driver")
	  driver.get("http://www.google.com");
	  WebElement userid=driver.findElement(By.xpath("//td/input[@name='uid']"));
	  //userid.sendKeys("mngr1052");
	  userid.sendKeys(" ");
	  WebElement password=driver.findElement(By.xpath("//td/input[@name='password']"));
	  password.sendKeys("123pass*");
      Thread.sleep(5000);

	  WebElement submit=driver.findElement(By.xpath("//td/input[@type='submit']"));
	  submit.click();
	  
	  
  }
 

}
