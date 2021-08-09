package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTest {

	WebDriver driver=null;
	@Test
	@Parameters("browser")
	
	public void parameterizedTest(String browser)
	{
		if(browser.equals("firefox")){
			System.out.println("Open Firefox Driver");
			driver.get(browser);
		}else if(browser.equals("chrome")){
			System.out.println("Open Chrome Driver");
			driver.get(browser);
		}
	}
}

