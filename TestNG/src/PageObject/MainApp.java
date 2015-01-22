package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainApp {
public static void main(String args[])

{
	
	WebDriver driver;
	driver=new ChromeDriver();
	MainApp app=new MainApp();
	PageFactory pg=new PageFactory(driver);
	pg.getPageSource();
	ObjectRepository o=new ObjectRepository();
	o.Test();
	o.getUsername("Welcome Jesus");
	String s=o.getTitle();
	if(s.equalsIgnoreCase("gmail"))
	{
		System.out.println("Valid Page");
	}
	o.setUser();
}
}
