package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailsPage extends BasePage {
      public ProductDetailsPage(WebDriver driver){
        super(driver);
    }
    By itemSizeBtnBy = By.id("option-label-size-143-item-168");
    By itemColorBtnBy = By.id("option-label-color-93-item-50");
    By addToCartBtnBy = By.id("product-addtocart-button");
    By itemQuantityBy = By.id("qty");
    String itemQuantity = "1";
    By shoppingCartBtnBy = By.xpath("//a[@class='action showcart']");
    By messageItemInCart = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    By cartBtnBy = By.xpath("//*[@id=\"maincontent\"]/div[1]/div[2]/div/div/div/a");
    public ProductDetailsPage addItemToCart(){
        clickElement(itemSizeBtnBy);
        clickElement(itemColorBtnBy);
        enterText(itemQuantityBy,itemQuantity);
        clickElement(addToCartBtnBy);
        return this;
    }
    
    public ProductDetailsPage clickOnCartBtn(){
        clickElement(shoppingCartBtnBy);
        return this;
    }

    public ProductDetailsPage verifyItemIsInCart(String expectedMessageItemIncart){
        String acutalItemName = readText(messageItemInCart);
        verifyTextIsTheSame(expectedMessageItemIncart, acutalItemName);
        return this;
    }

    public ProductDetailsPage navigateToCartPage(){
        clickElement(cartBtnBy);
        return this;
    }
}
