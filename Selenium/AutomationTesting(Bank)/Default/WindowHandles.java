package Default;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class WindowHandles {
  @Test
  public void f() {
	  WebDriver driver;
	  driver.get("http://www.demo.guru99.com/V4/index.php");
	  username = driver.findElement(By.xpath("//td/input[@name='uid']"));
		password = driver.findElement(By.xpath("//td/input[@name='password']"));
		
		reset = driver.findElement(By.xpath("//td/input[@name='btnReset']"));
		submit = driver.findElement(By.xpath("//td/input[@name='btnLogin']"));
		username.sendKeys(n);
		password.sendKeys(s);
		submit.click();
    
  }
}
