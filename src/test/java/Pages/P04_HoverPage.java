package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class P04_HoverPage {
    WebDriver driver;
    private final By imgLoc = By.xpath("(//img[@src=\"/img/avatar-blank.jpg\"])[2]");
    private final By viewProfileLoc = By.linkText("View profile");

    public P04_HoverPage(WebDriver driver){
        this.driver = driver;
    }

    public void hoverImg(){
        Actions act = new Actions(driver);
        WebElement img = driver.findElement(imgLoc);
        act.moveToElement(img).perform();
    }

    public void viewProfileClick(){
        driver.findElement(viewProfileLoc).click();
    }
}
