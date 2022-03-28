import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.Map;

public class BaseTest {
    HomePage homePage;
    LoginPage loginPage; // передаётся всегда, но инициализация не тут
    AddRemovePage addRemovePage;
    SecurePage securePage;
    WebDriver driver;
    Map<String, Object> vars;
    JavascriptExecutor js;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
        driver.get("http://the-internet.herokuapp.com/");
        driver.manage().window().setSize(new Dimension(1792, 1010));
        homePage = new HomePage(driver);

    }

    @After
    public void tearDown() {
        driver.quit();
    }
}