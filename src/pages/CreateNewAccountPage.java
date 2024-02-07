package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateNewAccountPage extends BasePage {
     public CreateNewAccountPage(WebDriver driver){
        super(driver);
    }

    By firstNameInputBy = By.id("firstname");
    By lastNameInputBy = By.id("lastname");
    By emailInputBy = By.id("email_address");
    By passwordInputBy = By.id("password");
    By confirmPasswordInputBy = By.id("password-confirmation");
    By createAnAccountBtnBy = By.xpath("//button[@class='action submit primary']");

    public CreateNewAccountPage createAccount(String firstName, String lastName, String email, String password, String confirmPassword){
        enterText(firstNameInputBy, firstName);
        enterText(lastNameInputBy, lastName);
        enterText(emailInputBy, email);
        enterText(passwordInputBy, password);
        enterText(confirmPasswordInputBy, password);
        clickElement(createAnAccountBtnBy);  
        return this;
    }   

    
}
