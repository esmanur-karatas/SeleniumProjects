package lesson_05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise_02 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Project\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //1.amazon sitesine git
        driver.get("https://www.amazon.com.tr/");

        //2.Search kutusuna "laptop" yazıp aratın
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("laptop");
        searchBox.submit(); //enterlar

        // 3.Amazonda görüntülenen ilgili sonuçların sayısını yazzdırın
        WebElement searchResultCount = driver.findElement(By.xpath("(//h2[@class='a-size-base a-spacing-small a-spacing-top-small a-text-normal'])/span[1]"));
        System.out.println("Arama sonucu: " + searchResultCount.getText());

        //2.Çerezleri kabul et
        driver.findElement(By.id("sp-cc-accept")).click();

        // 4. Sonra karşınıza çıkan ilk sonucun resmine tıklayın
        WebElement firstPicture =   driver.findElement(By.xpath("(//div[@class=\"a-section aok-relative s-image-square-aspect\"]/img[1])"));
        firstPicture.click();

        // 5.2sn bekleyip kapatın
        Thread.sleep(2000);
        driver.quit();
    }
}
