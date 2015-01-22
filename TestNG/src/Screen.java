import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import java.io.*;
import java.util.concurrent.TimeUnit;


public class Screen {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Selenium/ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.twitter.com");
		File ScreenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(ScreenShot,new File("C:/Desktop/Screen.jpeg"));
		File ScreenFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(ScreenFile,new File("C:/Desktop/Screen.png"));
        File ScreenCop=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(ScreenCop, new File("C:/Desktop/Screen1.jpeg"));
        
       driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
       @FindBy(name="dfdf")
       WebElement username;
       @FindBy(id="pass")
       WebElement pass;
      PageFactory.initElements(driver,this);  
	}

}
