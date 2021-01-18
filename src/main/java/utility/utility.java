package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class utility {

    public void actionClass(WebDriver driver, WebElement webelement){
        Actions action = new Actions(driver);
        action.moveToElement(webelement).build().perform();
    }
    
}
