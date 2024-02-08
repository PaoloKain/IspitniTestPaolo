package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotYourPasswordPage extends BasePage {
     public ForgotYourPasswordPage(WebDriver driver){
        super(driver);
    }

    By emailInputBy = By.id("email_address");
    By resetMyPasswordBtnBy = By.xpath("//button[@class='action submit primary']");

    public ForgotYourPasswordPage resetMyPassword(String email){
        enterText(emailInputBy, email);
        clickElement(resetMyPasswordBtnBy);
        return this;
    }
    
}
