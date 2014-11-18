
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TestModule1 {

	public static void main(String[] args) {
		WebDriver fdriver=new FirefoxDriver();
		fdriver.get("https://www.gmail.com");
	    fdriver.getTitle();
	  
	    
		fdriver.close();
		
		fdriver.getCurrentUrl();
		fdriver.getPageSource();
		fdriver.getTitle();
		fdriver.findElement(By.id("name")).getTagName();
		fdriver.findElement(By.name("Submit")).click();
		fdriver.navigate().to("https://www.facebook.com");
		fdriver.navigate().forward();
		fdriver.navigate().back();
		fdriver.navigate().refresh();
		fdriver.get("http://selenium.googlecode.com/svn/trunk/docs/api/java/index.html");
		fdriver.switchTo().frame("frame");
		fdriver.findElement(By.name("Click")).click();
		
		fdriver.switchTo().alert().accept();
		fdriver.switchTo().alert().getText();
		
		
WebDriverWait driverwait =new WebDriverWait(fdriver,10);
driverwait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name")));
driverwait.until(ExpectedConditions.alertIsPresent());
driverwait.until(ExpectedConditions.elementToBeClickable(By.id("name")));
driverwait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("ViewFrame"));
driverwait.until(ExpectedConditions.elementToBeSelected(By.linkText("Register")));
WebDriverWait driverwait=new WebDriverWait(driver,10);
driverwait.until(ExpectedCondtions.visibilityofElementLocated(By.id("hi")));

WebDriverWait driverWiat=new WebDriverWait(driver,10);
driverwait.until(ExpectedCondtions.visibilitofElementLocated(By.xpath("")));

fdriver.switchTo().alert().accept();

Select select=new Select(driver.findElement(By.xpat()));
select.selectByIndex(1);
select.deselectByIndex(4);
select.selectByVisibleText("antaartica");
select.isMultiple();
select.deselectAll();



Select newselect=new Select(fdriver.findElement(By.id("name")));
newselect.selectByVisibleText("Antratica");
newselect.selectByIndex(1);
newselect.deselectByVisibleText("Mexico");
newselect.deselectByIndex(4);
newselect.selectByValue("234");
newselect.deselectByValue("345");
newselect.isMultiple();
newselect.deselectAll();

fdriver.findElement(By.partialLinkText("fb")).click();
fdriver.findElement(By.linkText("search here")).click();
fdriver.findElement(By.partialLinkText("Inside div")).click();


fdriver.findElement(By.xpath("//div[1]/img"));

WebElement e=fdriver.findElement(By.id("we"));
Actions action=new Actions(fdriver);
Actions mousemoveover=action.click();


action.moveToElement(e);
action.sendKeys(e,"hello");
action.doubleClick(e);
mousemoveover.perform();


fdriver.get("www.facebbok.com");
e.sendKeys("C://1.wml");
fdriver.findElements(By.id("a"));













		
		
	}}
