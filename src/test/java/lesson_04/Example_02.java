package lesson_04;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_02 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Project\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //1. Youtube sayfasına gidelim.
        driver.navigate().to("https://www.youtube.com/");

        //2.Sayfanın konumunu ve boyutlarını yazdırın
        System.out.println("Sayfanın Konumu: " + driver.manage().window().getPosition());
        System.out.println("Sayfanın Boyutu: " + driver.manage().window().getSize());

        //3. Sayfanın konumunu ve boyutunu istediğiniz şekilde ayarlayın
        driver.manage().window().setPosition(new org.openqa.selenium.Point(9, 9));
        driver.manage().window().setSize(new org.openqa.selenium.Dimension(901, 1077));

        //4.Sayfanın sizin istediğiniz konum ve boyuta geldiğini test edin
        int xKoordinat = driver.manage().window().getPosition().getX();
        int yKoordinat = driver.manage().window().getPosition().getY();
        int weight = driver.manage().window().getSize().getWidth();
        int height = driver.manage().window().getSize().getHeight();

        Thread.sleep(3000);
        if(xKoordinat == 9 && yKoordinat == 9 && weight == 901 && height == 1077) {
            System.out.println("Test Case Passed");
        }else {
            System.out.println("Test Case Failed");
        }

        //5.Sayfayı kapatın
        driver.close();

    }
}
