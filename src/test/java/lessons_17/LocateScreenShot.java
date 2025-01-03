package lessons_17;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.time.Duration;

public class LocateScreenShot {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Project\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //amazona git
        String url = "https://www.amazon.com.tr/";
        driver.get(url);

        //Aramam kutusuna apple yaz ve ara
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("Apple", Keys.ENTER);

        //arama kutusunun ekran görüntüsünü al
        // Belli bir alanin SS islemide 4 adimda gerceklesir
        //1. ScreenShot islemini yapacagimiz elementi locate etmek
        WebElement locateSS = driver.findElement(By.xpath("(//div[@class=\"a-section a-spacing-small a-spacing-top-small\"])[1]"));
        //2. ScreenShot'i kayıt edecegimiz bir File olusturacagiz
        String output = System.getProperty("user.dir") + "//ScreenShot//locateSS.png";
        File webElementSS = new File(output);
        //3. Gecici Resim icin bir screenshot dosyasi olusturacagiz
        File geciciResim = locateSS.getScreenshotAs(OutputType.FILE);
        //4. Gecici REsmi asil dosyasina copy islemi yapilir.
        //FileUtils.copyFile(geciciResim, webElementSS);

        // Driver'i kapat
        driver.quit();

    }
}
