import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

import com.google.common.base.Function;
import com.thoughtworks.selenium.Wait;


public class CheckBox {

	
	WebDriver driver;
	@org.testng.annotations.Test
	public void Test()
	{
		System.setProperty("webdriver.chrome.driver","C:/Selenium/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.echoecho.com/htmlforms09.htm");
		List<WebElement> checkbx=driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(checkbx.size());
		for(WebElement check:checkbx)
		{
			while(check.isDisplayed())
			{
			if(check.isSelected())
			{
				System.out.println("Already checked");
			}
			else
			{
				check.click();
			}
		}
			
	}
	
	}
}
