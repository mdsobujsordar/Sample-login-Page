package learning.web.automation;

import org.openqa.selenium.WebDriver;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = Base.getDriver();
		//Navigating Website
		driver.get("http://automationpractice.com");
	}

}
