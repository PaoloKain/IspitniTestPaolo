package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomerLoginPage extends BasePage {
    public CustomerLoginPage(WebDriver driver){
        super(driver);
    }

    By emailInputBy = By.id("email");
    By passwordInputBy = By.id("pass");
    By signInBtnBy = By.id("send2");

    public CustomerLoginPage login(String email, String password){
        enterText(emailInputBy, email);
        enterText(passwordInputBy, password);
        clickElement(signInBtnBy);
        return this;
    }
    
}
