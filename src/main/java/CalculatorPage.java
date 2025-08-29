import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CalculatorPage extends BasePage{

    @FindBy (xpath = "//a[contains(text(),'Skaičiuotuvas')]")
    private WebElement skaiciuotuvasButton;
    @FindBy (css = "a[onclick=\"document.forms['logoutForm'].submit()\"]")
    private WebElement logoutButton;
    @FindBy(xpath = "//input[@id='sk1']")
    private WebElement firsNumber;
    @FindBy(xpath = "//input[@id='sk2']")
    private WebElement secondNumber;
    @FindBy(xpath = "//input[@value='skaičiuoti']")
    private WebElement pushButton;
    @FindBy(xpath = "//h4[contains(text(),'20 +')]")
    private WebElement calculationAnswer;
    @FindBy(xpath = "//span[@id='sk1.errors']")
    private WebElement calculationError;
    @FindBy(xpath = "//a[normalize-space()='Atliktos operacijos']")
    private WebElement operationsButton;

    public CalculatorPage(WebDriver driver) {
        super(driver);
    }
    public String visibleSkaiciuotuvasText() {
        return skaiciuotuvasButton.getText();
    }
    public void pushLogoutButton() {
        logoutButton.click();
    }
    public void setFirsNumber(String firstNumber) {
        firsNumber.sendKeys(firstNumber);
    }
    public void setSecondNumber(String secondNumber) {
        this.secondNumber.sendKeys(secondNumber);
    }
    public void pushSkaiciuotiButton() {
        pushButton.click();
    }
    public String calculationResult() {
        return calculationAnswer.getText();
    }
    public String visibleCalculationError() {
        return calculationError.getText();
    }
    public void operationsListButtonClick() {
        operationsButton.click();
    }
}
