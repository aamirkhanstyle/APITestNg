 package stepDefination1;

import static org.junit.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base1.Base1;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import page.LoginPage1;

public class LoginPageSteps1 extends Base1 {
	
	LoginPage1 login=new LoginPage1();
	
/*	@Given("User launch site URL")
	public void user_launch_site_url() {
		setup();
		WebDriverManager.chromedriver().setup();
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		option.addArguments("--incognito");
	    driver=new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
				
	    
	}   */

	@When("User enter correct User and password")
	public void user_enter_correct_user_and_password() {
		//login.user_enter_correct_user_and_password();
	/*	WebElement userName=driver.findElement(By.xpath("//input[@id='user-name']"));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(userName));
		userName.sendKeys("standard_user");
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		wait.until(ExpectedConditions.visibilityOf(password));
		password.sendKeys("secret_sauce");  */

	}  

	@When("user click on login button")
	public void user_click_on_login_button() {
		login.user_click_on_login_button();  
	/*	WebElement loginBtn=driver.findElement(By.xpath("//input[@id='login-button']"));
		loginBtn.click();   */
	   
	}

	@Then("Validate user navigate to home page")
	public void validate_user_navigate_to_home_page() {
		assertTrue(driver.findElement(By.xpath("//span[@class='title']")).isDisplayed());
	}
	@When("User enter correct {string} and {string}")
	public void user_enter_correct_and(String usrname, String passwd) {
	   login.user_enter_correct_user_and_password(usrname,passwd);
	}
}
