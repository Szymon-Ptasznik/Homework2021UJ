package selenium.test.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SuccessAccountVerificationPage extends DefaultPage {

    //@FindBy(xpath = "//html/body/div[2]/div[5]/div[2]/div/div[2]/div/div/button")

    @FindBy(id = "superPrintButton")
    private WebElement printConfirmationButton;

//    @FindBy(xpath = "//html/body/div[2]/div[5]/div[2]/div/div[2]/div/div/button")
//    private WebElement printButton;

    public SuccessAccountVerificationPage(WebDriver driver) {
        super(driver);
    }

    public boolean isPrintConfirmationButtonDisplayed() {
        return isElementDisplayed(printConfirmationButton);
    }

//   // public void goToPrintButtonPage() {
//        clickElement(printButton);
//    }

}
