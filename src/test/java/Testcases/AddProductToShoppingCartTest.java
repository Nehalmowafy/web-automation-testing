package Testcases;

import PageObjects.ProductDetailsPage;
import PageObjects.SearchPage;
import PageObjects.ShoppingCartPage;
import Testcases.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddProductToShoppingCartTest extends TestBase {
SearchPage searchPage;
ShoppingCartPage cartPage;
ProductDetailsPage productDetails;
String ProductName = "Apple MacBook Pro 13-inch";

@Test(priority = 1)
    public void UserCanSearchProductsWithAutoSuggest () throws InterruptedException{
    searchPage = new SearchPage(driver);
    searchPage.ProductSearchUsingAutoSuggest("MacB");
    productDetails = new ProductDetailsPage(driver);
    Assert.assertTrue(productDetails.productNamebreadCrumb.getText().contains(ProductName));
}
@Test(priority = 2)
    public void UserCanAddProductToShoppingCart() throws InterruptedException {
    productDetails=new ProductDetailsPage(driver);
    cartPage =new ShoppingCartPage(driver);
    //driver.get("https://demo.nopcommerce.com/apple-macbook-pro-13-inch");
    // the line up this sentence of code is a stub for the frist Test method
    productDetails.addTOCart();
    //Thread.sleep(2000);
    driver.navigate().to("http://demo.nopcommerce.com"+"/cart");
    Assert.assertTrue(cartPage.totallbl.getText().equals("$3,600.00"));
}

@Test(priority = 3)
    public void UserCanRemoveProductFromCart(){
    cartPage=new ShoppingCartPage(driver);
    cartPage.RemoveProductFromCart();
    Assert.assertTrue(cartPage.emptyMessage.getText().equals("Your Shopping Cart is empty!"));
}


}
