import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(xpath = "//a[contains(text(),'Sukurti naują paskyrą')]")
    private WebElement newRegistrationPush;
    @FindBy(xpath = "//input[@placeholder='Prisijungimo vardas']")
    private WebElement userName;
    @FindBy(xpath = "//input[@placeholder='Slaptažodis']")
    private WebElement userPassword;
    @FindBy(xpath = "//button[normalize-space()='Prisijungti']")
    private WebElement pushSubmit;
    @FindBy(css = "body > div:nth-child(5) > form:nth-child(1) > div:nth-child(2) > span:nth-child(4)")
    private WebElement visibleError;
    @FindBy(xpath = "//span[contains(text(),'Sėkmingai atsijungėte')]")
    private WebElement positiveLogout;

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public void newUserRegistration() {
        newRegistrationPush.click();
    }
    public void enterUserName(String userName) {
        this.userName.sendKeys(userName);
    }
    public void enterUserPassword(String userPassword) {
        this.userPassword.sendKeys(userPassword);
    }
    public void pushPrisijungtiButton() {
        pushSubmit.click();
    }
    public String visibleLoginError() {
        return visibleError.getText();
    }
    public String positiveLogoutText() {
        return positiveLogout.getText();
    }
}
