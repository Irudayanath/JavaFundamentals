import java.io.File;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.internal.WrapsDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;


public class Test {

	/**
	 * @param args
	 */
		public static void setAttribute(WebElement element, String attributeName, String value)
		 
	    {
	 
	        WrapsDriver wrappedElement = (WrapsDriver) element;
	 
	        JavascriptExecutor driver = (JavascriptExecutor)wrappedElement.getWrappedDriver();
	 
	        driver.executeScript("arguments[0].setAttribute(arguments[1],arguments[2])", element, attributeName, value);
	 
	        
	    }	
		
		
		WebDriver driver;
		EventFiringWebDriver edriver=new EventFiringWebDriver(driver);
		File f=edriver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyfile(f,new File("C:/selenium"));
		
		FirefoxProfile fxp=new FirefoxProfile();
		fxp.setAcceptUntrustedCertificates(false);
		WebDriver dirver=new FirefoxDriver(fxp);
		
		
		
				
		
	}


