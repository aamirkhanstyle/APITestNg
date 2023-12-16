package demo1;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindowHandle1 {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeOptions option=new ChromeOptions();
	option.addArguments("--remote-allow-origins=*");
	option.addArguments("--incognito");
	WebDriver driver=new ChromeDriver();
driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
/*driver.findElement(By.xpath("(//button[@class='whButtons'])[3]")).click();
Set<String>allWindow=driver.getWindowHandles();
for(String win1:allWindow) {

	driver.switchTo().window(win1);
	String pageTitle=driver.getTitle();
	if(pageTitle.contains("XPath")) {
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input[@name='name'])[1]")).sendKeys("AAMIR");
	}
}*/
String parentWindowId=driver.getWindowHandle();
System.out.println(parentWindowId);
WebElement button4 = driver.findElement(By.xpath("//button[@id='newTabsBtn']"));
button4.click();
Set<String> childwindowId =driver.getWindowHandles();
for(String window:childwindowId) {
	System.out.println(window);
	if(!parentWindowId.equals(window)) {
		driver.switchTo().window(window);
		String pageTitle=driver.getTitle();
		//if(pageTitle.contains("AlertsDemo")) {
			//WebElement clickme=driver.findElement(By.xpath("//button[@id='alertBox']"));
			//clickme.click();
			//Alert a = driver.switchTo().alert();
			//a.accept();
			if(pageTitle.contains("Basic Controls")) {
				WebElement AlertBox=driver.findElement(By.xpath("//input[@id='firstName']"));
				WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(15));
				wait.until(ExpectedConditions.visibilityOf(AlertBox));
				AlertBox.sendKeys("AAmirkhan");
				break;
			}
			
		}
	}
}
} 

