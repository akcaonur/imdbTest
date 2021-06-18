package com.testinium.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TheJazzSinger extends BasePage{
    public TheJazzSinger(WebDriver driver) {
        super(driver);
    }

    public WebElement getSearchResult() {
        return searchResult;
    }

    @FindBy(xpath = "//a[@href='/title/tt0080948?ref_=nv_sr_srsg_0']")
    private WebElement searchResult;

    public WebElement getDirektorJazz() {
        return direktorJazz;
    }

    public WebElement getWriterjazz() {
        return writerjazz;
    }

    public WebElement getStarsjazz() {
        return starsjazz;
    }

    @FindBy(xpath = "//a [@href=\"/name/nm0189076/?ref_=tt_ov_dr\"]")
    private WebElement direktorJazz;
    @FindBy(xpath = "//a [@href='/name/nm0710723/?ref_=tt_ov_wr']")
    private WebElement writerjazz;
    @FindBy(xpath ="//a [@href='/name/nm0427231/?ref_=tt_ov_st_sm']" )
    private WebElement starsjazz;

    public WebElement getAllPhoto() {
        return allPhoto;
    }

    @FindBy(xpath ="//*[@id=\"titleImageStrip\"]/div[2]/a[2]" )
    private WebElement allPhoto;



    public WebElement getPhotoCheck() {
        return photoCheck;
    }

    @FindBy(xpath ="//*[@class=\"media_index_thumb_list\"]/a/img" )
    private WebElement photoCheck;

    public void check(String direktor,String writer,String stars){
        wait(1);
        Assert.assertEquals("Alan Crosland",direktor);
        Assert.assertEquals("Samson Raphaelson",writer);
        Assert.assertEquals("Al Jolson",stars);
        wait(1);

    }

}
