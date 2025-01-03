package lessons_16;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImplicitlyWait {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Project\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //mesela aşağıdaki id yi yanlış girdik diyelim o zmaan tekrar bakmadan hemen elementi bulamadım hatası döner ama biz aşağıdaki kodu yazarsak on sn boyunca arar ve sonrasında on ya da kaç sn yazdıysak ondan sonra bize hata fırlatır.
        //Fırlattığı hata NoSuchElementException
        //elementi bulduğu anda da hiç beklemeden yoluna devam eder yani sonraki işleme geçer on sn beklemez
        //genelde 15 sn ye bekletilir.
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //amazona git
        driver.get("https://www.amazon.com.tr");

        //searchbox locate et
        WebElement element = driver.findElement(By.id("twotabsearchtextbox"));

        //iphone arat ve enter la arat
        element.sendKeys("Iphone", Keys.ENTER);

    }
}
