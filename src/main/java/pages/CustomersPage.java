package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CustomersPage extends PageBase{
    public CustomersPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "button.btn.btn-primary")
    public WebElement addCustomerBtn;

    @FindBy(xpath = "/html/body/modal-container/div/div/app-add-customer/form/app-modal/div[1]/h4/text()")
    public String[] addCustomerPopupTtl;

    @FindBy(id = "first_name")
    WebElement firstName;

    @FindBy(id = "last_name")
    WebElement lastName;

    @FindBy(id = "username")
    WebElement userName;

    @FindBy (id = "phone")
    WebElement phone;

    @FindBy (id = "email")
    WebElement email;

    @FindBy (className = "dropdown")
    public WebElement dropdown;

    @FindBy (css = "button.btn.btn-primary")
    public WebElement saveBtn;

    public void setFirstName(String firstName) {
        setTextElementText(this.firstName,firstName);
    }

    public void setLastName(String lastName) {
        setTextElementText(this.lastName,lastName);
    }

    public void setUserName(String username) {
        setTextElementText(this.userName,username);
    }

    public void setEmail(String email) {
        setTextElementText(this.email,email);
    }

    public void setPhone(String phone) {
        setTextElementText(this.phone,phone);
    }
}
