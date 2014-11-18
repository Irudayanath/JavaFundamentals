package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ObjectRepositoryTest {
	WebElement password,username;
	  WebDriver driver;
  @BeforeClass
  public void beforeClass() {
	  
  }

  @AfterClass
  public void afterClass() {
  }


  @Test
  public void Test() {
    throw new RuntimeException("Test not implemented");
    
  }

  @Test
  public WebElement getPassword() {
	  
	  
    throw new RuntimeException("Test not implemented");
  }

  @Test
  public void getUsername() {
    throw new RuntimeException("Test not implemented");
  }
}
