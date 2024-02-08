package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShippingPage extends BasePage {
     public ShippingPage(WebDriver driver){
        super(driver);
    }

    By newAdressBtnBy = By.xpath("//button[@class='action action-show-popup']");
 

    public ShippingPage openShippingInformation(){
        clickElement(newAdressBtnBy);
        return this;
    }
}
