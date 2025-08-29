import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage {

    @FindBy (xpath = "//input[@id='username']")
    private WebElement userName;
    @FindBy (xpath = "//input[@id='password']")
    private WebElement userPassword;
    @FindBy (xpath = "//input[@id='passwordConfirm']")
    private WebElement userPasswordConfirmation;
    @FindBy (xpath = "//button[normalize-space()='Sukurti']")
    private WebElement pushSubmit;
    @FindBy (xpath = "//span[@id='username.errors']")
    private WebElement invalidRegistrationName;

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }
    public void newUserName (String newUserName) {
        userName.sendKeys(newUserName);
    }
    public void newUserPassword (String newUserPassword) {
        userPassword.sendKeys(newUserPassword);
    }
    public void newUserPasswordConfirmation (String newUserPasswordConfirmation) {
        userPasswordConfirmation.sendKeys(newUserPasswordConfirmation);
    }
    public void pushSukurtiButton () {
        pushSubmit.click();
    }
    public String badUsername() {
        return invalidRegistrationName.getText();
    }
}
