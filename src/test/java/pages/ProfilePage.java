package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends PageObject {
    @FindBy (xpath = "//a[@title='Addresses']")
    private WebElement addressLink;
    public ProfilePage(WebDriver webDriver) {
        super(webDriver);

    }
    public AddressesPage clickAddressLink() {
        addressLink.click();
        return new AddressesPage(webDriver);
    }

}
