import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;



public class wait {
	
	WebDriver driver;
	WebElement textbox,captchafield;
	@org.testng.annotations.Test
public void implictwait()
{
	System.setProperty("webdriver.chrome.driver","C:/Selenium/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://www.google.com");
	driver.manage().timeouts().pageLoadTimeout(2,TimeUnit.SECONDS);
	//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
	explictwait();
	driver.close();
}
	public void explictwait()
	{
		WebDriverWait driverwait=new WebDriverWait(driver,10);
		driverwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='gbqfq']")));
		System.out.println("Element Located");
	}
/**public void fluentwait()
{
	 @SuppressWarnings({ "unchecked", "rawtypes" })
	Wait wait1=new FluentWait(driver)
	 .withTimeout(10,TimeUnit.SECONDS)
	 .pollingEvery(5, TimeUnit.SECONDS)
	 .ignoring(NoSuchElementException.class);
	 
	 WebElement textenter=wait1.until(new Enter() {
		public  WebElement Enter(WebDriver driver)
		{
			return driver.findElement(By.xpath("//input[@id='gbqfq']"));
		}
	 });
			 
			 
			 
			 
	 
	
}**/

}
