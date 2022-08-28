package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Wait;

public class ProductDetailsPage extends PageBase {

/**/
    public ProductDetailsPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css="strong.current-item")
    public WebElement productNamebreadCrumb;

    @FindBy(css = "button.button-2.email-a-friend-button")
    WebElement EmailFriendButton;

    @FindBy(id = "price-value-4")
     public WebElement ProductPriceLabel;

    @FindBy(linkText= "Add your review")
    public WebElement addYourReview;

    @FindBy(id="add-to-wishlist-button-4")
    WebElement wishList;

    @FindBy(css="button.button-2.add-to-compare-list-button")
    WebElement addtoCompareBtn;

    @FindBy(xpath="//button[@id='add-to-cart-button-4']")
    WebElement addToCartBtn;


    public void addTOCart() throws InterruptedException {
        Thread.sleep(2000);

        addToCartBtn.click();

    }
    public void SendEmailToYourFriend(){
        clickButton(EmailFriendButton);
    }
   public void openProductReviewPage(){clickButton(addYourReview);}

    public void addToWishList(){clickButton(wishList);}

    public void addToComareProductsList(){

        clickButton(addtoCompareBtn);}


}
