package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {
    public CartPage(WebDriver driver){
        super(driver);
    }

    By extendShippingAndTaxOptionBtnBy = By.xpath("//div[@id='block-shipping']");
    By subTotalItemPriceBy = By.xpath("//*[@id=\"cart-totals\"]/div/table/tbody/tr[1]/td/span");    
    By flatRateFixedPriceBy = By.xpath("/html/body/div[2]/main/div[3]/div/div[3]/div[1]/div[1]/div[2]/form[2]/fieldset/dl/dd[2]/div/label/span/span");
    By orderTotalPriceBy = By.xpath("/html/body/div[2]/main/div[3]/div/div[3]/div[1]/div[2]/div/table/tbody/tr[3]/td/strong/span");
   


   

    public CartPage verifySubtotalPriceAndFinalTotalPrice(){

        try{
            Thread.sleep(3000);
            }    catch(InterruptedException e){
                e.printStackTrace();
            }

            clickElement(extendShippingAndTaxOptionBtnBy);


        String subTotalPriceText = readText(subTotalItemPriceBy).substring(1);
        double actualSubTotalPriceNumber = covertTextToNumber(subTotalPriceText);
       
        
        String flatRateFixedText = readText(flatRateFixedPriceBy).substring(1);
        double actualFlatRateFixedPriceNumber = covertTextToNumber(flatRateFixedText);

        double actualSubTotalPrice;
        actualSubTotalPrice = actualSubTotalPriceNumber + actualFlatRateFixedPriceNumber;

        clickElement(flatRateFixedPriceBy);

       // try{
           // Thread.sleep(3000);
          //  }    catch(InterruptedException e){
              //  e.printStackTrace();
          //  }

            
            String orderTotalPriceText = readText(orderTotalPriceBy).substring(1);
            double actualOrderTotalPrice = covertTextToNumber(orderTotalPriceText);

            verifyPrice(actualSubTotalPrice, actualOrderTotalPrice);
            return this;
        }
    }

 


