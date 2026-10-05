package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

import javax.swing.*;

public class P05_HoverAssertionPage {
    WebDriver driver;
    private final By hoversLoc = By.tagName("h1");

    public P05_HoverAssertionPage(WebDriver driver){
        this.driver = driver;
    }

    public void validateSuccessHover(){
        SoftAssert soft = new SoftAssert();
        boolean actual = driver.findElement(hoversLoc).isDisplayed();
        soft.assertTrue(actual);
    }
}
