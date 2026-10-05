package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P06_DropdownPage {
    WebDriver driver;
    private final By dropdownListLoc = By.id("dropdown");

    public P06_DropdownPage(WebDriver driver){
        this.driver = driver;
    }

    public void dropdownListClick(){
        driver.findElement(dropdownListLoc).click();
    }

    public void pickSelectedOption(){
        List<WebElement> opts = driver.findElements(By.tagName("option"));
        opts.get(2).click();
    }
}
