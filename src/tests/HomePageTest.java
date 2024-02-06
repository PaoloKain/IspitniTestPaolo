package tests;

import org.junit.Test;

import pages.HomePage;

public class HomePageTest extends BaseTest {

    @Test
    public void navigationToHomePage(){
        HomePage homePage = new HomePage(driver);

        homePage.goToHomePage();
        
    }
    
}
