package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductReviewPage extends PageBase{
    public ProductReviewPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id="AddProductReview_Title")
    WebElement reviewTitle;

    @FindBy(id="AddProductReview_ReviewText")
    WebElement reviewText;

    @FindBy(name = "add-review")
    WebElement submitReview;

    @FindBy(id="addproductrating_5")
    WebElement checkBoxRating5;

    @FindBy(css="div.result")
  public   WebElement reviewmessageSuccessfully;//

    public void AddReviewToProduct(String title , String text){
        setTextElementText(reviewTitle,title);
        setTextElementText(reviewText,text);
        clickButton(checkBoxRating5);
        clickButton(submitReview);


    }
}
