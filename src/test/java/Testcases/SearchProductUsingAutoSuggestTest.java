package Testcases;

import PageObjects.ProductDetailsPage;
import PageObjects.SearchPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchProductUsingAutoSuggestTest extends TestBase{
    String productName = "Apple MacBook Pro 13-inch";
    SearchPage searchObject ;
    ProductDetailsPage detailsObject ;

    @Test
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
}

