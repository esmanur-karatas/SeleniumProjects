package lesson_03;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverNavigateMethods {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Project\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
//Threadleri işlemleri yavaş olarak görmek için koydun. OLmasa da olur sen ekledin
        //1.Amazon ana sayfa getir
        //Burada normal get motudu da kullanabiliriz İkiside aynı işlemi sırasıyle yapar amazon ve youtube sırasıyla açar Ama hız farkı olabilir navigate daha hızlı
        driver.navigate().to("https://www.amazon.com.tr/?&tag=trtxtgoabkde-21&ref=pd_sl_7r6v9rntlw_e&adgrpid=154611856018&hvpone=&hvptwo=&hvadid=674177764078&hvpos=&hvnetw=g&hvrand=1418956323193725830&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1012773&hvtargid=kwd-10573980&hydadcr=12932_2354400&language=tr_TR");
        Thread.sleep(3000);

        //2.Youtube Sayfasına Gidelim
        //Burada normal get motudu da kullanabiliriz İkiside aynı işlemi sırasıyle yapar amazon ve youtube sırasıyla açar.Ama hız farkı olabilir navigate daha hızlı
        driver.navigate().to("https://www.youtube.com/");
        Thread.sleep(3000);

        //3.Tekrar Amazon Sayfasına Dönelim back metodu ile geri dönüyoruz.
        driver.navigate().back();
        Thread.sleep(3000);

        //4.Yeniden youtube sayfasına gidelim forwad metodu ile de ileri dönüyoruz.
        driver.navigate().forward();
        Thread.sleep(3000);

        //5.Sayfayı refresh(yenile) yapalım
        driver.navigate().refresh();
        Thread.sleep(3000);

        //6.Sayfayı Kapatalım
        driver.close();

    }
}
