package selenium.test.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class FirstTest {

    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Simon\\Desktop\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://www.podatki.gov.pl/wykaz-podatnikow-vat-wyszukiwarka");
    }

    @Test
    public void FirstTestMethod() {
        Assert.assertEquals("Wykaz podatników VAT - wyszukiwarka", driver.getTitle());

    }

    @Test
    public void SecondTestMethod() {
        driver.findElement(By.name("inputType")).sendKeys("02 1600 1198 0002 0022 5108 7001");
        driver.findElement(By.id("sendTwo")).click();
        Assert.assertEquals("Wykaz podatników VAT - wyszukiwarka", driver.getTitle());
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}