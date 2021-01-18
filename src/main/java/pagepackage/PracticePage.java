
package pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PracticePage {

    WebDriver driver;

    public PracticePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Sign in")
    private WebElement signInBtn;
    
    @FindBy(id="email")
    private WebElement emailTextField;
    
    @FindBy(id="passwd")
    private WebElement passwordTxtField;
    
    @FindBy(xpath="//i[@class='icon-lock left']")
    private WebElement LoginBtn;

    @FindBy(linkText= "Women")
    private WebElement womensSection;
    
    @FindBy(linkText = "Evening Dresses")
    private WebElement eveningDresses;
    
    @FindBy(css = "input[name=\"layered_id_attribute_group_2\"]")
    private WebElement mSize;
    
    @FindBy(css="input[name=\"layered_id_attribute_group_24\"]")
    private WebElement pinkColor ;
    
    @FindBy(xpath="(//a[@class='ui-slider-handle ui-state-default ui-corner-all'])[2]")
    private WebElement slider;
    
    @FindBy(xpath="(//img[@class='replace-2x img-responsive'])[2]")
    private WebElement imgHover;
    
    @FindBy(xpath="//a[@class='button lnk_view btn btn-default']")
    private WebElement moreBtn;
    
    @FindBy(id="quantity_wanted")
    private WebElement quantityWantedTxtBox;
    
    @FindBy(id = "group_1")
    private WebElement selectSizeDropDownInCardPage;
    
    @FindBy(id = "color_24")
    private WebElement selectPinkColorInCartPage;
    
    @FindBy(css = "button[name='Submit']")
    private WebElement ClkAddToCart;
    
    @FindBy(xpath="(//span[text()='3'])[2]")
    private WebElement finalQuantity;
    
    @FindBy(xpath="//span[@class=\"ajax_block_products_total\"]")
    private WebElement totalProductCost;
    
    
    public void clkSignInLink() {
        signInBtn.click();
    }
    
    public void enterEmailAddress(String email){
        emailTextField.sendKeys(email);
    }
    
    public void enterPassword(String password){
        passwordTxtField.sendKeys(password);
    }
    
    public void ClkLginBtn() {
        LoginBtn.click();
    }
    
    public WebElement getWomensSection(){
        return womensSection;
    }
    
    public void clkEveningDresses() {
        eveningDresses.click();
    }
    
    public void clkMSize() {
        mSize.click();
    }
    
    public void clkPinkColor() {
        pinkColor.click();
    }
    
    public WebElement rangeSlider() {
        return slider;
    }
    
    public WebElement hoverProduct(){
       return imgHover;
    }
    
    public void clkBtnMore() {
        moreBtn.click();
    }
    
    public void enterQuantity(String quantity) {
        quantityWantedTxtBox.clear();
        quantityWantedTxtBox.sendKeys(quantity);
    }
    
    public WebElement getselectSizeDropDownInCardPage(){
        return selectSizeDropDownInCardPage;
    }
    
    public void selectPinkColour(){
        selectPinkColorInCartPage.click();
    }
    
    public void clkAddToCart() {
        ClkAddToCart.click();
    }
    
    public WebElement getQuantity() {
        return finalQuantity;
    }
    
    public WebElement getTotalProductCost(){
        return totalProductCost;
    }

}
