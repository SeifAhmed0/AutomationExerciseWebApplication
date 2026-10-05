package Features;

import Pages.P01_HomePage;
import Pages.P06_DropdownPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class F03_Dropdown {
    WebDriver driver;
    P01_HomePage Hp;
    P06_DropdownPage Dp;

    @BeforeMethod
    void setUp(){
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        Hp = new P01_HomePage(driver);
        Dp = new P06_DropdownPage(driver);
    }

    @Test
    void dropdownTest(){
        Hp.dropdownClick();
        Dp.dropdownListClick();
        Dp.pickSelectedOption();
    }

    @AfterMethod
    void tearDown(){}
}
