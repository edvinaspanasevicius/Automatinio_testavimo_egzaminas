import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CalculationListTest extends BaseTest{


    @Test
    void positiveCalculationSearch() {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUserName("vardenis");
        loginPage.enterUserPassword("password123@");
        loginPage.pushPrisijungtiButton();
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        calculatorPage.operationsListButtonClick();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        WebElement resultCell = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//tbody/tr/td[4]"))
        );
        String resultText = resultCell.getText().trim();

        assertEquals("40", resultText, "Rezultatas turėtų būti 40");
    }
    @Test
    void negativeCalculationList() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUserName("vardenis");
        loginPage.enterUserPassword("password123@");
        loginPage.pushPrisijungtiButton();
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        calculatorPage.operationsListButtonClick();

        // Ieškome visų langelių, kuriuose yra 50
        List<WebElement> cells = driver.findElements(
                By.xpath("//td[normalize-space()='50']")
        );
        // Patikriname, kad sąrašas tuščias
        assertTrue(cells.isEmpty(), "Puslapyje neturi būti skaičiaus 50");



    }
}
