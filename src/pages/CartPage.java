package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {
    public CartPage(WebDriver driver){
        super(driver);
    }

    By addTaxBtnBy = By.id("s_method_flatrate_flatrate");
    By extendShippingAndTaxOptionBtnBy = By.xpath("//*[@id=\"block-shipping-heading\"]");



    public CartPage extendShippingAndTaxOption(){
        clickElement(extendShippingAndTaxOptionBtnBy);
        return this;
    }

    public CartPage addTax(){
        clickElement(addTaxBtnBy);
        return this;
    }
    
}
