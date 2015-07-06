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
	
		
	
	driver=new ChromeDriver();
	List<WebElement> elements=driver.findElements(By.tagName("a"));
	List<WebElement> radioButtin=driver.findElements(By.xpath("//input[@type='radio']"));
	List<WebElement> CheckBox=driver.findElements(By.xpath("//input[@type='checkbox']"));
	String linktext[]=new String[elements.size()];
	int i=0;
	for(WebElement e:elements)
	{
		linktext[i]=e.getText();
		i++;
	}
	for(String s:linktext)
	{
		driver.findElement(By.linkText(s));
		driver.getTitle().equalsIgnoreCase("ddd");
		
	}
	
	for(WebElement e:radiobuttin)
	{
		if(e.isSelected())
	
		{
			
			
		}

		}
	
	for(WebElement e:CheckBox)
	{
		if(e.isSelected())
		{
			
		}
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
