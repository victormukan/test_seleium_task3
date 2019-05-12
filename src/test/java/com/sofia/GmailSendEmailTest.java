package com.sofia;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.AssertJUnit.assertEquals;

public class GmailSendEmailTest {
    private static final Logger LOG = LogManager.getLogger(GmailSendEmailTest .class);
    private static final String TEST_USERNAME = "sonyachanter@gmail.com";
    private static final String TEST_PASSWORD = "sonichka13";
    private static final String SENT_EMAIL_WIDGET = "Лист надіслано.";

    private WebDriver driver = DriverManager.getInstance();

    @Test
    public void logInAndSendEmail() {
        GmailSignInPageObj loginPage = new GmailSignInPageObj(driver);
        loginPage.navigateToLoginPage(driver);
        loginPage.typeUernameAndSubmit(TEST_USERNAME);

        assertEquals(loginPage.getActiveUsernameAttributeValue(), TEST_USERNAME);
        LOG.info("Username Correct");
        loginPage.typePasswordAndSubmit(TEST_PASSWORD);
        LOG.info("Log in successfully! ");
        GmailHomePage homePage = new GmailHomePage(driver);
        List checkboxes = homePage.getCheckboxes();
        for(int i = 0; i < 3, i++) {
            checkboxes.get(i)
        }

    }

    @AfterTest
    public void endTest() {
        driver.quit();
    }
}
