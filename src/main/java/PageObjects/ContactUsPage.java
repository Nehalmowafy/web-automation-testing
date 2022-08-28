package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends PageBase{
    public ContactUsPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id ="FullName")
    WebElement fullNameTxt;

    @FindBy(id ="Email")
    WebElement emailTxt;

    @FindBy(id ="Enquiry")
    WebElement enquiryTxt;

    @FindBy(name = "send-email")
    WebElement submitBtn;

    @FindBy(css = "div.result")
    public WebElement successMessage;


    public void contactUs(String fullName,String email , String enquiry)
    {
        setTextElementText(fullNameTxt,fullName);
        setTextElementText((emailTxt),email);
        setTextElementText((enquiryTxt),enquiry);
        clickButton(submitBtn);

    }




}
