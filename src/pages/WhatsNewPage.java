package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WhatsNewPage extends BasePage {
    public WhatsNewPage(WebDriver driver){
        super(driver);
    }

    By itemBtnBy = By.xpath("//a[@title='Stellar Solar Jacket']");
   
    
    public void openProductDetailsPage(){
        clickElement(itemBtnBy);
    }
}

