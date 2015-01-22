package New;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestActions {
public static void main(String args[])
{
	
WebDriver driver;
driver=new FirefoxDriver();
driver.get("http://www.google.com");
WebElement wb=driver.findElement(By.id("a"));
Actions builder=new Actions(driver);
builder.dragandDrop(source,destination).perform();
builder.doubleClick(wb).build().perform();

File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.filecopy(file,new File("C:/Desktop/new1.png"));

File file2=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.filecopy(file2,new File("C:/Desktop/n.png"));

WebDriverWait wbw=new WebDriverWait(driver,10);
wbw.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));

driver.manage().window().maximize();

wb.isSelected();

List<WebElement> linkElements=driver.findElements(By.tagName("a"));
String[] linktext=new String[linkElements.size()];
System.out.println(linkElements.size());
int i=0;
for(WebElement e:linkElements)
{
	linktext[i]=e.getText();
	i++;
}
for(String t:linktext)
{
	driver.findElement(By.linkText(t)).click();
	if(driver.equals("Undercons"))
	{
		System.out.println("deadLink");
	}
}
}}