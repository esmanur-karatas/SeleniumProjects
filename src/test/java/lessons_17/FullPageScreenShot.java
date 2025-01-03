package lessons_17;



import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.time.Duration;

public class FullPageScreenShot {
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

        //tüm sayfanın ekran görüntüsünü al
        //ScreenShot işlemi 4 adımdan oluşur.
        //1.Adım TakeScreenShot objesi oluşturmak.
        TakesScreenshot ts = (TakesScreenshot) driver;
        //2.Adım Kaydedeceğimiz dosyayı oluşturmak
        File allPageSs =  new File("target/screenshot/alPageSs.png");
        //3.adım bir dosya daha oluşturacağız ve screenshot objesi ile ekran görüntüsü alma işlemi yapacağız.
        File geciciResim = ts.getScreenshotAs(OutputType.FILE);
        //4.adım Geçici resmi kaydettirmek istediğimiz asil dosyaya kopyalama işlemi yapılır.
       // FileUtils.copyFile(geciciResim,allPageSs);

        //driveri kapat.
        driver.quit();

    }
}
