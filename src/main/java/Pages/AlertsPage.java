package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {
    private WebDriver driver;
    private By triggerAlertButton = By.xpath(".//button[text()='Click for JS Alert']");
    private By triggerConfirmButton = By.xpath(".//button[text()='Click for JS Confirm']");
    private By acceptButtonMessage = By.id("result");
    private By dismissPromptMessage = By.id("result");

    public AlertsPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickJavaScriptAlertButton(){
        driver.findElement(triggerAlertButton).click();
    }
    public void acceptTheButton(){
        driver.switchTo().alert().accept();
    }

    public String getAcceptText(){
        String text = driver.findElement(acceptButtonMessage).getText();
        return text;
    }

    public void clickJavaScriptConfirm(){
        driver.findElement(triggerConfirmButton);
    }

    public void dismissPrompt(){
        driver.switchTo().alert().dismiss();
    }
    public String getPromptText(){
        return driver.switchTo().alert().getText();
    }
}
