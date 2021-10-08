package steps;

import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.LoginPage;
import pages.UserInfoPage;

import java.util.concurrent.TimeUnit;

public class ChangeUserInfoSteps {
    private WebDriver webDriver;
    private HomePage homePage;
    private LoginPage loginPage;

    @Given("^User logs in to prodkurscoderslab$")

    public void user_logs_in_to_prodkurscoderslab() throws Throwable {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://prod-kurs.coderslab.pl/");
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = homePage.clickSignInButton();
        loginPage.loginAs("https://10minutemail.com/", "CodersLab");
    }

    @Given("User click sign in button")
    public void user_click_sign_in_button() {
        WebDriverManager.chromedriver().setup();

        webDriver  = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.manage().window().maximize();

        webDriver.get("https://prod-kurs.coderslab.pl/");
         homePage = new HomePage(webDriver);
       loginPage = homePage.clickSignInButton();
    }

    @Given("set email and password")
    public void set_email_and_password() {
    loginPage.loginAs("https://10minutemail.com/", "CodersLab");
    }

    @Given("click login button")
    public void click_login_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("click addresses")
    public void click_addresses() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("click create new address")
    public void click_create_new_address() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("set data to form")
    public void set_data_to_form() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("set click save button")
    public void set_click_save_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
