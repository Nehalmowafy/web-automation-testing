package PageObjects;

import PageObjects.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

public class ChangeCurrency extends PageBase{

    public ChangeCurrency(WebDriver driver) {
        super(driver);
        actions = new Actions(driver);

    }
    @FindBy (id = "customerCurrency")
   public WebElement currency;

    @FindBy(linkText = "Search")
    WebElement sebox;
    @FindBy(linkText = "Apple MacBook Pro 13-inch")
    WebElement product;
    @FindBy(id = "price-value-4")
    public WebElement price;
    @FindBy (linkText = "Search")
    WebElement search_btn;

//    public void changecurrency() {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        action.moveToElement(currency).click().build().perform();
//        wait.until(ExpectedConditions.elementToBeClickable(euro));
//        action.moveToElement(euro).click().build().perform();
//

//    }

}
