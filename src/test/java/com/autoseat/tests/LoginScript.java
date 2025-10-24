package com.autoseat.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginScript {

	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("Password123");
		driver.findElement(By.id("submit")).click();

		WebElement Text = driver.findElement(By.className("post-title"));
		String ActualText=Text.getText();
		String ExpectedText = "Logged In Successfully";
		Assert.assertEquals(ActualText, ExpectedText,"test case fail");
		System.out.println("Test case pass");
}
catch(){}
{
	}

	}

}
