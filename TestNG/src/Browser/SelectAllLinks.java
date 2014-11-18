package Browser;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelectAllLinks {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		String su="404";
		System.setProperty("webdriver.chrome.driver","C:/Selenium/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("http://www.dreamdth.com");
		List<WebElement> linkElement=driver.findElements(By.tagName("a"));
		String[] linktext=new String[linkElement.size()];
		int i=0;
		for(WebElement e:linkElement)
		{
			linktext[i]=e.getText();
			i++;
		}
		for(String s:linktext)
		{
			System.out.println(s);
			driver.findElement(By.linkText(s)).click();
			
			if(driver.getTitle().equals(su))
			{
				System.out.println("Link InActive");
			}
			else
			{
				System.out.println("Link Active");
			}
		}
		
		
	}

}
