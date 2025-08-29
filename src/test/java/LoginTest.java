import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginTest extends BaseTest{

    String userName = "vardenis";
    String userPassword = "password123@";
    String wrongUserName = "vardas";

    @Test
    void positiveLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUserName(userName);
        loginPage.enterUserPassword(userPassword);
        loginPage.pushPrisijungtiButton();
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        assertEquals("Skaičiuotuvas", calculatorPage.visibleSkaiciuotuvasText());
    }
    @Test
    void negativeLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUserName(wrongUserName);
        loginPage.enterUserPassword(userPassword);
        loginPage.pushPrisijungtiButton();
        assertEquals("Įvestas prisijungimo vardas ir/ arba slaptažodis yra neteisingi", loginPage.visibleLoginError());
    }
}
