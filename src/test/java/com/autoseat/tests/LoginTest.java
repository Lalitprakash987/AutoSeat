package com.autoseat.tests;

import java.util.ArrayList;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.autoseat.base.BaseClass;
import com.autoseat.pages.LoginPage;

public class LoginTest extends BaseClass {

	// Logger create
	private static final Logger log = LogManager.getLogger(LoginTest.class);
	/*
	 * @Test(priority = 1) public void validLoginTest() {
	 * log.info("Starting valid login test");
	 * 
	 * LoginPage login = new LoginPage(driver);
	 * 
	 * log.info("Accepting cookies"); login.acceptCookies();
	 * 
	 * log.info("Clicking on account button"); login.clickAccount();
	 * 
	 * log.info("Entering valid email"); login.enterEmail("testuser@example.com");
	 * 
	 * log.info("Entering valid password"); login.enterPassword("Password123");
	 * 
	 * log.info("Clicking sign-in button"); login.clickSigninButton();
	 * 
	 * log.info("Login test completed successfully"); }
	 */

	@Test(priority = 2)
	public void test() throws InterruptedException {

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		Set<String> handles = driver.getWindowHandles();
		ArrayList<String> windows = new ArrayList<>(handles);

		driver.switchTo().window(windows.get(1)); // child window
		System.out.println("Child Title: " + driver.getTitle());

	}
}
