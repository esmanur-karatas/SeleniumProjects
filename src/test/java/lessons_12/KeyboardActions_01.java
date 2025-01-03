package lessons_12;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class KeyboardActions_01 {
    public static void main(String[] args) throws InterruptedException {
        //=>Keyboard Action
        //->sendKeys(): Öğeye bir dizi anahtar gönderir.
        //->keyDown():  Klavyede tuşa basma işlemi gerçekleştirir.
        //->keyUp(): Klavyede tuşu serbest bırakma işlemi gerçekleştirir.
        //->Bu methodlar ile işlem yapmak için keys anahtar kelimesi ile kullanılır.

        System.setProperty("webdriver.chrome.driver", "C:\\Project\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //amazon sayfasına gidelim
        String url = "https://www.amazon.com.tr";
        driver.get(url);

        //arama kutusuna actions metotlarını kullanarak Samsung A71 yazdırın ve entera basarak arama yaptırın
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        Actions action = new Actions(driver);
        //önce arama kutusunun içine fareyle bir tıkladık.
        // sonra büyük harfle yazsın diye key down keys.shıft kullandık shift basılı tutsun diye.
        // send keys ile s harfini yazdırdık.
        // sonra keyup ile shiftten elimizi çektik.
        // sendkeys ile geri kalan harfleri gönderdik.
        // keysSpace ile de bir boşluk bırakıp a71 yazdırdık.
        // en son da keys.Enter ilede enter tuşuna bastık.
        action.click(searchBox).
                keyDown(Keys.SHIFT).
                sendKeys("s").
                keyUp(Keys.SHIFT).
                sendKeys("amsung").
                sendKeys(Keys.SPACE).
                sendKeys("A71").
                sendKeys(Keys.ENTER).
                perform();

        //aramanın yapıldığını test edin
        String expectedResult = "\"Samsung A71\"";
        String actualResult = driver.findElement(By.xpath("//*[.='\"Samsung A71\"']")).getText();
        if(actualResult.equals(expectedResult))
        {
            System.out.println("Test passed.");
        }

        //Browser kapat.
        Thread.sleep(2000);
        driver.quit();


    }
}
