package Testcases;

import PageObjects.*;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EmailFriendTest extends TestBase{

//1-user registration

    HomePage homeObject ;
    UserRegisteration registerObject ;

    SearchPage searchObject ;
    ProductDetailsPage detailsObject ;
    EmailFriendPage emailFriendPage;

    String firstName="Tester45";
    String LastName="test";
    String Email="TesterTest9@gmail.com";
    String Password="12345678";

    String productName = "Apple MacBook Pro 13-inch";

    String FrindUserEmail="FriendTest@gmail.com";
    String message="this Product is good ";



    //search For Product

    @Test(priority = 1)
    public void UserCanSearchWithAutoSuggest()
    {
        try {
            searchObject = new SearchPage(driver);
            searchObject.ProductSearchUsingAutoSuggest("Mac");
            detailsObject = new ProductDetailsPage(driver);
            Assert.assertEquals(detailsObject.productNamebreadCrumb.getText(), productName);
        } catch (Exception e) {
            System.out.println("Error occurred  " + e.getMessage());
        }
    }


    // click on emailFriend
    @Test(priority = 2)
    public void RegisteredUserSendEmail(){
        detailsObject.SendEmailToYourFriend();
        emailFriendPage=new EmailFriendPage(driver);
        emailFriendPage.sendEmailToFriend( FrindUserEmail,message);
        Assert.assertTrue(emailFriendPage.EmailMessage.getText().contains("Your message has been sent"));
    }






}
