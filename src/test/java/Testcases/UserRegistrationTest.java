package Testcases;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.UserRegisteration;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserRegistrationTest extends TestBase{
    HomePage homeObject ;
    UserRegisteration registerObject ;
    LoginPage loginObject ;
    String firstName="Tester";
    String LastName="test";
    String Email="Ranatester801@gmail.com";
    String Password="12345678";

    @Test(priority = 1 ,alwaysRun = true)
    public void VerifyRegistration()
    {
        homeObject = new HomePage(driver);
        homeObject.openRegistrationPage();
        registerObject = new UserRegisteration(driver);
        registerObject.userRegistration(firstName, LastName, Email, Password);
        Assert.assertTrue(registerObject.successMessage.getText().contains("Your registration completed"));
    }
    @Test(priority = 2 )
    public void verifyLogout()
    {
        registerObject.userLogout();
    }

    @Test(priority = 3)
    public void verifyLogin()
    {
        homeObject.openLoginPage();
        loginObject = new LoginPage(driver);
        loginObject.UserLogin(Email, Password);
        Assert.assertTrue(registerObject.logoutLink.getText().contains("Log out"));
    }



}
