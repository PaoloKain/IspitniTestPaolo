package tests;

import java.util.concurrent.TimeUnit;

import org.junit.Test;

import pages.CartPage;
import pages.CustomerLoginPage;
import pages.HomePage;
import pages.ProductDetailsPage;
import pages.WhatsNewPage;

public class CartPageTest extends BaseTest {
   
    double expectedItemPrice = 75.00;
    double expectedTax = 5.00;
    double expectedTotalPrice = 80.00;
    

    @Test
    public void verifyTheTotalPrice(){
        HomePage homePage = new HomePage(driver);
         WhatsNewPage whatsNewPage = new WhatsNewPage(driver);
         CustomerLoginPage customerLoginPage = new CustomerLoginPage(driver);
         ProductDetailsPage productDetailsPage = new ProductDetailsPage(driver);
         CartPage cartPage = new CartPage(driver);
         

         homePage.goToHomePage();
         homePage.navigateToCustomerLoginPage();
         customerLoginPage.login(validEmail, validPassword);
         homePage.navigateToWhatsNewPage();
         whatsNewPage.openProductDetailsPage();
         productDetailsPage. addItemToCart();
         productDetailsPage.navigateToCartPage();
         cartPage.extendShippingAndTaxOption();
         cartPage.addTax();
         cartPage.verifyItemPrice(expectedItemPrice);
         cartPage.verifyTax(expectedTax);
         
        // cartPage.verifyTax(expectedTax);
        // cartPage.verifyTotalPrice(expectedTotalPrice);        
         

    }
}
