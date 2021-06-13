package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPageProject {

    public AmazonPageProject(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "(//span[@class='a-size-small a-color-base aok-align-center aok-inline-block'])[10]")
    public WebElement joggersLink;

    @FindBy(xpath = "(//span[@class='a-size-base-plus a-color-base a-text-normal'])[2]")
    public WebElement secondProductLink;

    @FindBy(id = "add-to-cart-button")
    public WebElement addToCart;

    @FindBy(id = "hlb-ptc-btn-native")
    public WebElement proceedToCheckout;

    @FindBy(xpath = "//select[@id='native_dropdown_selected_size_name']")
    public WebElement dropDownMenu;

    public Actions getAction(Actions actions){
        actions.sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).perform();
        return actions;
    }





}
