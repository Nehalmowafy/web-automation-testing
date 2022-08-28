package Testcases;

import PageObjects.ComparePage;
import PageObjects.HomePage;
import PageObjects.ProductDetailsPage;
import PageObjects.SearchPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class CompareTest extends TestBase{

    String productName1="Asus N551JK-XO076H Laptop";
    String productName2="Samsung Series 9 NP900X4C Premium Ultrabook";


    //1-Search for Product1
    //2-Search for Product1
    //3-Add to compare
    //4-clear Data fromCompareList
    HomePage pageobject;
    ProductDetailsPage detailsObject;
    SearchPage searchObject;
    ComparePage compareobject;

   @Test(priority = 1)
    public void UserCanCompareProduct() throws InterruptedException {
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       searchObject=new SearchPage(driver);
       detailsObject=new ProductDetailsPage(driver);
       compareobject=new ComparePage(driver);

       searchObject.ProductSearchUsingAutoSuggest("asu");
       Assert.assertTrue(detailsObject.productNamebreadCrumb.getText().equals(productName1));
       detailsObject.addToComareProductsList();


       searchObject.ProductSearchUsingAutoSuggest("sams");
       Assert.assertTrue(detailsObject.productNamebreadCrumb.getText().equals(productName2));
       detailsObject.addToComareProductsList();

      Thread.sleep(3000);

       driver.navigate().to("https://demo.nopcommerce.com/compareproducts");
    /*   Assert.assertTrue(compareobject.firstProductName.getText().equals(productName1));
       Assert.assertTrue(compareobject.secondProductName.getText().equals(productName2));
*////////////////////////check this assert
       compareobject.compareProducts(); //get all data of rows and column

   }

   @Test(priority =2 )
    public void clearDataFromCompareTable(){
       compareobject.clearTableData();
       Assert.assertTrue(compareobject.NoDataTxt.getText().equals("You have no items to compare."));
   }


}
