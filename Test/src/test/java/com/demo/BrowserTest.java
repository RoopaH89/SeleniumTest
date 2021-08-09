package com.demo;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserTest {


public static void main(String[] args) {
		
		String browser="edge";
		String url="https://www.google.com";
		WebDriver driver;
		if(browser.equals("chrome"))
		{
			System.out.println("Opening Chrome");
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get(url);
}
		else if(browser.equals("firefox"))
		{
			System.out.println("Opening Firefox");
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			driver.get(url);
		}
		else if(browser.equals("edge"))
		{
			System.out.println("Opening Edge");
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			driver.get(url);
		}
		else
		{
			System.out.println("Failed");

		}
	}
/**@BeforeClass

public static void setupClass() {
    WebDriverManager.chromedriver().setup();
}**/
}
