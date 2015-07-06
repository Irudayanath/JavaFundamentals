import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;


public class CheckBox {

	
	WebDriver driver;
	@BeforeTest
	public void Capabilities()
	{
		DesiredCapabilities dp=new DesiredCapabilities();
		dp.setBrowserName("Chrome");
		dp.getPlatform();
		dp.getBrowserName();
		dp.getVersion();
			
		
	}
	@org.testng.annotations.Test
	public void CheckBoxTestCase()
	{

		System.setProperty("webdriver.chrome.driver","C:/Selenium/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.echoecho.com/htmlforms09.htm");
		WebDriverWait wait=new WebDriverWait(driver,10);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='checkbox']")));
		List<WebElement> checkbx=driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(checkbx.size());
		 
		driver.get("http://cssmenumaker.com/css-menus");
		//Select s=new Select(driver.findElement(By.xpath("//select[@name='items_per_page']")));
		//s.selectByVisibleText("24");
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
	
	}}
