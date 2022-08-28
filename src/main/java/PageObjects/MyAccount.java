package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccount extends PageBase {


    public MyAccount(WebDriver driver) {
        super(driver);
    }
    @FindBy(linkText = "Change password")
    WebElement changepasswordbtn;

    public void openChangepasswordPage ()
    {
        clickButton(changepasswordbtn);
    }
    @FindBy(linkText="Change password")
    WebElement changePasswordLink ;

    @FindBy(id = "OldPassword")
    WebElement oldPasswordTxt;

    @FindBy(id = "NewPassword")
    WebElement newPasswordTxt;

    @FindBy(id = "ConfirmNewPassword")
    WebElement confirmPasswordTxt;

    @FindBy(css = "Button.button-1.change-password-button")
    WebElement ChangePasswordBtn;

    @FindBy(css = "p.content")
    public WebElement resultLbl;

    @FindBy(css = "span.close")
    public WebElement closealertbtn;

    public void ChangePassword(String oldpassword, String newpassword){
        setTextElementText(oldPasswordTxt, oldpassword);
        setTextElementText(newPasswordTxt, newpassword);
        setTextElementText(confirmPasswordTxt, newpassword);
        clickButton(ChangePasswordBtn);
    }
    public void clickonclose()
    {
        clickButton(closealertbtn);
    }




}
