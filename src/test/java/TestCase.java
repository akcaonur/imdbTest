
import com.testinium.pages.*;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

public class TestCase extends BaseTest {

    final static Logger Log = Logger.getLogger(TestCase.class);
    @Test
    public void test_1() {
        HomePage homePage = new HomePage(driver);
        driver.get(homePage.getUrl());
        Log.info("https://www.imdb.com/ adresine gidilir");
        homePage.waitForPageLoad();
        Log.info("sayfa açıldı");
        Log.info("Arama çubuğunun sol tarafında bulunan Menü butonuna basılır");
        homePage.click(homePage.getMenu());
        Log.info("Gelen ekranda “Award & Events” başlığı altında bulunan “Oscars” butonuna tıklanır");
        homePage.click(homePage.getOscar());
        OscarPage oscarPage = new OscarPage(driver);
        Log.info("“Event History” başlığı altında “1929” değeri seçilir");
        oscarPage.click(oscarPage.getEventHistory());
        AcedmyAwardsPage acedmyAwardsPage= new AcedmyAwardsPage(driver);
        Log.info("“Honorary Award” başlığı altında “The Circus (Charles Chaplin)” seçilir");
        acedmyAwardsPage.click(acedmyAwardsPage.getCharlie());
        Log.info("Gelen ekranda, The Circus’a ait;Director: bilgisi kayıt edilir.Writer: bilgisi kayıt edilir Stars: bilgisi kayıt edilir.");
        TheCircusPage theCircusPage = new TheCircusPage(driver);
        String director = theCircusPage.getDirector().getText();
        String writer = theCircusPage.getWriter().getText();
        String stars = theCircusPage.getStars().getText();
        Log.info("“Ekranın sol üstünde bulunan “IMDb” butonuna tıklanarak “Anasayfa’ya” dönülür.");
        homePage.click(homePage.getAnaMenu());
        Log.info("Arama çubuğuna “The Circus” yazılır");
        homePage.getSeachBar().sendKeys("The Circus");
        Log.info("Sonuçlar arasında gelen “The Circus’a” tıklanır.");
        homePage.click(homePage.getSearchResult());
        Log.info("direktor,writer,stars bilgisi kayıt edilen aynı mı kontrol edilir.");
        homePage.check(director,writer,stars);

        Log.info("Kontroller yapıldıktan sonra “See all .. photos” linkine tıklanır");
        theCircusPage.click(theCircusPage.getAllPhoto());
        Log.info("Bütün fotoğrafların linklerinin kırık olmadığını kontrol edilir.");
        ArrayList<WebElement> urunListesi= new ArrayList<>();
        urunListesi.add(theCircusPage.getPhotoCheck());
        theCircusPage.checkPhoto(urunListesi);

    }
    @Test
    public void test_2(){
        HomePage homePage = new HomePage(driver);
        driver.get(homePage.getUrl());
        Log.info("https://www.imdb.com/ adresine gidilir");
        homePage.waitForPageLoad();
        Log.info("sayfa açıldı");
        homePage.click(homePage.getMenu());
        Log.info("Arama çubuğunun sol tarafında bulunan Menü butonuna basılır");
        Log.info("Gelen ekranda “Award & Events” başlığı altında bulunan “Oscars” butonuna tıklanır");
        homePage.click(homePage.getOscar());
        OscarPage oscarPage = new OscarPage(driver);
        Log.info("“Event History” başlığı altında “1929” değeri seçilir");
        oscarPage.click(oscarPage.getEventHistory());
        AcedmyAwardsPage acedmyAwardsPage= new AcedmyAwardsPage(driver);
        Log.info("“Honorary Award” başlığı altında TheJazzSinger seçilir");
        acedmyAwardsPage.click(acedmyAwardsPage.getTheJazzSinger());
        Log.info("Gelen ekranda, TheJazzSinger’a ait;Director: bilgisi kayıt edilir.Writer: bilgisi kayıt edilir Stars: bilgisi kayıt edilir.");
        TheJazzSinger theJazzSinger = new TheJazzSinger(driver);
        String director = theJazzSinger.getDirektorJazz().getText();
        String writer = theJazzSinger.getWriterjazz().getText();
        String stars = theJazzSinger.getStarsjazz().getText();
        Log.info("“Ekranın sol üstünde bulunan “IMDb” butonuna tıklanarak “Anasayfa’ya” dönülür.");
        homePage.click(homePage.getAnaMenu());
        Log.info("Arama çubuğuna “TheJazzSinger” yazılır");
        homePage.getSeachBar().sendKeys("TheJazzSinger");
        Log.info("Sonuçlar arasında gelen TheJazzSinger'a” tıklanır.");
        theJazzSinger.click(theJazzSinger.getSearchResult());
        Log.info("direktor,writer,stars bilgisi kayıt edilen aynı mı kontrol edilir.");
        theJazzSinger.check(director,writer,stars);
        Log.info("Kontroller yapıldıktan sonra “See all .. photos” linkine tıklanır");
        theJazzSinger.click(theJazzSinger.getAllPhoto());
        Log.info("Bütün fotoğrafların linklerinin kırık olmadığını kontrol edilir.");
        ArrayList<WebElement> liste= new ArrayList<>();
        liste.add(theJazzSinger.getPhotoCheck());
        theJazzSinger.checkPhoto(liste);

    }

}
