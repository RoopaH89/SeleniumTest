package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {

	public static void main(String[] args) {

		googleSearch();
		
	}

	public static void googleSearch() {

		String ProjectPath= System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sandeep\\Downloads\\installable\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		driver.findElement(By.name("btnK")).click();
		driver.close();
		
		System.out.println("Test completed successfully");

		
	}
}
