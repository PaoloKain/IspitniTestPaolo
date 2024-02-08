package tests;

import org.junit.Test;

import pages.HomePage;
import pages.ProductDetailsPage;
import pages.WhatsNewPage;

public class CartPageTest extends BaseTest{


    @Test
    public void addItemInCart(){
         HomePage homePage = new HomePage(driver);
         WhatsNewPage whatsNewPage = new WhatsNewPage(driver);
         ProductDetailsPage productDetailsPage = new ProductDetailsPage(driver);

         homePage.goToHomePage();
         homePage.navigateToWhatsNewPage();
         whatsNewPage.openProductDetailsPage();
         productDetailsPage. addItemToCart();
    }
    
}
