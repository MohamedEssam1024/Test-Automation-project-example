package testCases;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.CustomersPage;
import pages.LoginPage;
import pages.MailTabPage;

import java.util.concurrent.TimeUnit;

public class AddCustomer extends TestBase{
    LoginPage loginPage;
    MailTabPage mailTabPage;
    CustomersPage customersPage;

    @Test
    public void addCustomer() {
        loginPage = new LoginPage(driver);
        loginPage.enterEmail("mohamed.essam@softxpert.com");
        loginPage.enterPassword("12345678a");
        loginPage.loginButton.click();
        mailTabPage = new MailTabPage(driver);
        mailTabPage.customerTabBtn.click();
        customersPage = new CustomersPage(driver);
        customersPage.addCustomerBtn.click();
        customersPage.setEmail("essam.softxpert+234235@gmail.com");
        customersPage.setFirstName("erf");
        customersPage.setPhone("89234798");
        customersPage.setLastName("whdfb");
        customersPage.setUserName("kjsdfkjbhw");
        Actions actions = new Actions(driver);
//        actions.moveToElement(customersPage.dropdown).click().perform();
        actions.moveToElement(customersPage.saveBtn).click().perform();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
