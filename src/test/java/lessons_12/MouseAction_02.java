package lessons_12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction_02 {
    public static void main(String[] args) throws InterruptedException {
        //Actions class' ını kullanarak mouse ve keyboard ile yapabileceğimiz tüm işlevleri gerçekleştirebiliriz.
        //mouseActions

        //-->doubleClick(): WebElementine çift tıklama yapar
        //-->clickAndHold(): WebElementi üzerinde click yapılı olarak bizden komut bekler.
        //-->dragAndDrop(): WebElementi bir noktadan diğerine sürükler ve bırakır.
        //-->moveToElement(): Mouse'u istediğimiz WebElement'in üzerinde tutar.
        //-->contextClick(): Mouse ile istediğimiz WebElement'e sağ tıklama yapar.
        System.setProperty("webdriver.chrome.driver", "C:\\Project\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver() ;
        driver.manage().window().maximize();

        //https://the-internet.herokuapp.com/context_menu sayfasına gidin
        driver.get("https://the-internet.herokuapp.com/context_menu");

        //Cizili alan üzerine sağ click yapalım
        Actions action = new Actions(driver);
        WebElement ciziliAlan = driver.findElement(By.id("hot-spot"));
        action.contextClick(ciziliAlan).perform();
        Thread.sleep(2000);

        //Alert'ta çıkan yazının "You selected a context menu" olduğunu test edelim.
        String expectedResult = "You selected a context menu";
        String actualResult = driver.switchTo().alert().getText();
        Thread.sleep(2000);
        if(expectedResult.equals(actualResult)) {
            System.out.println("actualResult: " + actualResult);
            System.out.println("Test passed.");
        }

        //Tamam diyerek alert kapatalım
        driver.switchTo().alert().accept();
        Thread.sleep(2000);
        driver.close();


    }
}
