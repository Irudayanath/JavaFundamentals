package Browser.Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Cleartrip {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver;
WebElement adults,nav;

System.setProperty("webdriver.chrome.driver","c:/selenium/chromedriver.exe");

driver=new ChromeDriver();
driver.get("http://www.cleartrip.com");
adults=driver.findElement(By.xpath("//i[@class='icon ir datePicker']"));
adults.click();

nav=driver.findElement(By.xpath("//td[@data-month='11'][a='14']"));
nav.click();
	}

}
