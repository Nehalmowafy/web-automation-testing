package Testcases;

import PageObjects.ProductDetailsPage;
import PageObjects.SearchPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchProductTest extends  TestBase {
    SearchPage srchobj;
    ProductDetailsPage detailsObj;
    String productName = "Apple MacBook Pro 13-inch";

    @Test
    public void UserCanSearchForProducts()
    {
        srchobj  = new SearchPage(driver);
        detailsObj = new ProductDetailsPage(driver);
        srchobj.ProductSearch(productName);
        srchobj.OpenProductDetailsPage();
        Assert.assertEquals(detailsObj.productNamebreadCrumb.getText(), productName);
    }
}
