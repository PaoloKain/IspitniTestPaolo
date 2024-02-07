package tests;

import org.junit.Test;

import pages.CustomerLoginPage;
import pages.HomePage;

public class CustomerLoginTest extends BaseTest {

    String validEmail = "marko@mts.rs";
    String validPassword = "marko 123";
    
    

    @Test
    public void verifySuccessfulLogin(){
        HomePage homePage = new HomePage(driver);
        CustomerLoginPage customerLoginPage = new CustomerLoginPage(driver);

        homePage.goToHomePage();
        homePage.navigateToCustomerLoginPage();
        customerLoginPage.login(validEmail, validPassword);
        homePage.verifySuccessfulLogin();
        
         
    }
}
