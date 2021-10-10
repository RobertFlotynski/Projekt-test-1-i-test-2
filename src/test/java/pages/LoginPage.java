package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageObject {
    @FindBy(xpath = "//div[@class='col-md-6']/input[@type='email']")
    private WebElement signInEmail;
    @FindBy(xpath = "//input[@type='password']")
    private WebElement password;
    @FindBy(id = "submit-login")
    private WebElement signInButton;


    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    public ProfilePage logInAs(String email, String passwd) {
        signInEmail.clear();
        signInEmail.sendKeys(email);
        password.clear();
        password.sendKeys(passwd);
        signInButton.click();
        return new ProfilePage(webDriver);

    }


}
