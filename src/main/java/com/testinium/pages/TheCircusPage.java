package com.testinium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TheCircusPage extends BasePage{


    public WebElement getPhotoCheck() {
        return photoCheck;
    }

    @FindBy(xpath = "//*[@class=\"media_index_thumb_list\"]/a/img")
    private WebElement photoCheck;

    public WebElement getAllPhoto() {
        return allPhoto;
    }

    @FindBy(xpath = "//a[@href='/title/tt0018773/mediaindex?ref_=tt_pv_mi_sm'][2]")
    private WebElement allPhoto;



    @FindBy(xpath = "//a[@href='/name/nm0000122/?ref_=tt_ov_dr']")
    private WebElement Director;

    @FindBy(xpath = "//a[@href='/name/nm0000122/?ref_=tt_ov_wr']")
    private WebElement Writer;

    public WebElement getDirector() {
        return Director;
    }

    public WebElement getWriter() {
        return Writer;
    }

    public WebElement getStars() {
        return Stars;
    }

    @FindBy(xpath = "//a[@href='/name/nm0000122/?ref_=tt_ov_st_sm']")
    private WebElement Stars;

    public TheCircusPage(WebDriver driver) {
        super(driver);
    }
}
