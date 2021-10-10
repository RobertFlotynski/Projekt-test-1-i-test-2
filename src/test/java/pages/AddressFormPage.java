package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AddressFormPage extends PageObject {
    @FindBy(xpath = "//input[@name='address1']")
    private WebElement addressInput;
    @FindBy(xpath = "//input[@name='postcode']")
    private WebElement zipCodeInput;
    @FindBy(xpath = "//input[@name='city']")
    private WebElement cityInput;
    @FindBy(xpath = "//select[@name='id_country']")
    private WebElement countrySelect;
    @FindBy(xpath = "//footer/button[@type='submit']")
    private WebElement savebutton;


    public AddressFormPage(WebDriver webDriver) {
        super(webDriver);

    }

    public void fildAddressForm(String address, String zipCode, String city) {
        addressInput.sendKeys(address);
        zipCodeInput.sendKeys(zipCode);
        cityInput.sendKeys(city);
        new Select(countrySelect).selectByValue("17");
        savebutton.click();
    }

}
