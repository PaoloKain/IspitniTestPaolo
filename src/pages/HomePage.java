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
    By signInBtnBy = By.xpath("//a[@href='https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/']");
    By myAccountTitleBy = By.xpath("//span[@data-ui-id='page-title-wrapper']");
    By customerNameBtnBy = By.xpath("//span[@class='customer-name']");
    By logoutBtnBy = By.xpath("//a[@href='https://magento.softwaretestingboard.com/customer/account/logout/']");
    By whatsNewBtnBy = By.id("ui-id-3");
    By expandUserMenuBtnBy = By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/span/button");
    By signOutBtnBy = By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/div/ul/li[3]/a");
    
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

    public HomePage navigateToCustomerLoginPage(){
        clickElement(signInBtnBy);
        return this;
    }

    public HomePage verifySuccessfulLogin(){
        verifyElementIsVisible(welcomeUserBy);
        return this;
    }

    public HomePage navigateToWhatsNewPage(){
        clickElement(whatsNewBtnBy);
        return this;
    
    }

    public HomePage logout(){
       
        try{
            Thread.sleep(3000);
            }    catch(InterruptedException e){
                e.printStackTrace();
            }
       
       
       clickElement(expandUserMenuBtnBy);
       clickElement(signOutBtnBy);



       return this;
    }

    public HomePage verifySuccessfulLogout(){

        try{
            Thread.sleep(7000);
            }    catch(InterruptedException e){
                e.printStackTrace();
            }


        verifyElementIsVisible(signInBtnBy);
        return this;
    }

   
  
   }

    

    

   
    

    

