package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BuyTshirt extends PageObject {
    @FindBy(name = "confirm-addresses")
    private WebElement confirmAddresses;

    public void ConfirmAddressesclick() {
        confirmAddresses.click();
    }

    @FindBy(name = "confirmDeliveryOption")
    private WebElement confirmDeliveryOption;

    public void confirmDeliveryOption() {
        confirmDeliveryOption.click();
    }

    @FindBy(id = "payment-option-1")
    private WebElement payment_option_1;

    public void payment_option_1() {
        payment_option_1.click();
    }

    public BuyTshirt(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(id = "conditions_to_approve[terms-and-conditions]")
    private WebElement conditions_to_approve;

    public void conditions_to_approve() {
        conditions_to_approve.click();
    }

    @FindBy(xpath = "//div[@id='payment-confirmation']/div[@class='ps-shown-by-js']/button"
    )
    private WebElement buyButton;

    public void clickBuyButton() {
        buyButton.click();
    }
}



