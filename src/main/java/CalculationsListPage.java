import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CalculationsListPage extends BasePage{

    @FindBy(xpath = "//td[normalize-space()='40']")
    private WebElement listAnswer;

    public CalculationsListPage(WebDriver driver) {
        super(driver);
    }
    public String actualAnswerInList() {
        return listAnswer.getText();
    }
}
