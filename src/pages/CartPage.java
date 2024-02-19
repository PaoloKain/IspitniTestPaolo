package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {
    public CartPage(WebDriver driver){
        super(driver);
    }

    //By addTaxBtnBy = By.id("s_method_flatrate_flatrate");
   // By extendShippingAndTaxOptionBtnBy = By.xpath("//*[@id=\"block-shipping\"]/div[1]");
    By addTaxBtnBy = By.xpath("//*[@id=\"co-shipping-method-form\"]/fieldset/dl/dd[2]/div/label");
    //By extendShippingAndTaxOptionBtnBy = By.xpath("//*[@id=\"block-shipping-heading\"]");

    By extendShippingAndTaxOptionBtnBy = By.cssSelector("#block-shipping > div:nth-child(1)");
    
    By itemPriceBy = By.xpath("//*[@id=\"cart-totals\"]/div/table/tbody/tr[1]/td/span");    
    By taxCostBy = By.xpath("//*[@id=\"cart-totals\"]/div/table/tbody/tr[2]/td/span");
   // By taxCostBy = By.cssSelector(null);
    By totalPriceBy = By.xpath("//*[@id=\"cart-totals\"]/div/table/tbody/tr[3]/td/strong/span");

    
    public CartPage extendShippingAndTaxOption(){
        clickElement(extendShippingAndTaxOptionBtnBy);
        return this;
    }

    public CartPage addTax(){
        clickElement(addTaxBtnBy);
        return this;
    }

/* 
   public CartPage verifyItemPrice(double expectedItemPrice){
        String priceText = readText( itemPriceBy).substring(1);
        double actualPrice = covertTextToNumber(priceText);
       // verifyPrice(expectedItemPrice, actualPrice);
        return this;
    }
    
    public CartPage verifyTax(double expectedTax){ 
        verifyElementIsVisible(taxCostBy);  
        String taxText = readText( taxCostBy).substring(1);
        double actualTax = covertTextToNumber(taxText);
        //verifyPrice(expectedTax, actualTax);
        return this;
    }

    public CartPage verifyTotalPrice(double expectedTotalPrice){
        String totalText = readText(totalPriceBy).substring(1);
        double actualTotal = covertTextToNumber(totalText);
       // verifyPrice(expectedTotalPrice, actualTotal);
        return this;
    }*/

   // public CartPage verifyItemPrice(double actualPrice,  double actualTax, double actualTotal){
        String priceText = readText( itemPriceBy).substring(1);
        double actualPrice = covertTextToNumber(priceText);
        String taxText = readText( taxCostBy).substring(1);
        double actualTax = covertTextToNumber(taxText);
        String totalText = readText(totalPriceBy).substring(1);
        double actualTotal = covertTextToNumber(totalText);

        //verifyPrice(actualPrice + actualTax, actualTotal);
    }


