package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private By dropdownLink = By.linkText("Dropdown");
    private WebDriver driver;

    public HomePage(WebDriver driver){
       this.driver = driver;

    }

    public LoginPage hitLoginLink(){
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }

    public DropdownPage hitDropdownLink(){
        clickLink("Dropdown");
        return new DropdownPage(driver);
    }

    public ForgotPasswordPage hitForgotPasswordLink(){
        clickLink("Forgot Password");
        return new ForgotPasswordPage(driver);
    }

    public ShiftingContentPage hitShiftingContentLink(){
        clickLink("Shifting Content");
        return new ShiftingContentPage(driver);
    }

    public AlertsPage hitJavaScriptAlert(){
        clickLink("JavaScript Alerts");
        return new AlertsPage(driver);
    }

    private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }
}
