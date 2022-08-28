package Testcases;

import PageObjects.ProductDetailsPage;
import PageObjects.SearchPage;
import PageObjects.WishListPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;


public class WishListTest extends TestBase{

    String productName = "Apple MacBook Pro 13-inch";
    SearchPage searchObject ;
    ProductDetailsPage detailsObject ;
    WishListPage wishListPage;


    @Test(priority = 1)
    public void UserCanSearchWithAutoSuggest()

    {

        try {
            searchObject = new SearchPage(driver);
            searchObject.ProductSearchUsingAutoSuggest("Mac");
            detailsObject = new ProductDetailsPage(driver);
            Assert.assertEquals(detailsObject.productNamebreadCrumb.getText(), productName);
        } catch (Exception e) {
            System.out.println("Error occurred  " + e.getMessage());
        }
    }

    @Test(priority = 2)
    public void usrerCanAddToWishList(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        detailsObject=new ProductDetailsPage(driver);
        detailsObject.addToWishList();
        driver.navigate().to("https://demo.nopcommerce.com/wishlist");
        wishListPage=new WishListPage(driver);
        Assert.assertTrue(wishListPage.WichListTxt.isDisplayed());
        Assert.assertTrue(wishListPage.productWiches.getText().contains(productName));

    }

  /*  @Test(priority = 3)
    public void UserRemoveProductFromWishesList() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wishListPage=new WishListPage(driver);
//        wishListPage.RemoveProductFromWishList();
        Thread.sleep(3000);
        Assert.assertTrue(wishListPage.afterremoveProduct.getText().contains("The wishlist is empty!"));
    }
*/

}
