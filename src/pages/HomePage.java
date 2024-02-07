package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
     public HomePage(WebDriver driver){
        super(driver);
    }

    String baseUrl = "https://magento.softwaretestingboard.com/";
    By itemImageBy = By.xpath("//img[@class='product-image-photo']");

    public HomePage goToHomePage(){
        driver.get(baseUrl);
        return this;
    }

    public HomePage verifyNumberOfProducts(int expectedNumberOfProducts){
        int actualNumberOfProducts = countNumberOfElements(itemImageBy);
        verifyNumberOfElements(expectedNumberOfProducts, actualNumberOfProducts);
        return this;
    }
}
