package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageFactory {
	WebDriver driver;

	@FindBy(xpath="")
	WebElement name;
	@FindBy(xpath="")
	WebElement pass;
	
public PageFactory(WebDriver driver)
{
	this.driver=driver;
    PageFactory.initElements(driver,this);
	
}



}