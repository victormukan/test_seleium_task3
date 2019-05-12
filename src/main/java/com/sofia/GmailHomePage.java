package com.sofia;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class GmailHomePage {
    private static final String GMAIL_HOME_PAGE = "https://mail.google.com/mail/u/0/#inbox";

    @FindBys({@FindBy(xpath = "//div[@class='oZ-jc T-Jo J-J5-Ji']"), @FindBy(xpath = "//div[@role='checkbox']")})
    private List<WebElement> emailCheckboxes;

    public GmailHomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public List<WebElement> getCheckboxes(){
        return emailCheckboxes;
    }

    public void navigateToLoginPage(WebDriver driver) {
        driver.navigate().to(GMAIL_HOME_PAGE);
    }

}
