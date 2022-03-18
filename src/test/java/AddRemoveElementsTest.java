// Generated by Selenium IDE

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AddRemoveElementsTest {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void addRemoveElements() {
        driver.get("http://the-internet.herokuapp.com/");
        driver.manage().window().setSize(new Dimension(1792, 1010));
        driver.findElement(By.linkText("Add/Remove Elements")).click();
        driver.findElement(By.cssSelector("button")).click();
        {
            List<WebElement> elements = driver.findElements(By.cssSelector(".added-manually"));
            assert (elements.size() > 0);
        }
        driver.findElement(By.cssSelector(".added-manually")).click();
        {
            List<WebElement> elements = driver.findElements(By.cssSelector(".added-manually"));
            assert (elements.size() == 0);
        }
    }
}
