import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Chrome {
WebDriver driver;
public void run()
{
	System.setProperty("webdriver.chrome.driver","C:/Selenium/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("C:/Selenium/Alert.html");
	driver.findElement(By.xpath("//button[@onclick='alertFunction()']"));
	Alert a=driver.switchTo().alert();
	a.getText();
	System.out.println(a);
}

}