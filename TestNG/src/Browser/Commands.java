package Browser;

import java.io.File;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.opera.core.systems.OperaSettings.Capability;

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
Actions a=new Actions(driver);
Actions mousemoveover=a.click();
a.moveToElement(e);
a.dragAndDrop(source, target);
Actions ad=new Actions(driver);
Actions mouse=ad.click();
ad.doubleClick();
DesiredCapabilities dp=DesiredCapabilities.chrome();
dp.setVersion("4");
String p="User Agemt";
String proxy="http:8080";
Proxy p1=new Proxy();
p1.setHttpProxy(proxy).setFtpProxy(proxy).setHttpsProxy(proxy);
dp.setCapability(CapabilityType.PROXY,p1);
WebDriver driver11=new ChromeDriver(dp);
dp.setPlatform(Platform.WINDOWS);
dp.setBrowserName("Chrome");
dp.getPlatform();
dp.getVersion();


String proxy11="http:8080";
String useragent="UserAgent";

Proxy p11=new Proxy();
p11.setHttpProxy(proxy11).setHttpsProxy(proxy11);

dp.setCapability(CapabilityType.PROXY,p11);
WebDriver driver111=new ChromeDriver(dp);


driver.getWindowHandles();

Set<String> sw=driver.getWindowHandles();
Iterator st=sw.iterator();
while(st.hasNext())
{
	String sa=it.next();
	driver.switchTo().window(sa);
	
	
}

driver.switchTo().frame(driver.findElement(By.xpath("")));

}
}