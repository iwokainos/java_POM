package password;

import Pages.EmailSentPage;
import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ForgotPasswordTests extends BaseTests {
    @Test
    public void testForgotPassword(){
        var forgotPassword = homePage.hitForgotPasswordLink();
        forgotPassword.typeEmail("whatever@gmail.com");
        EmailSentPage emailSentPage = forgotPassword.hitSubmitButton();
        assert(emailSentPage.getEmailConfirmation().contains("Internal Server Error"));

    }
}
