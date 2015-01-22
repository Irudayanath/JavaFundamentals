package Browser;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Commands {

public static void main(String args[]) throws IOException
{
WebDriver driver;

driver=new FirefoxDriver();
driver.get("http://www.google.com");
driver.getCurrentUrl();
driver.getTitle();
driver.getPageSource();
driver.getWindowHandle();
Set<String> s=driver.getWindowHandles();
Iterator<String> it=s.iterator();
while(it.hasNext())
{
	String s1=it.next();
	driver.switchTo().window(s1);
	driver.navigate().back();
}
driver.switchTo().alert().accept();
driver.navigate().back();
driver.navigate().forward();
driver.switchTo().alert().getText();

WebDriverWait driverwait=new WebDriverWait(driver,10);
driverwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));

driverwait.until(ExpectedConditions.alertIsPresent());

File screencopy=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(screencopy, new File("C:/Selenium/twitter.jpeg"));

Select select=new Select(driver.findElement(By.xpath("")));
select.selectByVisibleText("Welcome");

select.deselectByIndex(2);
select.deselectAll();

WebElement e=driver.findElement(By.xpath(""));
Actions acrion=new Actions(driver);
Actions mousemoveover=acrion.click();
acrion.moveToElement(e);



}
}