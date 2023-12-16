package demo1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDownHandle1 {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	options.addArguments("--incognito");
	WebDriver driver= new ChromeDriver(options); 
	driver.get("https://vuse.com/gb/en");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	WebElement cook= driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']"));
	cook.click();
	WebElement a=driver.findElement(By.xpath("(//button[@class='button-root_highPriority-3u6 button-root-16x clickable-root-2gB'])[13]"));
	a.click();
	WebElement dob=driver.findElement(By.xpath("//input[@autocomplete='date']"));
	dob.sendKeys("20/05/1992");
	//WebElement dropdown = driver.findElement(By.xpath("//select[@id='gender']"));
	//Select s = new Select(dropdown);
	//s.selectByVisibleText("Male");
		//s.selectByIndex(2);
//s.selectByValue("2");
		

}
}
