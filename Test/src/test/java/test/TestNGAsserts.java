package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAsserts {

	WebDriver driver=null;
	
	@BeforeTest
	public void setUpTest()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sandeep\\Downloads\\installable\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	 @Test
	 public void testNGAsserts() throws Exception{
		 
	 //Test Condition 1: If Page title matches with actualTitle then it finds email title and enters the value which we pass
	 driver.get("https://www.kayak.com");
	 String actualTitle = "Search Flights, Hotels & Rental Cars | KAYAK";
	 Assert.assertEquals(driver.getTitle(), actualTitle);
	 Thread.sleep(2000);
	 driver.findElement(By.className("k_my-input")).sendKeys("Miami");
	 //Test Condition 2: If page title didnt match with actualTitle then script throws an exception
	 Thread.sleep(2000);
	 driver.get("https://www.kayak.com");
	 actualTitle = "GoogleMail";
	 Thread.sleep(2000);
	 Assert.assertEquals(driver.getTitle(), actualTitle, "Title not matched");
	 //Assert.assertEquals(driver.getTitle(), actualTitle);
	 }
	 
	 @AfterTest
		public void tearDownTest()
		{
			driver.close();
			driver.quit();
			System.out.println("Test completed successfully");

		}

}
