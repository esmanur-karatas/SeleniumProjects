package lesson_05;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise_01 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Project\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //1.amazon sitesine git
        driver.get("https://www.amazon.com.tr/");


        //3.Arama butonuna iphone 11 yaz ve arama işlemmini yap
        //sendKeys metodu ile iphone 11 yazıyoruz.
        //enterlamanın 3 farklı kullanım şekli var 1. sendKeys(""İphone 11", Keys.ENTER);
        driver.findElement(By.name("field-keywords")).sendKeys("İphone 11", Keys.ENTER);

        //2.Çerezleri kabul et
        driver.findElement(By.id("sp-cc-accept")).click();


        //4.Arama sonucunun iphone 11 içerik içermediğini kontrol edin.
        // Arama ksımına iphone 11 yazıp üstte çıkan "20.000 üzeri sonuç arasından 1-48 arası gösteriliyor. Aranan ürün: "İphone 11" yazını inceleyip
        // buradaki divin içindeki classı alıyoruz. aynı zmaanda da ilk span içindeki metni almak içinde span[1] yazarız.
        //Contains içeriyor mu anlamına gelir ifin içindeki
        String aramaSonucuText =
                driver.findElement(By.xpath("(//h2[@class='a-size-base a-spacing-small a-spacing-top-small a-text-normal'])/span[1]")).getText()+
                driver.findElement(By.xpath(("(//h2[@class='a-size-base a-spacing-small a-spacing-top-small a-text-normal'])/span[3]"))).getText();
        System.out.println("Arama sonucu: " + aramaSonucuText);
         if(aramaSonucuText.contains("İphone 11")){
             System.out.println("Arama sonucu İphone 11 içeriyor.");
         }else {
           System.out.println("Arama Sonucu İphone 11 İçermiyor.");
         }

        //5.İlk ürünün fiyatını konsola yazdırın
        System.out.println("İphone 11 Fiyatı: "+driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText());

        //6.2sn bekleyip browserı kapatın.
        Thread.sleep(2000);
        driver.close();
    }
}
