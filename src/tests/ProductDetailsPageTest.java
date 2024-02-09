package tests;

import org.junit.Test;

import pages.CustomerLoginPage;
import pages.HomePage;
import pages.ProductDetailsPage;
import pages.WhatsNewPage;

public class ProductDetailsPageTest extends BaseTest{

    
    String postalCode = "1234";
    String expectedMessgaeitemInCart = "You added Stellar Solar Jacket to your shopping cart.";


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
         productDetailsPage.clickOnCartBtn();
         productDetailsPage.verifyItemIsInCart(expectedMessgaeitemInCart);
    }

    
}
