import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Testbrowser {
	public static void main(String arfs[])
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com");
        String url=driver.getTitle();
        System.out.println(url);
        String title="Google";
        driver.quit();
	}
}
