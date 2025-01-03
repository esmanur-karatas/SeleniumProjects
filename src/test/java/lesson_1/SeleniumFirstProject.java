package lesson_1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFirstProject {

    public static void main(String[] args) throws InterruptedException {
        //hangi driverı kullandığımızı tanımlamak için
        System.setProperty("webdriver.chrome.driver", "C:\\Project\\ChromeDriver\\chromedriver.exe");

        //nesne oluşturduk
        WebDriver driver = new ChromeDriver();

        //web site sayfasının url ini girmek
        driver.get("https://www.amazon.com.tr/?&tag=trtxtgoabkde-21&ref=pd_sl_7r6v9rntlw_e&adgrpid=154611856018&hvpone=&hvptwo=&hvadid=674177764078&hvpos=&hvnetw=g&hvrand=1418956323193725830&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1012773&hvtargid=kwd-10573980&hydadcr=12932_2354400&language=tr_TR");

        //3 saniye tarayıcıda web sayfasını görüp kapatacağız
        Thread.sleep(3000);
        driver.close();
    }
}
