package Testcases;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.MyAccount;
import PageObjects.UserRegisteration;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyAccountTest extends TestBase{
    HomePage homeOBJ ;
    UserRegisteration registerObj ;
    LoginPage loginOBj ;
    MyAccount myAccobj;
    String Email="Nehaltester548@gmail.com";
    String oldPassword ="123456";
    String newPassword ="12345test";


    @Test(priority= 1,alwaysRun=true)
    public void VerifyRegistration()
    {
        registerObj = new UserRegisteration(driver);
        registerObj.userLogout();
        homeOBJ = new HomePage(driver);
        homeOBJ.openRegistrationPage();
        registerObj.userRegistration("nehal", "test", Email, oldPassword);
        Assert.assertTrue(registerObj.successMessage.getText().contains("Your registration completed"));
    }
    @Test(priority = 2)
    public void verifyChangePassword()
    {
        myAccobj = new MyAccount(driver);
        registerObj.openMyAccountPage();
        myAccobj.openChangepasswordPage();
        myAccobj.ChangePassword(oldPassword,newPassword);
        Assert.assertTrue(myAccobj.resultLbl.getText().contains("Password was changed"));
        myAccobj.clickonclose();
    }
    @Test(priority = 3)
    public void verifyLogout()
    {
        registerObj.userLogout();
    }

    @Test(priority = 4)
    public void verifyLogin()
    {
        homeOBJ.openLoginPage();
        loginOBj = new LoginPage(driver);
        loginOBj.UserLogin(Email, newPassword);
        Assert.assertTrue(registerObj.logoutLink.getText().contains("Log out"));
    }

}
