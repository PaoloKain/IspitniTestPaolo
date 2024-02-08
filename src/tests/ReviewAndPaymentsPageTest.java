package tests;

import org.junit.Test;

import pages.CustomerLoginPage;
import pages.HomePage;
import pages.ProductDetailsPage;
import pages.ShippingPage;
import pages.WhatsNewPage;

public class ReviewAndPaymentsPageTest extends BaseTest {
    

    @Test
    public void verifyTheTotalPrice(){
        HomePage homePage = new HomePage(driver);
         WhatsNewPage whatsNewPage = new WhatsNewPage(driver);
         CustomerLoginPage customerLoginPage = new CustomerLoginPage(driver);
         ProductDetailsPage productDetailsPage = new ProductDetailsPage(driver);
         ShippingPage shippingPage = new ShippingPage(driver);

         homePage.goToHomePage();
         homePage.navigateToCustomerLoginPage();
         customerLoginPage.login(validEmail, validPassword);
         homePage.navigateToWhatsNewPage();
         whatsNewPage.openProductDetailsPage();
         productDetailsPage. addItemToCart();
         productDetailsPage.navigateToCheckOut();
         
         
         
         

    }
}
