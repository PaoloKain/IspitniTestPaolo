package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
     public HomePage(WebDriver driver){
        super(driver);
    }

    String baseUrl = "https://magento.softwaretestingboard.com/";
    By itemImageBy = By.xpath("//img[@class='product-image-photo']");
    By createAnAccountBtnBy = By.xpath("//a[@href='https://magento.softwaretestingboard.com/customer/account/create/']");
    By welcomeUserBy = By.xpath("//span[@class='logged-in']");
    public HomePage goToHomePage(){
        driver.get(baseUrl);
        return this;
    }

    public HomePage verifyNumberOfProducts(int expectedNumberOfProducts){
        int actualNumberOfProducts = countNumberOfElements(itemImageBy);
        verifyNumberOfElements(expectedNumberOfProducts, actualNumberOfProducts);
        return this;
    }

    public HomePage navigateToCreateNewAccountPage(){
        clickElement(createAnAccountBtnBy);
        return this;
    
    }

    public HomePage verifySuccessfulAccountCreation(){
        verifyElementIsVisible(welcomeUserBy);
         return this;
    }
}
