package jv.setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageBase {
    protected WebDriver driver;

    public PageBase(org.openqa.selenium.WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
