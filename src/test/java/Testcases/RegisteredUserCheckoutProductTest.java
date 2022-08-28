package Testcases;


import PageObjects.*;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisteredUserCheckoutProductTest extends TestBase {


   String Email="testnehal56110@gmail.com";
    HomePage homeObject;

    UserRegisteration registerObject;
    LoginPage loginobj;
    String productname = "Apple MacBook Pro 13-inch";

    SearchPage searchObj;
    ShoppingCartPage cartPage;
    ProductDetailsPage productDetails;
    CheckoutPage checkoutObject;




    @Test(priority =1)
    public void UserCanSearchWithAutoSuggest()
    {
        try {
            searchObj = new SearchPage(driver);
            searchObj.ProductSearchUsingAutoSuggest("Mac");
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

        productDetails.addTOCart();

        driver.navigate().to("http://demo.nopcommerce.com" + "/cart");
                Thread.sleep(2000);
        Assert.assertTrue(cartPage.totallbl.getText().contains("€6192.00"));
    }
    @Test(priority = 3)
    public void UserCanCheckoutProduct() throws InterruptedException {
       // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        checkoutObject= new CheckoutPage(driver);

//
        cartPage.OpenCheckoutPage();
        checkoutObject.RegisteredUserCheckoutProduct("Egypt","test address","123456","3244456788","Cairo",productname);
        Assert.assertTrue(checkoutObject.productname.isDisplayed());
        Assert.assertTrue(checkoutObject.productname.getText().contains(productname));
        checkoutObject.confirmOrder();
        Assert.assertTrue(checkoutObject.ThankYoulb1.isDisplayed());
    }


}

