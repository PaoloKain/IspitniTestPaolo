package tests;

import org.junit.Test;

import pages.CustomerLoginPage;
import pages.ForgotYourPasswordPage;
import pages.HomePage;

public class ForgotYourPasswordPageTest extends BaseTest {


    String validEmail = "marko@mts.rs";
    String expectedMessage = "If there is an account associated with marko@mts.rs you will receive an email with a link to reset your password.";

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
    

