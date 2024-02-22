package pages;

import org.checkerframework.checker.units.qual.radians;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomerLoginPage extends BasePage {
    public CustomerLoginPage(WebDriver driver){
        super(driver);
    }

    By emailInputBy = By.id("email");
    By passwordInputBy = By.id("pass");
    By signInBtnBy = By.id("send2");
    By errorMessageEmptyEmailBy = By.id("email-error");
    By errorMessageEmptyPasswordBy = By.id("pass-error");
    By errorMessageIncorrectEmailBy = By.id("email-error");
    By errorMessageWrongCredentialsBy = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    By forgotYourPasswordBtnBy = By.xpath("//a[@href='https://magento.softwaretestingboard.com/customer/account/forgotpassword/']");
    By passwordResetMessageBy = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    
    public CustomerLoginPage login(String email, String password){
        enterText(emailInputBy, email);
        enterText(passwordInputBy, password);
        clickElement(signInBtnBy);
        return this;
    }

    public CustomerLoginPage verifyUnsuccessfulLoginEmptyEmail(String expectedErrorMessageEmptyEmail){
        String actualErrorMessageEmptyEmail = readText(errorMessageEmptyEmailBy);
        verifyTextIsTheSame(expectedErrorMessageEmptyEmail, actualErrorMessageEmptyEmail);
        return this;
    }

    public CustomerLoginPage verifyUnsuccessfulLogninEmptyPassword(String expectedErrorMessageEmptyPassword){
        String actualErrorMessageEmptyPassword = readText(errorMessageEmptyPasswordBy);
        verifyTextIsTheSame(expectedErrorMessageEmptyPassword, actualErrorMessageEmptyPassword);
        return this;
    }
    
    public CustomerLoginPage verifyUnsuccessfulLoginIncorrectEmail(String expectedErrorMessageIncorrectEmail){
        String actualErrorMessageIncorrectEmail = readText(errorMessageIncorrectEmailBy);
        verifyTextIsTheSame(expectedErrorMessageIncorrectEmail, actualErrorMessageIncorrectEmail);
        return this;
    }

    public CustomerLoginPage verifyUnsuccessfulLoginWrongCredentials(String expectedErrorMessageWrongCredentials){
        String acutalErrorMessageWrongCredentials = readText(errorMessageWrongCredentialsBy);
        verifyTextIsTheSame(expectedErrorMessageWrongCredentials, acutalErrorMessageWrongCredentials);
        return this;
    }

    public CustomerLoginPage navigateToForgotYourPasswordPage(){
        clickElement( forgotYourPasswordBtnBy);
        return this;
    }

    public CustomerLoginPage verifySuccessfulPasswordReset(String expectedMessage){
       String actualMessage = readText( passwordResetMessageBy);
       verifyTextIsTheSame(expectedMessage, actualMessage);
        return this;
    }

  
}
