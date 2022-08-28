package PageObjects;

import PageObjects.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrderDetails extends PageBase {


    public OrderDetails(WebDriver driver) {
        super(driver);
    }
    @FindBy (partialLinkText="Click here for order details.")
    WebElement clickhere;
    @FindBy(linkText = "PDF Invoice")
    WebElement pdf;

    public void orderdetails() throws InterruptedException {
        Thread.sleep(3000);
        clickhere.click();
        pdf.click();
    }

}
