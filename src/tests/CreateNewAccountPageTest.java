package tests;

import org.junit.Test;

import pages.CreateNewAccountPage;
import pages.HomePage;

public class CreateNewAccountPageTest extends BaseTest {
   String firstName = "Marko";
   String lastName = "Markovic";
   String email = "marko@mts.rs";
   String password = "marko 123";
   String confirmPassword = "marko 123";
    
    @Test
    public void createNewAccount(){
         HomePage homePage = new HomePage(driver);
         CreateNewAccountPage createNewAccountPage = new CreateNewAccountPage(driver);

         homePage.goToHomePage();
         homePage.navigateToCreateNewAccountPage();
         createNewAccountPage.createAccount(firstName, lastName, email, password, confirmPassword);
         homePage.verifySuccessfulAccountCreation();
    }
}
