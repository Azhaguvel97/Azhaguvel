package org.method;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	public static void main(String[] args) throws IOException {
		
		Properties properties=new Properties();
		FileReader reader=new FileReader(System.getProperty("user.dir")+ "\\config.properties");
//		FileInputStream stream=new FileInputStream(System.getProperty("user.dir")+ "\\config.properties");
		properties.load(reader);
		String browser = properties.getProperty("browser");
		System.out.println(browser);
		if(browser.equalsIgnoreCase("chrome")) {
			
			System.setProperty(properties.getProperty("driver"), System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			WebElement txtUserName = driver.findElement(By.id("email"));
			txtUserName.sendKeys(properties.getProperty("userName"));
		}
		
	}
//System.getProperty("user.dir") + "\\Driver\\chromedriver.exe"
}
