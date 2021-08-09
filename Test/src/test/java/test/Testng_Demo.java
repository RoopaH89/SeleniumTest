package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.GoogleSearchPageObjects;

public class Testng_Demo {
	
	private static WebDriver driver = null;

	@BeforeTest
	public void setUpTest()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sandeep\\Downloads\\installable\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public static void googleSearch() {
		
		String title;
		//String ProjectPath= System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sandeep\\Downloads\\installable\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		GoogleSearchPageObjects searchPageObject=new GoogleSearchPageObjects(driver);
		//go to google.com
		driver.get("https://google.com");
		title=driver.getTitle();
		System.out.println("Title is: "+title);
		searchPageObject.setTextInSearchBox("Selenium Automation");
		searchPageObject.clickSearchButton();

			}
	
	@AfterTest
	public void tearDownTest()
	{
		driver.close();
		driver.quit();
		System.out.println("Test completed successfully");

	}

}
