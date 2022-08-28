package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishListPage extends PageBase{

    public WishListPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "a.product-name")
    public WebElement productWiches;

    @FindBy(xpath= "//button[@class='remove-btn']")
    WebElement removeProductbrn;

    @FindBy(id = "updatecart")
    WebElement updatecart;

    @FindBy(xpath = "//h1[contains(text(),'Wishlist')]")
    public WebElement WichListTxt;

    @FindBy(xpath = "//div[contains(@text(),'The wishlist is empty!')]")
    public WebElement afterremoveProduct;

 public void RemoveProductFromWishList(){

     clickButton(removeProductbrn);
     clickButton(updatecart);


 }


}
