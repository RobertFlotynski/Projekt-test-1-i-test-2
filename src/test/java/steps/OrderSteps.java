package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import pages.*;

import java.util.concurrent.TimeUnit;

public class OrderSteps {
    UserInfoPage userInfoPage;
    WebDriver driver;
    SweaterDetals sweaterDetals;
    CartDetails cartDetails;
    BuyTshirt buyTshirt;

    @Given("user logged in system")
    public void user_logs_in_to_prodkurscoderslab() throws Throwable {
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://prod-kurs.coderslab.pl/");
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = homePage.clickSignInButton();
        loginPage.logInAs("robertflotka@gmail.com", "Test123");
        userInfoPage = new UserInfoPage(driver);
    }

    @Given("user chose Hummingbird Printed Sweater")
    public void user_chose_Hummingbird_Printed_Sweater() {
        userInfoPage.clickclothesButtonClick();
        ClothesPage clothesPage = new ClothesPage(driver);
        clothesPage.choiceSweater();
        sweaterDetals = new SweaterDetals(driver);
    }

    @Given("user added product to cart")
    public void user_added_product_to_cart() {
        sweaterDetals.setQuantity();
        sweaterDetals.setSize("M");

        sweaterDetals.addToChart();
        sweaterDetals.proceedToCheckout();
         cartDetails = new CartDetails(driver);


    }

    @Given("user confirmed order")
    public void user_confirmed_order() {
        cartDetails.click();
        buyTshirt = new BuyTshirt(driver);
    }
    @When("user buy t-shirt")
    public void user_buy_t_shirt() {
        buyTshirt.ConfirmAddressesclick();
        buyTshirt.confirmDeliveryOption();
        buyTshirt.payment_option_1();
        buyTshirt.conditions_to_approve();
        buyTshirt.clickBuyButton();
    }

}
