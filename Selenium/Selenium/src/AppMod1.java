import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class AppMod1 {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com");
		Alert art=driver.switchTo().alert();
		art.accept();
		art.getText();
		driver.quit();
		
		String filepath="C:/index.html";
		driver.findElement(By.id("download")).sendKeys(filepath);
		driver.findElement(By.name("upload")).click();
		
		WebElement src=driver.findElement(By.id("Drag"));
		WebElement drop=driver.findElement(By.id("Drop"));
		
		Actions action=new Actions(driver);
		action.clickAndHold(src).build().perform();
		action.dragAndDrop(src, drop);
		action.moveToElement(drop).build().perform();
		action.release(drop).build().perform();
		
		driver.findElement(By.xpath("").cssValue("font-size'")));
		driver.findElement(By.xpath("").cssvalue("font-color"));
		
		set<String> allwindows=driver.getWindowHandles();
		for(String windows:allwindow)
		{
			driver.switchTo().window(allwindow);
			driver.switchTo().window(allwindow);
		}
	}

}
