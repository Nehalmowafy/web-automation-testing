package Testcases;

import PageObjects.HOVER_ON;
import Testcases.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test_Hoveron extends TestBase {
@BeforeTest
        public void waitt() throws InterruptedException {
Thread.sleep(2000);
}
    HOVER_ON homeobj;
    @Test(priority = 1)
   public void hovering_on_notebooks(){

    homeobj = new HOVER_ON(driver);
    homeobj.hover_on_notebook();
        System.out.println(driver.getCurrentUrl());
      Assert.assertTrue(driver.getCurrentUrl().contains("notebooks"));

   }
    @Test (priority = 2)
    public void hovering_on_desk(){
        homeobj = new HOVER_ON(driver);
        homeobj.hover_on_desk();
        System.out.println(driver.getCurrentUrl());
        Assert.assertTrue(driver.getCurrentUrl().contains("desktops"));

    }
    @Test(priority = 3)
    public void hovering_on_software(){
        homeobj = new HOVER_ON(driver);
        homeobj.hover_on_software();
        System.out.println(driver.getCurrentUrl());
        Assert.assertTrue(driver.getCurrentUrl().contains("software"));

    }
    @Test(priority = 4)
    public void hovering_on_camera(){
        homeobj = new HOVER_ON(driver);
        homeobj.hover_on_camera();
        System.out.println(driver.getCurrentUrl());
        Assert.assertTrue(driver.getCurrentUrl().contains("camera-photo"));
    }
    @Test(priority = 5)
    public void hovering_on_cell(){
        homeobj = new HOVER_ON(driver);
        homeobj.hover_on_cell();
        System.out.println(driver.getCurrentUrl());
        Assert.assertTrue(driver.getCurrentUrl().contains("cell"));
    }

    @Test (priority = 6)
    public void hovering_on_others(){
        homeobj = new HOVER_ON(driver);
        homeobj.hover_on_others();
        System.out.println(driver.getCurrentUrl());
        Assert.assertTrue(driver.getCurrentUrl().contains("others"));
    }
    @Test(priority = 7)
    public void hovering_on_shoes(){
        homeobj = new HOVER_ON(driver);
        homeobj.hover_on_shoes();
        System.out.println(driver.getCurrentUrl());
        Assert.assertTrue(driver.getCurrentUrl().contains("shoes"));
    }
    @Test(priority=8)
    public void hovering_on_cloth(){
        homeobj = new HOVER_ON(driver);
        homeobj.hover_on_cloth();
        System.out.println(driver.getCurrentUrl());
        Assert.assertTrue(driver.getCurrentUrl().contains("clothing"));
    }
    @Test(priority = 9)
    public void hovering_on_accessories(){
        homeobj = new HOVER_ON(driver);
        homeobj.hover_on_accessories();
        System.out.println(driver.getCurrentUrl());
        Assert.assertTrue(driver.getCurrentUrl().contains("accessories"));
    }
    @Test (priority = 10)
    public void hovering_on_digital(){
        homeobj = new HOVER_ON(driver);
        homeobj.hover_on_digital();
        System.out.println(driver.getCurrentUrl());
        Assert.assertTrue(driver.getCurrentUrl().contains("digital-downloads"));
    }
    @Test (priority = 11)
    public void hovering_on_books(){
        homeobj = new HOVER_ON(driver);
        homeobj.hover_on_books();
        System.out.println(driver.getCurrentUrl());
        Assert.assertTrue(driver.getCurrentUrl().contains("books"));
    }
    @Test(priority = 12)
    public void hovering_on_jewelry(){
        homeobj = new HOVER_ON(driver);
        homeobj.hover_on_jewelry();
        System.out.println(driver.getCurrentUrl());
        Assert.assertTrue(driver.getCurrentUrl().contains("jewelry"));
    }
    @Test(priority=13)
    public void hovering_on_gift() throws InterruptedException {
        homeobj = new HOVER_ON(driver);
        homeobj.hover_on_gift();
        Thread.sleep(1000);
        Assert.assertTrue(driver.getCurrentUrl().contains("gift-cards"));
    }
}
