package Features;

import Pages.P01_HomePage;
import Pages.P02_LoginPage;
import Pages.P03_LoginAssertionPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class F01_Login {
    WebDriver driver;
    P01_HomePage Hp;
    P02_LoginPage Lp;
    P03_LoginAssertionPage Lap;

    @BeforeMethod
    void setUp(){
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        Hp = new P01_HomePage(driver);
        Lp = new P02_LoginPage(driver);
        Lap = new P03_LoginAssertionPage(driver);
    }

    @Test
    void validLogin(){
        Hp.fromAuthClick();
        Lp.loginInsert("tomsmith","SuperSecretPassword!");
        Lap.validateSuccessMsg();
    }

    @Test
    void invalidLogin(){
        Hp.fromAuthClick();
        Lp.loginInsert("tomsmith","123456");
        Lp.validateErrorMsg();
    }

    @AfterMethod
    void tearDown(){}
}
