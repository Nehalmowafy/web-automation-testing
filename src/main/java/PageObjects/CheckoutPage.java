package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

public class CheckoutPage extends PageBase {

    public CheckoutPage(WebDriver driver) {
        super(driver);

        actions = new Actions(driver);
    }

    @FindBy(name = "BillingNewAddress.FirstName")
    WebElement fnTxt;
    @FindBy(id = "BillingNewAddress_LastName")
    WebElement lnTxt;
    @FindBy(id = "BillingNewAddress_Email")
    WebElement emailTxt;
    @FindBy(id = "BillingNewAddress_CountryId")
    WebElement countryList;
    @FindBy(id = "BillingNewAddress_PhoneNumber")
    WebElement phoneTxt;
    @FindBy(id = "BillingNewAddress_City")
    WebElement cityTxt;
    @FindBy(id = "BillingNewAddress_Address1")
    WebElement addressTxt;
    @FindBy(id = "BillingNewAddress_ZipPostalCode")
    WebElement postCodeTxt;
    @FindBy(xpath = "//button[contains(@onclick,\"Billing.save()\")]")
    WebElement continueBtn;
    @FindBy(xpath = "//input[@id='shippingoption_1']")
    WebElement shippingMethodRdo;
    @FindBy(xpath = "//button[contains(@onclick,'PaymentMethod.save()')]")
    WebElement continuePaymentBtn;
    @FindBy(xpath = "//button[contains(@onclick,'PaymentInfo.save()')]")
    WebElement continueInfoBtn;
    @FindBy(linkText = "Apple MacBook Pro 13-inch")
    public WebElement productname;
    @FindBy(css = "input.button-1.confirm-order-next-step-button")
    WebElement confrimBtn;
    @FindBy(css = "h1")
    public WebElement ThankYoulb1;
    @FindBy(css = "div.title")
    public WebElement successMessage;
    @FindBy(xpath = "//button[contains(@onclick,'ShippingMethod.save()')]")
    WebElement continueShippingBtn;
    @FindBy(id = "BillingNewAddress_CountryId")
    WebElement selectt;
    @FindBy(xpath = "//input[@id='paymentmethod_0']")
    WebElement visardio;
    @FindBy(xpath = "//button[contains(@onclick,'ConfirmOrder.save()')]")
    WebElement confirmbtn;
    @FindBy(xpath="//button[contains(@class,'button-1 checkout-as-guest-button')]")
    WebElement guestbtn;
    @FindBy(id="BillingNewAddress_FirstName")
    WebElement frsttext;
    @FindBy(id="BillingNewAddress_LastName")
    WebElement lstext;
    @FindBy(id="BillingNewAddress_Email")
    WebElement emailtext;
@FindBy(linkText = "Click here for order details.")
WebElement clickhere;
@FindBy(linkText="PDF Invoice")
WebElement pdfbtn;




    public void RegisteredUserCheckoutProduct
            (String countryName, String address, String postcode, String phone, String city, String productName) throws InterruptedException {
//    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        select = new Select(selectt);
        select.selectByVisibleText(countryName);
        cityTxt.sendKeys(city);
        addressTxt.sendKeys(address);
        postCodeTxt.sendKeys(postcode);
        phoneTxt.sendKeys(phone);
        //Thread.sleep(10000);
        continueBtn.click();
        //wait.until(ExpectedConditions.elementToBeClickable(shippingMethodRdo));
        Thread.sleep(5000);
        shippingMethodRdo.click();
        Thread.sleep(5000);
        continueShippingBtn.click();
        Thread.sleep(5000);
        continuePaymentBtn.click();
        Thread.sleep(5000);
        continueInfoBtn.click();
        Thread.sleep(5000);
    }

    //  Assert.assertTrue(productname.isDisplayed());
//    Assert.assertTrue(productname.getText().contains(productName));
    public void confirmOrder() throws InterruptedException {
        Thread.sleep(2000);
        confirmbtn.click();



    }

//
//        Assert.assertTrue(ThankYoulb1.isDisplayed());
//    Assert.assertTrue(successMessage.getText().contains("Your order has been successfully processed!"));


    public void GuestCheckoutProduct
            (String firstname, String lastname,String email, String countryName, String address, String postcode, String phone, String city, String productName) throws InterruptedException {
//    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        frsttext.sendKeys(firstname);
        lstext.sendKeys(lastname);
        emailtext.sendKeys(email);
        select = new Select(selectt);
        select.selectByVisibleText(countryName);
        cityTxt.sendKeys(city);
        addressTxt.sendKeys(address);
        postCodeTxt.sendKeys(postcode);
        phoneTxt.sendKeys(phone);
        //Thread.sleep(10000);
        continueBtn.click();
        //wait.until(ExpectedConditions.elementToBeClickable(shippingMethodRdo));
        Thread.sleep(5000);
        shippingMethodRdo.click();
        Thread.sleep(5000);
        continueShippingBtn.click();
        Thread.sleep(5000);
        continuePaymentBtn.click();
        Thread.sleep(5000);
        continueInfoBtn.click();
        Thread.sleep(5000);
    }

}