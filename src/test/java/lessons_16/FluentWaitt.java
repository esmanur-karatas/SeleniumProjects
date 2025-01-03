package lessons_16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class FluentWaitt {
    static int count =1;
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Project\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com.tr/");

        WebElement element = driver.findElement(By.id("twotabsearchtextbox"));
        element.sendKeys("iphone");


        //Burada max 30 snye de bir yapacaksın işlemi ama her snye bunu kontrol etme 5 snye de bir bunu kontrol et dedik.
        //Eğer exception fırlatırsa bunu ignore et yani görmezden gel işlemine devam et max süre dolana kadar.
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(Exception.class);

        WebElement button = wait.until(FluentWaitt::apply);

        button.click();


    }


    private static WebElement apply(WebDriver driver) {
        System.out.println(count+". Deneme");
        count++;
        return driver.findElement(By.id("nav-search-submit-butto"));
    }
    }

