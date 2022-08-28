package Testcases;

import PageObjects.ContactUsPage;
import PageObjects.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactUsTest extends TestBase{
    HomePage home;
    ContactUsPage contactUsPage;

    String Fullname="Rana Ehab";
    String Email="Ranaehab@gmail.com";
    String Message="lalalalalalalalaalalal";



@Test
    public void verifyContactUsPage(){
        home=new HomePage(driver);
        home.openContactUsPage();

        contactUsPage=new ContactUsPage(driver);
        contactUsPage.contactUs(Fullname,Email,Message);
        Assert.assertTrue(contactUsPage.successMessage.getText().contains("Your enquiry has been successfully sent to the store owner"));
    }
}
