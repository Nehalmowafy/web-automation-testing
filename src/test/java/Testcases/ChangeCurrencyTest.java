package Testcases;

import PageObjects.HomePage;
import PageObjects.ProductDetailsPage;
import PageObjects.SearchPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChangeCurrencyTest extends TestBase{

    HomePage home;
    String productName = "Apple MacBook Pro 13-inch";
    SearchPage searchObject ;
    ProductDetailsPage detailsObject ;


    @Test(priority = 1)
    public void changeCurrencyOfTheProduct() {
        home = new HomePage(driver);
        home.changeCurrency();

    }



    @Test(priority = 2)
    public void UserCanSearchWithAutoSuggest()
    {
        detailsObject=new ProductDetailsPage(driver);
        try {
            searchObject = new SearchPage(driver);
            searchObject.ProductSearchUsingAutoSuggest("Mac");
            detailsObject = new ProductDetailsPage(driver);
            Assert.assertEquals(detailsObject.productNamebreadCrumb.getText(), productName);
            Assert.assertTrue(detailsObject.ProductPriceLabel.getText().contains("€"));
            System.out.println(detailsObject.ProductPriceLabel.getText());
        } catch (Exception e) {
            System.out.println("Error occurred  " + e.getMessage());
        }

    }




}
