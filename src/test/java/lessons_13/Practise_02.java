package lessons_13;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Practise_02 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Project\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //https://html.com/tags/iframe/ sayfasına gidin
        String url = "https://html.com/tags/iframe/";
        driver.get(url);

        //videoyu görecek kadar aşağı inin
        //keys.pageDown sayfa da 1 kare aşağı iner o yüzden 2 kere pageDown ve bir satır da sonra yukarı çıkarsa video tam görünüyor bunun içine de Arrow_up kullandık. Bunu önceden sayfada denedik o yüzden biliyoruz kaç kere aşağı inip kaç kere yukarı çıkacağımızı
        Actions action = new Actions(driver);
        action.sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.ARROW_UP).
                perform();

        //videoyu izlemek için Play Tuşuna basın
        WebElement playIframe = driver.findElement(By.xpath("(//iframe)[1]"));
        driver.switchTo().frame(playIframe);
        Thread.sleep(2000);
        WebElement playButton = driver.findElement(By.xpath("//button[@aria-label='Oynat']"));
        playButton.click();

        //videoyu çalıştırdığınızı test edin
        WebElement duraklatVideo = driver.findElement(By.xpath("//*[@class='ytp-play-button ytp-button']"));
        if(duraklatVideo.isEnabled()){
            System.out.println("Video Oynatılıyor");
        }
        //video durdurun
        Thread.sleep(2000);
        duraklatVideo.click();

        //browserı kapatın.
        Thread.sleep(2000);
        driver.quit();

    }
}
