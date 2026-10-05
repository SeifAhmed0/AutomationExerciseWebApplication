package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P01_HomePage {
    WebDriver driver;
    private final By formAuthLoc = By.linkText("Form Authentication");
    private final By hoversLoc = By.linkText("Hovers");
    private final By dropdownLoc = By.linkText("Dropdown");

    public P01_HomePage(WebDriver driver){
        this.driver = driver;
    }

    public void fromAuthClick(){
        driver.findElement(formAuthLoc).click();
    }

    public void hoversClick(){
        driver.findElement(hoversLoc).click();
    }

    public void dropdownClick(){
        driver.findElement(dropdownLoc).click();
    }
}
