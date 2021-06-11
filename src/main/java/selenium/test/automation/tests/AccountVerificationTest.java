package selenium.test.automation.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.test.automation.pages.AccountVerificationPage;
import selenium.test.automation.pages.FailAccountVerificationPage;
import selenium.test.automation.pages.SuccessAccountVerificationPage;

public class AccountVerificationTest extends DefaultTest {

    @Test
    public void accountVerificationTest() {
        AccountVerificationPage accountVerificationPage = new AccountVerificationPage(driver);
        accountVerificationPage.fillAccountForm("02 1600 1198 0002 0022 5108 7001");
        accountVerificationPage.submitAccountForm();

        SuccessAccountVerificationPage successAccountVerificationPage = new SuccessAccountVerificationPage(driver);
        Assert.assertTrue(successAccountVerificationPage.isPrintConfirmationButtonDisplayed());


//        AccountVerificationPage accountVerificationPage = new AccountVerificationPage(driver);
//        accountVerificationPage.fillAccountForm("22 1600 1198 0002 0022 5108 7001");
//        accountVerificationPage.submitAccountForm();
//
//        FailAccountVerificationPage failAccountVerificationPage = new FailAccountVerificationPage(driver);
//        Assert.assertTrue(failAccountVerificationPage.isPrintConfirmationButtonDisplayed());

    }
}
