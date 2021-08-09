package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPageObjects;

public class GoogleSearchTest {

	private static WebDriver driver = null;
	
	public static void main()
	{
		googleSearch();
	}
	
	public static void googleSearch() {
		
	//String ProjectPath= System.getProperty("user.dir");
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sandeep\\Downloads\\installable\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	
	GoogleSearchPageObjects searchPageObject=new GoogleSearchPageObjects(driver);
	//go to google.com
	driver.get("https://google.com");
	searchPageObject.setTextInSearchBox("Selenium Automation");
	searchPageObject.clickSearchButton();

	driver.close();
	
	System.out.println("Test completed successfully");
	}

}
