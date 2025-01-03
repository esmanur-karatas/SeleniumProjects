package lessons_18;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class JavaScriptExecuter_01 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Project\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //amazona git
        String url = "https://www.amazon.com.tr/";
        driver.get(url);

        // JavascsriptExecuter classını kullanmak icin 3 adim izlenmesi gerekir

        //1.Adim JSExecuter objesi olusturup driver'i cast edecegiz
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        // 2.Adim ilgili WebElementi locate edilir
        WebElement sellElement = driver.findElement(By.xpath("//*[.='Markanızı Koruyun ve Oluşturun']"));
        //3.Adim jse.executeScript("ilgili script", ilgiliElement)
        jse.executeScript("arguments[0].click();", sellElement);

        WebElement controlElement = driver.findElement(By.xpath("//div[@class =\"text align-start color-white font-size-medium ember font-bold\"]"));
        if(controlElement.isEnabled()){
            System.out.println("Test Passed !!!");
        }
        driver.quit();
    }
}
