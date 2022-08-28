package PageObjects;
import PageObjects.PageBase;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HOVER_ON extends PageBase {
    public HOVER_ON(WebDriver driver){
        super(driver);
        actions = new Actions(driver);
    }

    @FindBy (linkText ="Computers")
    WebElement computers ;
    @FindBy(linkText="Desktops")
    WebElement desk;


    @FindBy(linkText ="Notebooks")
    WebElement notebook;

    @FindBy(linkText="Software")
    WebElement software;

    @FindBy(linkText="Electronics")
    WebElement electronics;

    @FindBy(linkText="Camera & photo")
    WebElement camera;
    @FindBy(linkText="Cell phones")
    WebElement cell;
    @FindBy(linkText="Others")
    WebElement others;
    @FindBy(linkText="Apparel")
    WebElement apparel;
    @FindBy(linkText = "Shoes")
    WebElement shoes;
    @FindBy(linkText = "Clothing")
    WebElement cloth;
    @FindBy(linkText="Accessories")
    WebElement accessories;
    @FindBy(linkText = "Digital downloads")
    WebElement  digitals;
    @FindBy(linkText = "Books")
    WebElement Books;
    @FindBy(linkText = "Jewelry")
    WebElement Jewelry;
    @FindBy(linkText = "Gift Cards")
    WebElement Gift;

    public void hover_on_accessories(){
        actions.moveToElement(apparel).build().perform();
        actions.moveToElement(accessories).click().build().perform();
    }
    public void hover_on_cloth(){
        actions.moveToElement(apparel).build().perform();
        actions.moveToElement(cloth).click().build().perform();
    }
    public void hover_on_shoes(){
        actions.moveToElement(apparel).build().perform();
        actions.moveToElement(shoes).click().build().perform();
    }
    public void hover_on_digital(){
        actions.moveToElement(digitals).click().build().perform();
    }
    public void hover_on_books(){
        actions.moveToElement(Books).click().build().perform();
    }
    public void hover_on_jewelry(){
        actions.moveToElement(Jewelry).click().build().perform();
    }
    public void hover_on_gift(){
        actions.moveToElement(Gift).click().build().perform();
    }
    public void hover_on_desk(){
        actions.moveToElement(computers).build().perform();
        actions.moveToElement(desk).click().build().perform();
    }
    public void hover_on_notebook(){
        actions.moveToElement(computers).build().perform();
        actions.moveToElement(notebook).click().build().perform();
    }
    public void hover_on_software(){
        actions.moveToElement(computers).build().perform();
        actions.moveToElement(software).click().build().perform();
    }

    public void hover_on_camera(){
        actions.moveToElement(electronics).build().perform();
        actions.moveToElement(camera).click().build().perform();
    }
    public void hover_on_cell(){
        actions.moveToElement(electronics).build().perform();
        actions.moveToElement(cell).click().build().perform();
    }
    public void hover_on_others(){
        actions.moveToElement(electronics).build().perform();
        actions.moveToElement(others).click().build().perform();
    }


}
