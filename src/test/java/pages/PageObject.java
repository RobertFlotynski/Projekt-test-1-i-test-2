package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class PageObject {
    protected WebDriver webDriver;
    protected WebDriverWait wait;

    public PageObject(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
        wait = new WebDriverWait(webDriver, 60, 2000);
    }
}
