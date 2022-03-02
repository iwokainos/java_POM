package login;

import Pages.LoginPage;
import Pages.SecurePage;
import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class LoginTests extends BaseTests {

    @Test
    public void testSuccessfulLogin(){
        LoginPage loginPage = homePage.hitLoginLink();
        loginPage.enterUsername("tomsmith");
        loginPage.enterPassword("SuperSecretPassword!");
        SecurePage securePage = loginPage.hitLoginButton();
        assert(securePage.getBannerCaption().contains("You logged into a secure area!"));

    }
}
