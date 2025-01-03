package lessons_08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertButton2 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Project\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        WebElement button2alert = driver.findElement(By.xpath("(//button[@onclick=\"jsConfirm()\"])"));
        WebElement result = driver.findElement(By.id("result"));
        button2alert.click();
        Thread.sleep(2000);
        //dismiss metodu da alertte gelen uyarıda iptal basmak istediğimiz zaman kullanırız
        driver.switchTo().alert().dismiss();
        Thread.sleep(2000);

        String expectedResult = "You clicked: Ok";
        String actualResult = result.getText();
        if(actualResult.equals(expectedResult)){
            System.out.println("Alert test passed");
        }
         Thread.sleep(2000);
         driver.close();
    }
}
