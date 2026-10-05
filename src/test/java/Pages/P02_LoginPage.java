package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class P02_LoginPage {
    WebDriver driver;
    private final By usernameLoc = By.id("username");
    private final By passwordLoc = By.id("password");
    private final By loginBtnLoc = By.className("fa-sign-in");
    private final By errorMsgLoc = By.id("flash");


    public P02_LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void loginInsert(String username, String password){
        driver.findElement(usernameLoc).sendKeys(username);
        driver.findElement(passwordLoc).sendKeys(password);
        driver.findElement(loginBtnLoc).click();
    }

    public void validateErrorMsg(){
        SoftAssert soft = new SoftAssert();
        boolean actual = driver.findElement(errorMsgLoc).getText().contains("Your password is invalid!");
        soft.assertTrue(actual);
        soft.assertAll();
    }

}
