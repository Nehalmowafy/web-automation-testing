package Testcases;

import Testcases.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Change_Currency_TEST extends TestBase {

    @FindBy(id = "price-value-4")
    WebElement price;
    @Test
    public void changecurrency(){
        changecurrency();
        price.getText();
        Assert.assertTrue(price.getText().contains("€"));
    }
}
