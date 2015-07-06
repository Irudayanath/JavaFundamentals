import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class CheckBoxTesting {

public void CheckBox()
{
 
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver","C:/Selenium/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://www.echoecho.com/htmlforms09.htm");

	List<WebElement> cb=driver.findElements(By.xpath("//input[@name='option1']"));
	//WebElement check1=driver.findElement(By.xpath("//input[@name='option1']"));
	//check1.click();
	for(WebElement e:cb)
	{
		while(e.isDisplayed())
		{
			if(e.isSelected())
			{
				System.out.println("Checked Already");
			}
			else
			{
				e.click();
			}
		}
	}
	
}
}
