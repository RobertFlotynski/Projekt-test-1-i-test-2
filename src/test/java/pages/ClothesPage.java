package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClothesPage extends PageObject {
    @FindBy(linkText = "Hummingbird Printed Sweater")
    private WebElement Hummingbirdprintedsweater;

    public ClothesPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void choiceSweater () {
        Hummingbirdprintedsweater.click();
    }
}