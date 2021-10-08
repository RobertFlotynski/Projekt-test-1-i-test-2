package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageObject {
    @FindBy(name = "email")
    private WebElement signInEmail;
    @FindBy(id = "passwd")
    private WebElement password;
    @FindBy(id = "SubmitLogin")
    private WebElement signInButton;

    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void logInAs(String email, String passwd) {
        signInEmail.clear();
        signInEmail.sendKeys(email);
        password.clear();
        password.sendKeys(passwd);
        signInButton.click();
    }

    public void loginAs(String s, String codersLab) {
    }
}
