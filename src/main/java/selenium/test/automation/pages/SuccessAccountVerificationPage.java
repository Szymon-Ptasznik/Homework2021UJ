package selenium.test.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SuccessAccountVerificationPage extends DefaultPage {

    //@FindBy(xpath = "//html/body/div[2]/div[5]/div[2]/div/div[2]/div/div/button")
    @FindBy(id = "superPrintButton")
    //@FindBy(id = "errorPrintButton")
    private WebElement printConfirmationButton;

    public SuccessAccountVerificationPage(WebDriver driver) {
        super(driver);
    }
    public boolean isPrintConfirmationButtonDisplayed(){
        return isElementDisplayed(printConfirmationButton);
    }
}
