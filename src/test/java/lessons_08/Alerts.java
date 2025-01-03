package lessons_08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Project\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        WebElement button1alert = driver.findElement(By.xpath("(//button[@onclick=\"jsAlert()\"])"));
        WebElement result = driver.findElement(By.id("result"));
        button1alert.click();

        //alertlerdeki tamam butonuna basıp kabul etmek içim accept metodunu kullanabiliriz
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        String expectedResult = "You successfully clicked an alert";
        String actualResult = result.getText();
        if(actualResult.equals(expectedResult)){
            System.out.println("Alert test passed");
        }
        Thread.sleep(1000);
        driver.close();



    }
}
