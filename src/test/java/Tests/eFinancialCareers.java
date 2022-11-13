package Tests;


import WebDriver.BaseTest;
import eFinancialCareers.app.signin.tasks.SignIn;
import org.junit.Test;


public class eFinancialCareers extends BaseTest {

    @Test
    public void signIn() {
        SignIn.using("shahzeb.khan@emumba.com", "Vkyst_123");
    }
}