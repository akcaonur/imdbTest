package com.testinium.pages;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;


public class BasePage {
    final static Logger Log = Logger.getLogger(BasePage.class);

    WebDriverWait wait;
    protected WebDriver driver;



    public void check(String direktor,String writer,String stars){
        wait(1);
        Assert.assertEquals("Charles Chaplin",direktor);
        Assert.assertEquals("Charles Chaplin",writer);
        Assert.assertEquals("Charles Chaplin",stars);
        wait(1);
    }

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait= new WebDriverWait(this.driver , 500);
        PageFactory.initElements(driver, this);
    }

    public void waitForPageLoad() {

        Log.info("sayfanın yüklenmesini bekler");
        Wait<WebDriver> wait = new WebDriverWait(driver, 10);
        wait.until(new Function<WebDriver, Boolean>() {
            public Boolean apply(WebDriver driver) {
                System.out.println("Current Window State       : "
                        + String.valueOf(((JavascriptExecutor) driver).executeScript("return document.readyState")));
                return String
                        .valueOf(((JavascriptExecutor) driver).executeScript("return document.readyState"))
                        .equals("complete");
            }
        });
    }

    public void checkPhoto(ArrayList<WebElement> urunListesi){
        wait(1);
        for(int i=0; i<urunListesi.size();i++){
            String urunResmi=urunListesi.get(i).getAttribute("src");
            Assert.assertTrue(urunResmi.contains("https://m.media-amazon.com/images/"));
        }
    }
    public void wait(int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public void click(WebElement webElement){
        wait(1);
        webElement.click();
        waitForPageLoad();
    }

}
