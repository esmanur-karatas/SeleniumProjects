package lessons_08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertButton3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Project\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        WebElement button3alert = driver.findElement(By.xpath("(//button[@onclick=\"jsPrompt()\"])"));
        WebElement result = driver.findElement(By.id("result"));
        button3alert.click();
        Thread.sleep(2000);
        //sendKeys ile input isteyen textbox içine istediğimiz inputu yazıp okeyleyebiliriz
        driver.switchTo().alert().sendKeys("Esmanur Karataş");
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        String expectedResult = "You entered: Esmanur Karataş";
        String actualResult = result.getText();
        if(actualResult.equals(expectedResult)){
            System.out.println("Alert test passed");
        }
        driver.quit();
    }
}
