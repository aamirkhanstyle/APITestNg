package demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationMethods {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option=new  ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		option.addArguments("--incognito");
		WebDriver driver =new ChromeDriver(option);
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
	}

}
