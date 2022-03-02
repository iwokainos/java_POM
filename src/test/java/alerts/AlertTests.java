package alerts;

import Pages.HomePage;
import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertTests extends BaseTests {
    @Test
    public void testAlertJavaScript(){
        var alertPage = homePage.hitJavaScriptAlert();
        alertPage.clickJavaScriptAlertButton();
        alertPage.acceptTheButton();
        assertEquals(alertPage.getAcceptText(), "You successfully clicked an alert", "Incorrect text message");
    }
    @Test
    public void testDismissPromptJavaScript(){
        var alertPage = homePage.hitJavaScriptAlert();
        alertPage.clickJavaScriptConfirm();
        String text = alertPage.getPromptText();
        alertPage.dismissPrompt();
        assertEquals(text, "I am a JS Confirm", "Incorrect text message");
    }
}
