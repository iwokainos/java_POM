package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShiftingContentPage {
    private WebDriver driver;
    private By listLink = By.linkText("Example 3: List");

    public ShiftingContentPage(WebDriver driver){
        this.driver = driver;
    }
    public ListPage hitLinkList(){
        driver.findElement(listLink).click();
        return new ListPage(driver);
    }
}
