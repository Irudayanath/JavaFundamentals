package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainApp {
public static void main(String args[])

{
	
	
	MainApp app=new MainApp();
	ObjectRepository o=new ObjectRepository();
	o.Test();
	o.getUsername("Welcome Jesus");
	o.setUser();
}
}
