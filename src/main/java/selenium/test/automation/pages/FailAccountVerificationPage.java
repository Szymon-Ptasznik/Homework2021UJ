package selenium.test.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FailAccountVerificationPage extends DefaultPage {

    @FindBy(id = "errorPrintButton")
    private WebElement printConfirmationButton;

    public FailAccountVerificationPage(WebDriver driver) {
        super(driver);
    }

    public boolean isPrintConfirmationButtonDisplayed() {
        return isElementDisplayed(printConfirmationButton);
    }
}
