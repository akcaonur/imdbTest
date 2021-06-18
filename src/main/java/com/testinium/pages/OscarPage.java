package com.testinium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OscarPage extends BasePage{


    public OscarPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getEventHistory() {
        return eventHistory;
    }

    public void setEventHistory(WebElement eventHistory) {
        this.eventHistory = eventHistory;
    }

    @FindBy(xpath = "//a[@href='/event/ev0000003/1929/1/?ref_=acd_eh']")
    private WebElement eventHistory;
}
