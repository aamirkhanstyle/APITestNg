package base1;

import java.time.Duration;

import org.bouncycastle.pqc.jcajce.provider.dilithium.DilithiumKeyFactorySpi.Base2;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks extends Base1 {
	
	
@Before	
public static void setup() {
		
		String browserName=prop.getProperty("browser");
		if(browserName.equals("chrome")) {

			WebDriverManager.chromedriver().setup();
			ChromeOptions option=new ChromeOptions();
			option.addArguments("--remote-allow-origin=*");
			option.addArguments("--incognito");
		     driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
			//driver.get("https://www.saucedemo.com/");
			driver.get(prop.getProperty("url"));
		
		} else if(browserName.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions option=new FirefoxOptions();
			option.addArguments("--remote-allow-origins=*");
			option.addArguments("--incognito");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
			driver.get(prop.getProperty("url"));
			
		}else if(browserName.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			EdgeOptions option=new EdgeOptions();
			option.addArguments("--remote-allow-origins=*");
			option.addArguments("--incognito");
			driver=new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
			driver.get(prop.getProperty("url"));
		}

}
	
	@After
	public void tearDown(Scenario s) {
		if(s.isFailed()) {
			getScreenShot();
		}
		driver.quit();
	}
}
