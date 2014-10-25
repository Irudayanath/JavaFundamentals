import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestModule2AllLinkTest {

	
	public static void main(String[] args) {
    WebDriver driver=new FirefoxDriver();
    String under="UnderCons";
    driver.get("https://www.gmail.com");
    
    List<WebElement> elements=driver.findElements(By.tagName("a"));
    String[] linktext=new String[elements.size()];
    int i=0;
    
    for(WebElement e:elements)
    {
    	linktext[i]=e.getText();
    	i++;
    }
    for(String s:linktext)
    {
    	driver.findElement(By.linkText(s)).click();
    	if(driver.getTitle().equals(under))
    	{
        	System.out.println("Link is dead");

    	}
    	else
    	{
    		System.out.println("Working");

    	}
driver.navigate().back();

    	
    }
driver.close();    
    
	}

}
