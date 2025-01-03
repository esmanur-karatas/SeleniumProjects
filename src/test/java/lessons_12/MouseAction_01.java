package lessons_12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction_01 {
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

        //amazon sayfasına gidin
        driver.get("https://www.amazon.com.tr");
        //Çerezleri kabul et
        driver.findElement(By.id("sp-cc-accept")).click();


        //sağ üstte :Hello, sign in elementinin üzerinde mouse' u bekletin.
        Actions action = new Actions(driver);
        WebElement helloTextElement = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        action.moveToElement(helloTextElement).perform();
        Thread.sleep(2000);

        //acilan menü de create a list linkine tıklayın
        WebElement createList = driver.findElement(By.xpath("(//span[@class='nav-text'])[1]"));
        action.click(createList).perform();
        //ve create list sayfasını açıldığıonı test edin.
        String expectedResult = "https://www.amazon.com.tr/hz/wishlist/intro";
        String actualResult = driver.getCurrentUrl();
        if(expectedResult.equals(actualResult)) {
            System.out.println("Success");
        }
        Thread.sleep(2000);
        driver.quit();



    }
}
