package tests;

import org.junit.Test;

import pages.CustomerLoginPage;
import pages.ForgotYourPasswordPage;
import pages.HomePage;

public class CustomerLoginTest extends BaseTest {

    String validEmail = "marko@mts.rs";
    String validPassword = "marko 123";
    String incorrectEmail = "asdf";
    String wrongCredentials = "to@mts.rs";
    String expectedErrorMessageEmptyEmail = "This is a required field.";
    String expectedErrorMessageEmptyPassword = "This is a required field.";
    String expectedErrorMessageIncorrectEmail = "Please enter a valid email address (Ex: johndoe@domain.com).";
    String expectedErrorMessageWrongCredentials = "The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later.";
    String expectedMessage = "If there is an account associated with marko@mts.rs you will receive an email with a link to reset your password.";
    

    @Test
    public void verifySuccessfulLogin(){
        HomePage homePage = new HomePage(driver);
        CustomerLoginPage customerLoginPage = new CustomerLoginPage(driver);

        homePage.goToHomePage();
        homePage.navigateToCustomerLoginPage();
        customerLoginPage.login(validEmail, validPassword);
        homePage.verifySuccessfulLogin();
        
        }
    @Test
    public void verifyUnsuccessfulLoginEmptyEmail(){
        HomePage homePage = new HomePage(driver);
        CustomerLoginPage customerLoginPage = new CustomerLoginPage(driver);

        homePage.goToHomePage();
        homePage.navigateToCustomerLoginPage();
        customerLoginPage.login("", validPassword);
        customerLoginPage.verifyUnsuccessfulLoginEmptyEmail(expectedErrorMessageEmptyEmail);

    }

    @Test
    public void verifyUnsuccessfulLoginEmptyPassword(){
        HomePage homePage = new HomePage(driver);
        CustomerLoginPage customerLoginPage = new CustomerLoginPage(driver);

        homePage.goToHomePage();
        homePage.navigateToCustomerLoginPage();
        customerLoginPage.login(validEmail, "");
        customerLoginPage.verifyUnsuccessfulLogninEmptyPassword(expectedErrorMessageEmptyPassword);
    }

    @Test
    public void verifyUnsuccessfulLoginIncorrectEmail(){
        HomePage homePage = new HomePage(driver);
        CustomerLoginPage customerLoginPage = new CustomerLoginPage(driver);

        homePage.goToHomePage();
        homePage.navigateToCustomerLoginPage();
        customerLoginPage.login(incorrectEmail, validPassword);
        customerLoginPage.verifyUnsuccessfulLoginIncorrectEmail(expectedErrorMessageIncorrectEmail);
    }

    @Test
    public void verifyUnsuccessfulLoginWrongCrededentials(){
        HomePage homePage = new HomePage(driver);
        CustomerLoginPage customerLoginPage = new CustomerLoginPage(driver);

        homePage.goToHomePage();
        homePage.navigateToCustomerLoginPage();
        customerLoginPage.login(wrongCredentials, wrongCredentials);
        customerLoginPage. verifyUnsuccessfulLoginWrongCredentials(expectedErrorMessageWrongCredentials);
    }

    @Test
    public void verifySuccessfulLogout(){
        HomePage homePage = new HomePage(driver);
        CustomerLoginPage customerLoginPage = new CustomerLoginPage(driver);

        homePage.goToHomePage();
        homePage.navigateToCustomerLoginPage();
        customerLoginPage.login(validEmail, validPassword);
        homePage.logout();

    }

    @Test
    public void resetYourPasswordOption(){
         HomePage homePage = new HomePage(driver);
        CustomerLoginPage customerLoginPage = new CustomerLoginPage(driver);
        ForgotYourPasswordPage forgotYourPasswordPage = new ForgotYourPasswordPage(driver);

        homePage.goToHomePage();
        homePage.navigateToCustomerLoginPage();
        customerLoginPage. navigateToForgotYourPasswordPage();
        forgotYourPasswordPage.resetMyPassword(validEmail);
        customerLoginPage.verifySuccessfulPasswordReset(expectedMessage);
    }

    
       
}
