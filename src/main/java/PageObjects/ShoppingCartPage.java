package PageObjects;

import PageObjects.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ShoppingCartPage extends PageBase {
    public ShoppingCartPage(WebDriver driver) {
        super(driver);

    }
    @FindBy(css="div.no-data")
   public WebElement emptyMessage;


    @FindBy(id="checkout")
    WebElement checkoutBtn;

    @FindBy(xpath="//input[@id='termsofservice']")
     public  WebElement agreeCheckbox;
    @FindBy (css="button.remove-btn")
    WebElement removeCheck;

    @FindBy(xpath="//button[@id='updatecart']")
    WebElement updtcart;
    @FindBy(css = "input.qty-input")
    WebElement quantityTxt;
    @FindBy (xpath="//span[@class='product-subtotal']")
    public WebElement totallbl;
@FindBy(xpath="//button[contains(text(),'Checkout as Guest')]")
WebElement guestcheckbtn;

    public void RemoveProductFromCart() {
        removeCheck.click();
    }

    public void UpdateProductQuantityInCart(String quantity) {
        quantityTxt.clear();
        quantityTxt.sendKeys(quantity);
        updtcart.click();
    }

    public void OpenCheckoutPage ()  {
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       // wait.until(ExpectedConditions.elementToBeClickable(agreeCheckbox));
         updtcart.click();
        agreeCheckbox.click();
        //action.moveToElement(agreeCheckbox).click().build().perform();
        checkoutBtn.click();


    }
    public void OpenCheckoutPageAsGuest(){

        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // wait.until(ExpectedConditions.elementToBeClickable(agreeCheckbox));

        agreeCheckbox.click();
        //action.moveToElement(agreeCheckbox).click().build().perform();
        checkoutBtn.click();
        guestcheckbtn.click();

    }
}
