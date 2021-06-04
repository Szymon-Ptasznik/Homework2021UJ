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
        fillElement(accountField,"02 1600 1198 0002 0022 5108 7001");

    }

    public void submitAccountForm() {
        clickElement(searchButton);

    }
}
