package com.locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDropDowns {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://iarchtaps.com:8080/opentaps");
		
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		
		//Source drop down
		
		WebElement w1=driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sel1=new Select(w1);
		sel1.selectByVisibleText("Direct Mail");
		
		System.out.println("Source drop down done");
		
		
		//Industry drop down
		
		WebElement w2=driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select sel2=new Select(w2);
		sel2.selectByValue("IND_SOFTWARE");
		
		System.out.println("Industry drop down done");
		
		//Ownership drop down - get last item
		
		WebElement w3=driver.findElement(By.name("ownershipEnumId"));
		Select sel3=new Select(w3);
		List<WebElement> ls=sel3.getOptions();
		System.out.println(ls.size());
		sel3.selectByIndex(ls.size()-1);
		System.out.println("Ownership drop down done");
		
		//Currency drop down - get last item
		
		WebElement w4=driver.findElement(By.name("currencyUomId"));
		Select sel4=new Select(w4);
		sel4.selectByIndex(20);
		System.out.println("Currency :"+sel4);
		

	}

}
