package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmailSentPage {
    private By field = By.cssSelector("body > h1");
    private WebDriver driver;

    public EmailSentPage(WebDriver driver){
        this.driver = driver;
    }
    public String getEmailConfirmation(){
        String confirmationText = driver.findElement(field).getText();
        return confirmationText;
    }
}
