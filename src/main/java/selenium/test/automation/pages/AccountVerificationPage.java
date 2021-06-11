package selenium.test.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountVerificationPage extends DefaultPage {

    @FindBy(id = "inputType")
    private WebElement accountField;

    @FindBy(id = "sendTwo")
    private WebElement searchButton;

    public AccountVerificationPage(WebDriver driver) {
        super(driver);
    }


    public void fillAccountForm(String inputType) {
        fillElement(accountField, inputType);
    }

    public void submitAccountForm() {
        clickElement(searchButton);

    }
}
