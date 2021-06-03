package org.method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TakeFullPageSs {
		@Test
		private void tc0() {
			System.setProperty("webdriver.chrome.driver" , System.getProperty("user.dir"+ "\\Driver.Chromedriver.exe"));
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.redbus.in/");
			Screeshot sc=new Ashot().ShootingStrategy(Shooting)
		}
		
	

}
