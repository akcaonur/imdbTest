package com.testinium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    @FindBy(xpath = "//a[@href='/title/tt0018773?ref_=nv_sr_srsg_2']")
    private WebElement searchResult;

    @FindBy(xpath = "//*[@id=\"home_img_holder\"]")
    private WebElement anaMenu;
    @FindBy(id = "imdbHeader-navDrawerOpen--desktop")
    private WebElement menu;
    //*[@id='home_img_holder']


    public WebElement getAnaMenu() {
        return anaMenu;
    }

    public WebElement getSeachBar() {
        return seachBar;
    }

    public WebElement getSearchResult() {
        return searchResult;
    }



    @FindBy(xpath = "//input[@placeholder='Search IMDb']")
    private WebElement seachBar;



    public WebElement getOscar() {
        return oscar;
    }

    public void setOscar(WebElement oscar) {
        this.oscar = oscar;
    }

    @FindBy( xpath="//a[@href='/oscars/?ref_=nv_ev_acd']")
    private WebElement oscar;


    public WebElement getMenu() {
        return menu;
    }

    public void setMenu(WebElement menu) {
        this.menu = menu;
    }



    public static String getUrl() {
        return Url;
    }

    public static void setUrl(String url) {
        HomePage.Url = url;
    }

    private static String Url ="https://www.imdb.com/";


    public HomePage(WebDriver driver) {
        super(driver);
    }


}
