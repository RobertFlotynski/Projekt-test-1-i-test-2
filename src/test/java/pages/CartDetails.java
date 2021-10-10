package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartDetails extends PageObject {
    @FindBy(xpath = "//div[@class = 'checkout cart-detailed-actions card-block']/div[@class = 'text-sm-center']/a[contains(@href, 'mystore-testlab.coderslab.pl/index.php?controller=order')]")
    private WebElement proccedToCheckout;
    public void click(){
        proccedToCheckout.click();
    }

    public CartDetails(WebDriver webDriver) {
        super(webDriver);


    }
}
