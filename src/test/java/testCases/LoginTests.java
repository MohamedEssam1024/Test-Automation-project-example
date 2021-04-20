package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MailTabPage;

public class LoginTests extends TestBase{

    LoginPage loginPage;
    MailTabPage mailTabPage;

    @Test(priority = 2)
    public void loginWithValidData(){
        loginPage = new LoginPage(driver);
        loginPage.enterEmail("mohamed.essam@softxpert.com");
        loginPage.enterPassword("12345678a");
        loginPage.loginButton.click();
        mailTabPage = new MailTabPage(driver);
        Assert.assertEquals(mailTabPage.storeName.getText(),"PSM Demo12s43 m");
    }

    @Test(priority = 1)
    public void loginWithInvalidData(){
        loginPage = new LoginPage(driver);
        loginPage.enterEmail("mohamed.essam@softxpert.com");
        loginPage.enterPassword("12345678ah");
        loginPage.loginButton.click();
        Assert.assertEquals(loginPage.errorMessage.getText(),"Invalid email or password.");
    }

}
