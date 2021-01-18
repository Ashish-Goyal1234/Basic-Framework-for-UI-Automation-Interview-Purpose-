
package testpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import basepackage.BaseClass;
import pagepackage.PracticePage;
import utility.utility;

public class practiceTest extends BaseClass{
    PracticePage practicepage;
    WebDriver driver;
    utility util;
    
    @BeforeTest
    public void init() {
        driver = initialization();
        practicepage = new PracticePage(driver);
        util = new utility();
    }
    
    @Parameters({"email", "password"})
    @Test(priority=1)
    public void login(String email, String password){
        practicepage.clkSignInLink();
        practicepage.enterEmailAddress(email);
        practicepage.enterPassword(password);
        practicepage.ClkLginBtn();
    }
    
    @Test(priority=2)
    public void womensSection() {
       util.actionClass(driver,practicepage.getWomensSection());
       practicepage.clkEveningDresses();
       practicepage.clkMSize();
       practicepage.clkPinkColor();
       WebElement slider = practicepage.rangeSlider();
       Actions move = new Actions(driver);
       move.dragAndDropBy(slider, 30,0).build().perform();
       util.actionClass(driver, practicepage.hoverProduct());
       practicepage.clkBtnMore();
    }
    
    @Parameters({"quantity"})
    @Test(priority=3)
    public void cartPage(String quantity) throws InterruptedException {
        practicepage.enterQuantity(quantity);
        WebElement size = practicepage.getselectSizeDropDownInCardPage();
        Select select  = new Select(size);
        select.selectByValue("2");
        practicepage.selectPinkColour();
        Thread.sleep(2000);
        practicepage.clkAddToCart();
        WebElement noOFQUaltity = practicepage.getQuantity();
        WebElement totalProductsCost = practicepage.getTotalProductCost();
        if(noOFQUaltity.getText()=="3" && totalProductsCost.getText()=="152.97"){
            System.out.println("Correct quantity selected" + noOFQUaltity.getText());
            System.out.println("Correct quantity selected" + totalProductsCost.getText());

        }else{
            Assert.fail("Wrong quantity selected" + noOFQUaltity  + totalProductsCost);
        }
    }
    
    @AfterTest
    public void tearDown(){
        driver.quit();
    }
    
}
