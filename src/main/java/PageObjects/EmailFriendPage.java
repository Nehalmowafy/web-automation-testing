package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmailFriendPage extends PageBase{
    public EmailFriendPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "FriendEmail")
    WebElement friendEmail ;

    @FindBy(id = "PersonalMessage")
    WebElement personalMessage ;

    @FindBy(name="send-email")
    WebElement sendEmailBtn ;

    @FindBy(css = "div.result")
   public WebElement EmailMessage ;

    public void sendEmailToFriend (String email,String Message)
    {
        setTextElementText(friendEmail,email);
        setTextElementText(personalMessage,Message);
        clickButton(sendEmailBtn);


    }







}
