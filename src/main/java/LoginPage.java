import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Page {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(linkText = "Form Authentication")
    WebElement authenticationText;


        public void goToLoginPage(){
            authenticationText.click();
        }
}
