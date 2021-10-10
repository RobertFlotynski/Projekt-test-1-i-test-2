package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserInfoPage extends PageObject {
    @FindBy(id = "category-3")
    private WebElement clothesButton;

    public UserInfoPage(WebDriver webDriver) {
        super(webDriver);
    }
    public void clickclothesButtonClick (){
        clothesButton.click();
    }
}
