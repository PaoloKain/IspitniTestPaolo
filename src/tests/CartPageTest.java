package tests;

import org.junit.Test;

import pages.CustomerLoginPage;
import pages.HomePage;
import pages.ProductDetailsPage;
import pages.WhatsNewPage;

public class CartPageTest extends BaseTest{

    
    String postalCode = "1234";


    @Test
    public void addItemInCart(){
         HomePage homePage = new HomePage(driver);
         WhatsNewPage whatsNewPage = new WhatsNewPage(driver);
         CustomerLoginPage customerLoginPage = new CustomerLoginPage(driver);
         ProductDetailsPage productDetailsPage = new ProductDetailsPage(driver);

         homePage.goToHomePage();
         homePage.navigateToCustomerLoginPage();
         customerLoginPage.login(validEmail, validPassword);
         homePage.navigateToWhatsNewPage();
         whatsNewPage.openProductDetailsPage();
         productDetailsPage. addItemToCart();
    }

    
}
