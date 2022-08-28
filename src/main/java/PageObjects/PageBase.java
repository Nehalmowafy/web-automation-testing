package PageObjects;

import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageBase {
    protected WebDriver driver = null ;

    public JavascriptExecutor jse;

    public Actions actions;

    public Select select;

    //Create Constructor
    public PageBase(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    protected static void clickButton (@NotNull WebElement Button)
    {
        Button.click();
    }
    protected static void setTextElementText(@NotNull WebElement textElement , String  value)
    {
        textElement.sendKeys(value);
    }
    public void  scrollToBottom()
    {
        jse.executeScript("scrollBy(0,2500)");

    }

}
