package tests;

import org.junit.Test;

import pages.HomePage;

public class HomePageTest extends BaseTest {

    int expectedNumberOfProducts = 6;

    @Test
    public void navigationToHomePage(){
        HomePage homePage = new HomePage(driver);

        homePage.goToHomePage();
        
    }

    @Test
    public void verifyNumberOfProducts(){
        HomePage homePage = new HomePage(driver);

        homePage.goToHomePage();
        homePage.verifyNumberOfProducts(expectedNumberOfProducts);
    }
    
}
