package com.testinium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AcedmyAwardsPage extends BasePage{

    public WebElement getCharlie() {
        return Charlie;
    }

    @FindBy(xpath = "//img[@src='https://m.media-amazon.com/images/M/MV5BM2QwYWQ0MWMtNzcwOC00N2Q2LWE1MDEtZmQxZjhiM2U1YzFhXkEyXkFqcGdeQXVyMTQxNzMzNDI@._SL165_CR21,0,111,165_AL_.jpg\']")
    private WebElement Charlie;

    public WebElement getTheJazzSinger() {
        return TheJazzSinger;
    }

    @FindBy(xpath = "//*[@id=\"center-3-react\"]/div/div/div[2]/h3/div/div/div/div[1]/div[1]/a/img")
    private WebElement TheJazzSinger;

    public AcedmyAwardsPage(WebDriver driver) {
        super(driver);
    }
}
