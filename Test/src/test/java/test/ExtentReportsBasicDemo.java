package test;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;



public class ExtentReportsBasicDemo {

	private static ExtentReports extent;
	private static WebDriver driver;

	public static void main(String[] args) {

		ExtentSparkReporter spark = new ExtentSparkReporter("C:\\Users\\sandeep\\selenew\\Target\\Spark\\Spark.html");
		extent = new ExtentReports();
		extent.attachReporter(spark);		
        
		ExtentTest test=extent.createTest("Google Search Test","Validate Search functionality");
        

		System.setProperty("webdriver.chrome.driver","C:\\Users\\sandeep\\Downloads\\installable\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		test.log(Status.INFO,"Starting test case");
		
		driver.get("https://google.com");
		test.pass("Navigated to Google");
		
		driver.findElement(By.name("q")).sendKeys("Automation");
		test.pass("Entered text in searchbox");

		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		test.pass("Pressed enter key");

		driver.close();

		driver.quit();
		test.pass("Closed the browser");
		test.info("Test completed");
		
		extent.flush();


		
		
	}

}
