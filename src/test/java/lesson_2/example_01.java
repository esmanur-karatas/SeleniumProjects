package lesson_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example_01 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Project\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //1.Amazon Sayfasına Gidelim.
        driver.get("https://www.amazon.com.tr/?&tag=trtxtgoabkde-21&ref=pd_sl_7r6v9rntlw_e&adgrpid=154611856018&hvpone=&hvptwo=&hvadid=674177764078&hvpos=&hvnetw=g&hvrand=1418956323193725830&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1012773&hvtargid=kwd-10573980&hydadcr=12932_2354400&language=tr_TR");

        //2.Sayfa Başlığını Yazdırın.
        System.out.println("Sayfa Başlığı: " + driver.getTitle());
        String actualTitle=driver.getTitle(); // başlığı bunun içine attık 3. maddedeki karşılaştırmayı yapmak için
        //yani gelen başlık değerinin içinde Amazon var mı diye aratacağız aşağıda.

        //3.Sayfa başlığının amazon içerdiğini test edin
        String expectedTitle = "Amazon";
        if(actualTitle.contains(expectedTitle)) {
            System.out.println("Title Testing Passed");
        }
        else {
            System.out.println("Title Testing Failed");
        }
        //4.Sayfa adresini url yazdırın
        System.out.println("Sayfanın url:" + driver.getCurrentUrl());

        //5.Sayfa urlnin amazon içerdiğini test edin
        String actualUrl=driver.getCurrentUrl();
        String expectedUrl = "amazon";
        if(actualUrl.contains(expectedUrl)) {
            System.out.println("Url Testing Passed");
        }else {
            System.out.println("Url Testing Failed");
        }

        //6.Sayfa Handle değerini yazdırın
        System.out.println("Sayfanın Handle Değeri:" + driver.getWindowHandle());

        //7.Sayfa html kodlarını "shopping" kelimesi geçtiğini test edin
        String pageSource = driver.getPageSource();
        String expectedPageSource="shopping";
        if(pageSource.contains(expectedPageSource)) {
            System.out.println("Page Source Testing Passed");
        }else {
            System.out.println("Page Source Testing Failed");
        }

        //8.Sayfayı kapatın.
        Thread.sleep(2000);
        driver.close();
    }
}
