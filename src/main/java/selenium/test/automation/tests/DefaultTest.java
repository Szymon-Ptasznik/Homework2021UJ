package selenium.test.automation.tests;

import org.apache.logging.log4j.core.tools.Generate;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import selenium.test.automation.utils.drivers.DriverFactory;
import selenium.test.automation.utils.log.CustomLogger;
import selenium.test.automation.utils.screen.AccountVerificationTestScreenshot;
import selenium.test.automation.utils.types.BrowserType;

import java.lang.reflect.Method;

public abstract class DefaultTest {

    protected static WebDriver driver;
    protected static AccountVerificationTestScreenshot screenshot;
    protected static CustomLogger logger;


    @BeforeTest
    public void setUpTest() {
        screenshot = new AccountVerificationTestScreenshot();
        logger = new CustomLogger();
        driver = new DriverFactory().getDriver(BrowserType.CHROME);


        driver.get("https://www.podatki.gov.pl/wykaz-podatnikow-vat-wyszukiwarka");

    }

    @BeforeMethod
    public void setUpMethod(Method method) {
        logger.info("Test '" + method.getName() + "' has started");
    }


    @AfterMethod
    public void tearDownMethod(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE)
            screenshot.make(driver, result.getMethod().getMethodName() + "_FAILURE");

        if (result.getStatus() == ITestResult.FAILURE) {
            logger.error("Test '" + result.getMethod().getMethodName() + "' has finished with status: FAILURE");
        } else if (result.getStatus() == ITestResult.SKIP) {
            logger.info("Test '" + result.getMethod().getMethodName() + "' has finished with status: SKIP");
        } else if (result.getStatus() == ITestResult.SUCCESS) {
            logger.info("Test '" + result.getMethod().getMethodName() + "' has finished with status: SUCCESS");
        }

    }

    @AfterTest
    public void tearDownTest() {
        driver.quit();
    }
}
