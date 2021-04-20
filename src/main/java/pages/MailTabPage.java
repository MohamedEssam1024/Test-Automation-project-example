package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MailTabPage extends PageBase{

    public MailTabPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "span.store-name.truncate.pr-2.d-sm-block.d-none")
    public WebElement storeName;


    @FindBy(xpath = "/html/body/app-root/div[2]/app-master/div/header/div/div[3]/app-main-menu/div/div/ul/li[2]/a")
    public WebElement customerTabBtn;

}
