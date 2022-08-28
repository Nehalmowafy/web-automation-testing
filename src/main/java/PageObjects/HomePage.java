package PageObjects;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends PageBase{

    public HomePage(WebDriver driver) {
        super(driver);
        jse = (JavascriptExecutor) driver ;
        actions=new Actions(driver);
    }

    @FindBy(linkText = "Register")
    WebElement registerLink ;

    @FindBy(linkText = "Log in")
    WebElement loginLink;

    @FindBy(linkText = "Contact us")
    WebElement contactUslink;
    @FindBy(id="customerCurrency")
    WebElement customerCurrencyList;

    @FindBy(linkText="Computers")
    WebElement computerMenue;

    @FindBy(linkText="Notebooks")
    WebElement notebooks;
    @FindBy(css = "h1.Notebooks")
    public WebElement notebooksSuccessfuly;


    public  void openRegistrationPage ()
    {

        clickButton(registerLink);
    }
    public  void openLoginPage ()
    {

        clickButton(loginLink);
    }

    public void openContactUsPage ()
    {
        scrollToBottom();
        clickButton(contactUslink);
    }

    public void changeCurrency(){
        select=new Select(customerCurrencyList);
        select.selectByVisibleText("Euro");
    }


    public void selectNootbookFromComputers(){
        actions.moveToElement(computerMenue).moveToElement(notebooks).click().build().perform();
    }


}
