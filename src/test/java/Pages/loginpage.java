package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpage {
		
	WebDriver driver;
	
	By txt_username = By.id("user-name");
	By txt_password = By.id("password");
	By btn_login = By.id("login-button");
	
	public loginpage(WebDriver driver) {
		this.driver = driver;
	}
	public void enterUsername() {
		driver.findElement(txt_username).sendKeys("standard_user");
	}
	
	public void enterPassword() {
		driver.findElement(txt_password).sendKeys("secret_sauce");
	}
	
	public void clickLogin() {
		driver.findElement(btn_login).click();
	}
}
