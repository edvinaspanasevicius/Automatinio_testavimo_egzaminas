import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RegistrationTest extends BaseTest{

    @Test
    void positiveRegistration() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.newUserRegistration();
        RegistrationPage registrationPage = new RegistrationPage(driver);
        registrationPage.newUserName("vardenis1");
        registrationPage.newUserPassword("password123@");
        registrationPage.newUserPasswordConfirmation("password123@");
        registrationPage.pushSukurtiButton();
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        assertEquals("Skaičiuotuvas", calculatorPage.visibleSkaiciuotuvasText());

    }
    @Test
    void negativeRegistration() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.newUserRegistration();
        RegistrationPage registrationPage = new RegistrationPage(driver);
        registrationPage.newUserName("vardenis");
        registrationPage.newUserPassword("password123@");
        registrationPage.newUserPasswordConfirmation("password123@");
        registrationPage.pushSukurtiButton();
        assertEquals("Toks vartotojo vardas jau egzistuoja", registrationPage.badUsername());
    }
}
