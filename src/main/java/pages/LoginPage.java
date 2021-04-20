package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase{

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "email")
    private WebElement email;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(css = "Button.btn.btn-primary")
    public WebElement loginButton;

    @FindBy(css = "div.container.form-error-container.ng-star-inserted")
    public WebElement errorMessage;

    public void enterEmail(String email) {
        this.email.clear();
        setTextElementText(this.email, email);
    }

    public void enterPassword(String password){
        this.password.clear();
        setTextElementText(this.password,password);
    }

}

