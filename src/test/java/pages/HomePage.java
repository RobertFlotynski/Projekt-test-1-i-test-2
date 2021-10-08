package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageObject {
    @FindBy(css = "div.user-info > a")
    private WebElement signInButton;

    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    public LoginPage clickSignInButton() {
        signInButton.click();
        return new LoginPage(webDriver);
    }

}
