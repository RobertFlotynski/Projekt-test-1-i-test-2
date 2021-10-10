package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SweaterDetals extends PageObject {
    @FindBy(name = "group[1]")

    private WebElement size;

    @FindBy(id = "quantity_wanted")
    private WebElement quantity;

    @FindBy(className = "add-to-cart")
    private WebElement addToChart;

      @FindBy(xpath = "//div[@class = 'cart-content-btn']/a[contains(@href, 'mystore-testlab.coderslab.pl/index"
            + ".php?controller=cart&action=show')]")
    private WebElement proccedToCheckout;

    public SweaterDetals(WebDriver webDriver) {
        super(webDriver);
    }

    public void setSize(String s) {
        new Select(size).selectByVisibleText(s);
    }

    public void setQuantity(int q) {
        quantity.clear();
        String[] digits = String.valueOf(q).split("");
        for (String digit : digits) {
            quantity.sendKeys(digit);
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
       // quantity.sendKeys(String.valueOf(5));
    }

    public void addToChart() {
        addToChart.click();
    }

    public void proceedToCheckout() {
        proccedToCheckout.click();
    }

}




