import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LogoutTest extends BaseTest{

    String userName = "vardenis";
    String userPassword = "password123@";

    @Test
    void userLogout() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUserName(userName);
        loginPage.enterUserPassword(userPassword);
        loginPage.pushPrisijungtiButton();
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        calculatorPage.pushLogoutButton();
        assertEquals("Sėkmingai atsijungėte", loginPage.positiveLogoutText());

    }
}
