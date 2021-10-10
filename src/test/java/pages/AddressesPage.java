package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddressesPage extends PageObject {
    @FindBy (xpath ="//a[@data-link-action='add-address']")
    private   WebElement createAddressLink;

    public AddressesPage(WebDriver webDriver) {
        super(webDriver);
    }
    public AddressFormPage clickCreateAddressLink(){
        createAddressLink.click();
        return new AddressFormPage(webDriver);
    }
}
