package lessons_10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {
    public static void main(String[] args) throws InterruptedException {
        //iframe nedir? Bir web sayfası içine yerleştirilmiş başka bir web sayfası başka bir ifadeyle bir html dökümanı içerisine yerleştirilmiş başka bir html doküman
        //mesela youtube videoları linkleri, reklamlar vs vs

        System.setProperty("webdriver.chrome.driver", "C:\\Project\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // https://the-internet.herokuapp.com/iframe sayfasına gidin
        String url = "https://the-internet.herokuapp.com/iframe";
        driver.get(url);

        //"An IFrame containing..." textinin erişilebilir olduğunu test edin ve konsolda yazdırın.
        WebElement TitleText = driver.findElement(By.xpath("//div//h3"));
        String expectedResult = "An iFrame containing the TinyMCE WYSIWYG Editor";
        String actualResult = TitleText.getText();

        if(expectedResult.equals(actualResult)){
            System.out.println("Test Passed");
            System.out.println(actualResult);
        }
        //TextBox' a Merhaba Dünya yazdırın
        //1.İşlem iframe locate  etmek
        Thread.sleep(2000);
        WebElement iframe= driver.findElement(By.tagName("iframe"));
        //2.İşlem driver' ı iframe içerisine göndereceğiz.
        driver.switchTo().frame(iframe);
        Thread.sleep(2000);
        WebElement textElement = driver.findElement(By.xpath("//body//p"));
        //Textarea içinde yazan yazıyı silmek için
        Thread.sleep(2000);
        textElement.clear();
        //içine girmek istediğimiz merhaba dünya yazısı için sendkey kullandık
        textElement.sendKeys("Merhaba Dünya!");
        Thread.sleep(2000);

        //3.işlem driver ı iframe içerisinden çıkarma işlemi
        driver.switchTo().parentFrame(); //bir üst seviyedeki frame çıkarır
        Thread.sleep(2000);
     //   driver.switchTo().defaultContent(); // en üst frame çıkar.
        driver.quit();

    }
}
