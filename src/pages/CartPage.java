package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {
    public CartPage(WebDriver driver){
        super(driver);
    }

    By addTaxBtnBy = By.id("s_method_flatrate_flatrate");
    By extendShippingAndTaxOptionBtnBy = By.xpath("//*[@id=\"block-shipping-heading\"]");
    By itemPriceBy = By.xpath("//*[@id=\"cart-totals\"]/div/table/tbody/tr[1]/td/span");
    By taxCostBy = By.xpath("//*[@id=\"cart-totals\"]/div/table/tbody/tr[2]/td/span");
    By totalPriceBy = By.xpath("//*[@id=\"cart-totals\"]/div/table/tbody/tr[3]/td/strong/span");
    public CartPage extendShippingAndTaxOption(){
        clickElement(extendShippingAndTaxOptionBtnBy);
        return this;
    }

    public CartPage addTax(){
        clickElement(addTaxBtnBy);
        return this;
    }

    public CartPage verifyItemPrice(){
        String priceText = readText( itemPriceBy).substring(1);
        double actualPrice = covertTextToNumber(priceText);
        String taxText = readText( taxCostBy).substring(1);
        double actualTax = covertTextToNumber(taxText);
        String totalText = readText(totalPriceBy).substring(1);
        double actualTotal = covertTextToNumber(totalText); 
        verifyPrice(actualPrice + actualTax, actualTotal);
        return this;
    }
    
}
