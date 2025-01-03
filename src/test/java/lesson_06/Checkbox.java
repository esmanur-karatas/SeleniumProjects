package lesson_06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Project\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //1.https://the-internet.herokuapp.com/checkboxes adresine git
        String url = "https://the-internet.herokuapp.com/checkboxes";
        driver.get(url);
        // 2.Checkbox1 ve Checkbox2 elementlerini locate edin.Locate almak demek yollarını alıp tanımlama şeysi
        WebElement checkbox1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
        WebElement checkbox2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));


        // 3.Checkbox1 seçili değilse onay kutusunu tıklayın isSelected: seçiliyse
        if(checkbox1.isSelected() == false){
            Thread.sleep(2000);
            checkbox1.click();
        }

        // 4.Checkbox2 seçili değilse onay kutusuna tıklayın.
        if(checkbox2.isSelected() == false){
            Thread.sleep(2000);
            checkbox2.click();
        }
        driver.close();

    }
}
