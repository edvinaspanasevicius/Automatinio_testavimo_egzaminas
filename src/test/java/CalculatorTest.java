import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest extends BaseTest{

    String firstNumber = "2";
    String secondNumber = "2";
    String negativeFirstNumber = "-2";

    @Test
    void positiveCalculation() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUserName("vardenis");
        loginPage.enterUserPassword("password123@");
        loginPage.pushPrisijungtiButton();
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        calculatorPage.setFirsNumber(firstNumber);
        calculatorPage.setSecondNumber(secondNumber);
        calculatorPage.pushSkaiciuotiButton();
        assertEquals("20 + 20 = 40", calculatorPage.calculationResult());
    }
    @Test
    void negativeCalculation() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUserName("vardenis");
        loginPage.enterUserPassword("password123@");
        loginPage.pushPrisijungtiButton();
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        calculatorPage.setFirsNumber(negativeFirstNumber);
        calculatorPage.setSecondNumber(secondNumber);
        calculatorPage.pushSkaiciuotiButton();
        assertEquals("Validacijos klaida: skaičius negali būti neigiamas", calculatorPage.visibleCalculationError());
    }
}
