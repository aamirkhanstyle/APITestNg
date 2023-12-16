package page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base1.Base1;

public class LoginPage1 extends Base1{
	 //WebDriver driver;
	public void user_enter_correct_user_and_password(String username, String passwd) {
		
		WebElement userName=driver.findElement(By.xpath("//input[@id='user-name']"));
		waitforExpectedElement(userName, 15);
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
	//	wait.until(ExpectedConditions.visibilityOf(userName));
		//userName.sendKeys("standard_user");
		userName.sendKeys(username);
		
		//userName.sendKeys(prop.getProperty("username"));
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		waitforExpectedElement(password, 15);
		//wait.until(ExpectedConditions.visibilityOf(password));
		//password.sendKeys("secret_sauce");
		password.sendKeys(passwd);
		//password.sendKeys(prop.getProperty("password"));
// mouseHover(password); 
		
			 
	} 
	public void user_click_on_login_button() {
		WebElement loginBtn=driver.findElement(By.xpath("//input[@id='login-button']"));
		
		try {
		loginBtn.click();   
		}
		catch (Exception e) {
			executorClick(loginBtn);
			// TODO: handle exception
		}
	}
	

}