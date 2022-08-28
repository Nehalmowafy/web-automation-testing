package Testcases;

import PageObjects.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductReviewTest extends TestBase{

    HomePage homeObject ;
    UserRegisteration registerObject ;
    LoginPage loginObject;
    SearchPage searchObject ;
    ProductDetailsPage detailsObject ;
    ProductReviewPage productReviewPage;

    String firstName="Tester4";
    String LastName="test";
    String Email="TesterTest8000@gmail.com";
    String Password="12345678";

    String productName = "Apple MacBook Pro 13-inch";

    String title="New Review";
    String text="this product is so good";





    //search For Product

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
    public void RegisteredUserCanReviewProduct(){
           detailsObject.openProductReviewPage();
           productReviewPage=new ProductReviewPage(driver);
        productReviewPage.AddReviewToProduct( title, text);
        Assert.assertTrue(productReviewPage.reviewmessageSuccessfully.
                getText().contains("Product review is successfully added."));

 }



}
