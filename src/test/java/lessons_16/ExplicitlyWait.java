package lessons_16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitlyWait {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Project\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //amazona git
        driver.get("https://www.amazon.com.tr");

        //searchbox locate et
        WebElement element = driver.findElement(By.id("twotabsearchtextbox"));
        element.sendKeys("iphone");

        //WebElement button = driver.findElement(By.id("nav-search-submit-button"));

        // Explicitly kullandık. sadece verdiğimiz ıd değeri hatalı olunca ya da herhangi bir değer hatalı olduğu zamann
        // onu 15 snye boyunca arar eğer bulamazsa hata fırlatır.
        // bu da yine hata yoksa elementi bulduğu anda sonraki işleme geçer yani 15 snye beklemesine gerek yoktur.
        // bu da genelde daha çok beklememiz gereken durumlarda kullanılır server ya da sayfa yavaş
        // açılıyorsa vs 30 40 sn ye beklememiz gerekirse bunu kullanırız yoksa
        // Implicitly wait bizim işşimizi görüyor. Bunu özel yerler de mesela komple tüm sayfayı 30 sn ye vs
        // bekletmemize gerek yoksa atıyorum sadece bir butonn geç açılıyor sadece ona özel olarak kullanıp diğerlerini 30 sn ye
        // bekletmemize gerek olmaz
        WebElement button = new WebDriverWait(driver, Duration.ofSeconds(15)).
                until(ExpectedConditions.elementToBeClickable(By.id("nav-search-submit-button")));

        button.click();
    }
}
