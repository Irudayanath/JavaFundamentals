import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class RadioButton {
@Test	
public void radiocheck()
{
	WebDriver driver;
	
	System.setProperty("webdriver.chrome.driver","C:/Selenium/chromedriver.exe");
	for(int i=0;i<10;i++)
	{
		
	
	driver=new ChromeDriver();
	
	/**driver.get("http://www.echoecho.com/htmlforms10.htm");
	List<WebElement> radiochk=driver.findElements(By.xpath("//input[@type='radio']"));
	System.out.println(radiochk.size());
	for(WebElement radio:radiochk)
	{
		if(radio.isSelected())
		{
			System.out.println("checked already");
		}
		else
		{
		radio.click();
		}
	}**/
}
}}
