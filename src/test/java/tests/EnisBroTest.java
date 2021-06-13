package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.AmazonPageProject;
import utilities.ConfigReader;
import utilities.Driver;

public class EnisBroTest {

    @Test
    public void test01() throws InterruptedException {

        Driver.getDriver().get(ConfigReader.getProperty("amazon_url"));
        /*Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).perform();*/

        AmazonPageProject amazonPageProject=new AmazonPageProject();

        Actions actions=new Actions(Driver.getDriver());
        amazonPageProject.getAction(actions);

        amazonPageProject.joggersLink.click();

        amazonPageProject.secondProductLink.click();

        Select dropdownList = new Select(amazonPageProject.dropDownMenu);
        dropdownList.selectByVisibleText("Large");
        Thread.sleep(4000);
        amazonPageProject.addToCart.click();
        amazonPageProject.proceedToCheckout.click();







        }

}
