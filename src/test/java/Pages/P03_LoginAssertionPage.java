package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class P03_LoginAssertionPage {
    WebDriver driver;
    private final By successMsgLoc = By.id("flash");

    public P03_LoginAssertionPage(WebDriver driver){
        this.driver = driver;
    }

    public void validateSuccessMsg(){
        SoftAssert soft = new SoftAssert();
        boolean actual = driver.findElement(successMsgLoc).getText().contains("You logged into a secure area!");
        soft.assertTrue(actual);
        soft.assertAll();
    }
}
