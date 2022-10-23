package learning.web.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = Base.getDriver();
		
		//go to automationpractice.com
		driver.get("http://automationpractice.com");
		
		//Click on Sign in button
		
		//find sign in element
		WebElement login = driver.findElement(By.className("login"));
		//click on find element
		login.click();
		// login
		
		WebElement email = driver.findElement(By.id("email"));
		
		email.sendKeys("sobuzahmd@gmail.com");
		
		WebElement password = driver.findElement(By.id("passwd"));
		
		password.sendKeys("sobuz123456");
		
		
		WebElement submit = driver.findElement(By.id("SubmitLogin"));
		
		submit.click();
		
		WebElement find_text = driver.findElement(By.className("logout"));
		
		String text = find_text.getText();
		
		if(text.equals("Sign out")) {
			System.out.println("Sign is test is passed");
		}else {
			
			System.out.println("Sign is test is failed");
		}
		
		

	}

}
