package lesson_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverGetMethod {
    public static void main(String[] args) {
        //hangi driverı kullandığımızı tanımlamak için
        System.setProperty("webdriver.chrome.driver", "C:\\Project\\ChromeDriver\\chromedriver.exe");

        //nesne oluşturduk
        WebDriver driver = new ChromeDriver();

        //web site sayfasının url ini girmek
        //get: Belirtilen url e gider.
        driver.get("https://www.amazon.com.tr/?&tag=trtxtgoabkde-21&ref=pd_sl_7r6v9rntlw_e&adgrpid=154611856018&hvpone=&hvptwo=&hvadid=674177764078&hvpos=&hvnetw=g&hvrand=1418956323193725830&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1012773&hvtargid=kwd-10573980&hydadcr=12932_2354400&language=tr_TR");

        //Sitenin urlini yazdırmak için getCurrentUrl metodunu kullandık.
        //consola yazdırması için de system.out.println kullandık.
        System.out.println("Amazon Url: " + driver.getCurrentUrl());

        //getTitle: Sayfanın başlığını getirir.
        System.out.println("Sitenin Başlığı: " + driver.getTitle());

        //getPageSource: Sayfanın tüm html kodunu bize getiriyor.
        //System.out.println("Sayfanın html kodu: " + driver.getPageSource());

        //getWindowHandle: sayfanın bize o anki uniq değerini gösterir. her çalıştırdığımızda bize farklı bir değer verir.
        System.out.println("Uniq değer: " +driver.getWindowHandle());

        //getClass: driverın class adını verir hangi driverda olduğuna dair.
        System.out.println("driverın Class'ı: " + driver.getClass());


    }
}
