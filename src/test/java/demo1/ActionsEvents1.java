package demo1;



import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsEvents1 {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeOptions option=new ChromeOptions();
	option.addArguments("--remote-allow-origin=*");
	option.addArguments("--incognito");
	WebDriver driver= new ChromeDriver(option);
	driver.get("https://www.browserstack.com/?utm_source=google&utm_medium=cpc&utm_platform=paidads&utm_content=583610946675&utm_campaign=Search-Brand-India&utm_campaigncode=BrowserStack-Alpha+9144441&utm_term=e+browserstack&gclid=Cj0KCQjwuLShBhC_ARIsAFod4fKXVhADic0RJRX6aM2xPN3_sj7YitBkn4gjfNmJHt4fgqukfxAAXxAaAp1iEALw_wcB");
driver.manage().window().maximize();
WebElement productLink=driver.findElement(By.xpath("//button[@id='products-dd-toggle']"));
//productLink.click();
//WebElement liveMenu=driver.findElement(By.xpath("//a[@class='menu-item-live']"));
WebElement liveMenu=driver.findElement(By.xpath("//a[@title='Live']"));
//Actions a=new Actions(driver);
//a.doubleClick();
//		a.contextClick();//right click
//		a.click();
//		a.dragAndDrop(searchIcon, searchInput); 
//a.moveToElement(productLink).build().perform();
//a.click(liveMenu).build().perform();
WebElement SearchIcon=driver.findElement(By.xpath("//button[@class='bstack-mm-search-menu doc-search-menu dropdown-toggle doc-search-cta doc-search-menu-icon doc-menu-toggle hide-sm hide-xs']"));


SearchIcon.click();
//WebElement searchInput =driver.findElement(By.xpath("//input[@class='ais-SearchBox-input']")).sendKeys("test");
driver.findElement(By.xpath("//input[@class='ais-SearchBox-input']")).sendKeys("test");
//searchInput.sendKeys("test");
//searchInput.sendKeys("test");
Actions a = new Actions(driver);
a.sendKeys(Keys.ENTER).build().perform();//press on enter button
}
}
