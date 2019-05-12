package com.sofia;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailSignInPageObj {
    //private static final Logger LOG = LogManager.getLogger(GmailSignInPageObj.class);
    private static final String SIGN_IN_PAGE = "https://mail.google.com";

    @FindBy(xpath = "//input[@id='identifierId']")
    private WebElement usernameInput;

    @FindBy(id = "profileIdentifier")
    private WebElement activeUsername;

    @FindBy(name = "password")
    private WebElement passwordInput;

    public GmailSignInPageObj(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void typeUernameAndSubmit(String usernameInputValue) {
        usernameInput.sendKeys(usernameInputValue);
        usernameInput.sendKeys(Keys.ENTER);
    }

    public void typePasswordAndSubmit(String passwordInputValue) {
        passwordInput.sendKeys(passwordInputValue);
        passwordInput.sendKeys(Keys.ENTER);
    }

    public void navigateToLoginPage(WebDriver driver) {
        driver.navigate().to(SIGN_IN_PAGE);
    }

    public String getActiveUsernameAttributeValue(){
        return activeUsername.getAttribute("innerHTML");
    }
}
