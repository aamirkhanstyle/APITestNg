package demo1;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandle {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		option.addArguments("--incognito");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		driver.findElement(By.xpath("(//button[@class='whButtons'])[1]")).click();
		
		String parentWindowID =driver.getWindowHandle();
		System.out.println(parentWindowID);
		
	Set<String> AllWindow= driver.getWindowHandles();	
	System.out.println(AllWindow);
	
	
	for(String MyWin:AllWindow) {
		//if(parentWindowID!=MyWin)
			if(!parentWindowID.equals(MyWin))
		{
			System.out.println("Afterloop"+MyWin);
			driver.switchTo().window(MyWin);
			driver.manage().window().maximize();
			break;
		}
	}
	driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("AAmir khan");
		driver.close();
		driver.switchTo().window(parentWindowID);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("RAshid");
				
	}

}
