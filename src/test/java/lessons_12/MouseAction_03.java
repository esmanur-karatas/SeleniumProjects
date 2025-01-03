package lessons_12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction_03 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Project\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // https://selenium08.blogspot.com/2020/01/click-and-hold.html sayfasına git
        String url= "https://selenium08.blogspot.com/2020/01/click-and-hold.html";
        driver.get(url);

        //Locate the element C ve Element D.
        WebElement titleC = driver.findElement(By.xpath("//li[@name='C']"));
        WebElement titleD = driver.findElement(By.xpath("//li[@name='D']"));

        //C elementini D elementinin üzerinde bekletin.
        Actions action = new Actions(driver);
        action.clickAndHold(titleC).moveToElement(titleD).release(titleC).perform();
        driver.quit();
        System.out.println("Test passed.");
    }
}
