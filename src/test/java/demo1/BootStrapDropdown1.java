package demo1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootStrapDropdown1 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origin=*");
		option.addArguments("--incognito");
		WebDriver driver=new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		driver.manage().window().maximize();
		WebElement dropBtn=driver.findElement(By.xpath("//button[@id='menu1']"));
		dropBtn.click();
		List<WebElement> DropdownList=driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li/a"));
		int size=DropdownList.size();
		int l=DropdownList.size();
		System.out.println(size);
		//for(WebElement ele:DropdownList) {
		//	String value=ele.getText();
		//	if(value.equals("About Us")){
		//		ele.click();
			//	break;
			//}
		//}
		for(int i=0;i<l;i++) {
			String  value=DropdownList.get(i).getText();
			if(value.equals("About Us")) {
				DropdownList.get(i).click();
				break;
			}
		}
	
		
	}

}
