package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automation1 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--incognito");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.vuse.com/gb/en/customer/account/create/");
		driver.manage().window().maximize();
		WebElement cook = driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']"));
		cook.click();
		WebElement a= driver.findElement(By.xpath("(//button[@class='button-root_highPriority-3u6 button-root-16x clickable-root-2gB'])[13]"));
		a.click();
		//WebElement cartIcon=driver.findElement(By.xpath("//a[@class='action showcart']"));
		//cartIcon.click();
		WebElement firstFiled=driver.findElement(By.xpath("(//input[@id='firstname'])[1]"));
		firstFiled.sendKeys("Aamir");
		WebElement lastFiled=driver.findElement(By.xpath("(//input[@id='lastname'])[1]"));
		lastFiled.sendKeys("khan");
		WebElement mailFiled=driver.findElement(By.xpath("//input[@id='email_address']"));
		mailFiled.sendKeys("aamir2385@gmail.com");
		WebElement dobFiled=driver.findElement(By.xpath("//input[@id='dob']"));
		dobFiled.sendKeys("03/04/2000");
	}

}
