package lessons_11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;
import java.util.Set;

public class WindowHandle {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Project\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //1.https://the-internet.herokuapp.com/windows sayfasına git
        String url = "https://the-internet.herokuapp.com/windows";
        driver.get(url);
        String windowHandle1 = driver.getWindowHandle();
        Thread.sleep(2000);
        //2.Click here butonuna basın
        WebElement clickHere = driver.findElement(By.linkText("Click Here"));
        clickHere.click();
        Set<String> handleDegerleriSet = driver.getWindowHandles();
        System.out.println("Handle Değerleri Set: " + handleDegerleriSet);
        String windowHandle2 = driver.getWindowHandle();
        for(String each : handleDegerleriSet){
            if(!each.equals(windowHandle1)){
                windowHandle2 = each;
            }
        }
        driver.switchTo().window(windowHandle2);
        Thread.sleep(2000);
        //3.Açılan yeni pencerenin sayfa başlığının "New Window" olduğunu doğrulayın
        if(driver.getTitle().equals("New Window")){
            System.out.println("Başlık testi başarılı: " + driver.getTitle());
        }
        Thread.sleep(2000);
        //4.Bir önceki pencereye geri döndükten sonra sayfa başlığının "The Internet" olduğunu doğrulayın
        driver.switchTo().window(windowHandle1);
        if(driver.getTitle().equals("The Internet")){
            System.out.println("Title testi 2 başarılı: " + driver.getTitle());
        }
        Thread.sleep(2000);
        //5.Elemental selenium butonuna tıklayın
        WebElement elemantalSelenium = driver.findElement(By.linkText("Elemental Selenium"));
        elemantalSelenium.click();
        Set<String> handleDegerleriSet2 = driver.getWindowHandles();
        String windowHandle3 = " ";
        for(String each : handleDegerleriSet2){
            if(!each.equals(windowHandle1) && !each.equals(windowHandle2)){
                windowHandle3 = each;
            }
        }
        driver.switchTo().window(windowHandle3);
        Thread.sleep(2000);
        //6.Açılan yeni pencerenin sayfa başlığının "Elemental Selenium" içerdiğini doğrulayın
        if(driver.getTitle().contains("Elemental Selenium")){
            System.out.println(driver.getTitle());
        }
        Thread.sleep(2000);
        //7.Bir önceki pencereye geri döndükten sonra sayfa başlığının "The Internet" olduğunu doğrulayın
        driver.switchTo().window(windowHandle1);
        if(driver.getTitle().equals("The Internet")){
            System.out.println(driver.getTitle());
        }
        Thread.sleep(2000);
        //Browserı kapatın
        driver.quit();
    }
}
