package lesson_04;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_01 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Project\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //1. Youtube sayfasına gidelim.
        driver.navigate().to("https://www.youtube.com/");

        //2. Sayfanın konumunu ve boyutunu yazdırın.
        System.out.println("Sayfanın Konumu: " + driver.manage().window().getPosition());
        System.out.println("Sayfanın Boyutu: " + driver.manage().window().getSize());

        //3.Sayfayı simge durumuna getirin
        driver.manage().window().minimize();

        //4.simge durumunda 3 saniye bekleyip sayfayı maximize edin
        Thread.sleep(3000);
        driver.manage().window().maximize();

        //5.Sayfanın konumunu ve boyutlarını maximize durumunda yazdırın
        System.out.println("Max Sayfanın Konumu: " + driver.manage().window().getPosition());
        System.out.println("Max Sayfanın Boyutu: " + driver.manage().window().getSize());


        //6.Sayfayı fullscreen yapın
        driver.manage().window().fullscreen();

        //7.Sayfanın konumunu ve boyutlarını fullscreen durumunda yazdirin
        System.out.println("FullScreen Sayfanın Konumu: " + driver.manage().window().getPosition());
        System.out.println("FullScreen Sayfanın Boyutu: " + driver.manage().window().getSize());
        Thread.sleep(3000);

        //8.sayfayı kapatın
        driver.close();
    }
}
