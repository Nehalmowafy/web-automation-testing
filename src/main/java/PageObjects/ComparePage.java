package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ComparePage extends PageBase{
    public ComparePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css="a.clear-list")
    WebElement clearListLink;

    @FindBy(css="div.no-data")
   public WebElement NoDataTxt ;

    @FindBy(css="table.compare-products-table")
    WebElement compareTable;

    @FindBy(tagName="tr")
    public List <WebElement> allRows ;

    @FindBy(tagName="td")
   public List <WebElement> allColumns;

    @FindBy(linkText="Asus.N551JK-XO076H.Laptop")
    public WebElement firstProductName;

    @FindBy(linkText="Samsung.Series.9.NP900X4C.Premium.Ultrabook")
    public WebElement secondProductName;



    public void clearTableData(){clickButton(clearListLink);}

    public void compareProducts(){
        //getAllRows
        System.out.println(allRows.size());
        //get all Data of each row
        for(WebElement row:allRows){
            System.out.println(row.getText() +'\t');
            //get all Data of each column
            for (WebElement colomn :allColumns){
                System.out.println(colomn.getText()+'\t');
            }
        }
    }


}
