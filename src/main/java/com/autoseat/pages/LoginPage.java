package com.autoseat.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[@class='header__icon header__icon--account link focus-inset small-hide']//account-icon//*[name()='svg']")
	WebElement Account;

	@FindBy(id = "CustomerEmail")
	WebElement email;

	@FindBy(id = "CustomerPassword")
	WebElement password;

	@FindBy(xpath = "//button[normalize-space()='Sign in']")
	WebElement signinButton;

	public void clickAccount() {
		Account.click();

	}

	@FindBy(id = "shopify-pc__banner__btn-accept")
	private WebElement acceptCookieButton;

	public void enterEmail(String emails) {

		email.sendKeys(emails);

	}

	public void enterPassword(String passwords) {
		password.sendKeys(passwords);
	}

	public void clickSigninButton() {
		signinButton.click();

	}

	public void acceptCookies() {
		try {
			if (acceptCookieButton.isDisplayed()) {
				acceptCookieButton.click();
			}
		} catch (Exception e) {

		}
	}
}
