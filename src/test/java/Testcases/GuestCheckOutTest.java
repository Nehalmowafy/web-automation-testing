package Testcases;

import PageObjects.*;
import PageObjects.HomePage;
import PageObjects.SearchPage;
import Testcases.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GuestCheckOutTest extends TestBase {
 String Email ="omartester283@gmail.com";
    SearchPage searchObject;

    ProductDetailsPage productDetails;
    ShoppingCartPage cartPage;

    CheckoutPage checkoutObject;
    String productname = "Apple MacBook Pro 13-inch";
    OrderDetails orderobj;

    @Test(priority = 1)
    public void UserCanSearchWithAutoSuggest() {
        try {
            searchObject = new SearchPage(driver);
            searchObject.ProductSearchUsingAutoSuggest("Mac");
            productDetails = new ProductDetailsPage(driver);
            Assert.assertEquals(productDetails.productNamebreadCrumb.getText(), productname);
        } catch (Exception e) {
            System.out.println("Error occurred  " + e.getMessage());
        }
    }

    @Test(priority = 2)
    public void UserCanAddProductToShoppingCart() throws InterruptedException {
        productDetails = new ProductDetailsPage(driver);
        cartPage = new ShoppingCartPage(driver);
        //  driver.get("https://demo.nopcommerce.com/apple-macbook-pro-13-inch");
        // the line up this sentence of code is a stub for the frist Test method
        productDetails.addTOCart();
        //Thread.sleep(2000);
        driver.navigate().to("http://demo.nopcommerce.com" + "/cart");
        Thread.sleep(2000);
        Assert.assertTrue(cartPage.totallbl.getText().contains("€3096.00"));
    }

    @Test(priority = 3)
    public void UserCanCheckoutProduct() throws InterruptedException {
        // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        checkoutObject = new CheckoutPage(driver);
//
//        Actions action = new Actions(driver);
//        action.moveToElement(cartPage.agreeCheckbox).click().build().perform();
            orderobj=new OrderDetails(driver);
    Thread.sleep(2000);
        cartPage.OpenCheckoutPageAsGuest();
        checkoutObject.GuestCheckoutProduct("omar", "abdu",Email, "Egypt", "test address", "123456", "3244456788", "Cairo", productname);
        Assert.assertTrue(checkoutObject.productname.isDisplayed());
        Assert.assertTrue(checkoutObject.productname.getText().contains(productname));
        checkoutObject.confirmOrder();
        Assert.assertTrue(checkoutObject.ThankYoulb1.isDisplayed());
        orderobj.orderdetails();
    }
}