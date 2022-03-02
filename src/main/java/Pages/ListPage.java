package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ListPage {
    private WebDriver driver;
    private By listPageMessage = By.cssSelector("#content > div > h3");

    public ListPage(WebDriver driver){
        this.driver = driver;
    }

    public String getListPageMessage(){
        String linkPageMessage = driver.findElement(listPageMessage).getText();
        return linkPageMessage;
    }

}

