package lessons_15;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.file.Files;
import java.nio.file.Paths;

public class FileDownload {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Project\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //https://the-internet.herokuapp.com/download url gidin
        String url = "https://the-internet.herokuapp.com/download ";
        driver.get(url);
        Thread.sleep(2000);

        //Prakash_Reddy_Resume.pdf dosyasını indirin
        WebElement resumeElement = driver.findElement(By.xpath("//a[.='Prakash_Reddy_Resume.pdf']"));
        resumeElement.click();
        Thread.sleep(2000);

        //Prakash_Reddy_Resume.pdf dosyasının indirildiğiniz kontrol edin
        // C:\Users\Huawei\Downloads\Prakash_Reddy_Resume.pdf
        String filePath = System.getProperty("user.home") + "\\Downloads\\Prakash_Reddy_Resume.pdf";
        Boolean result = Files.exists(Paths.get(filePath));
         if (result) {
             System.out.println("Prakash_Reddy_Resume.pdf found");
         }else {
             System.out.println("Prakash_Reddy_Resume.pdf not found");
         }

         //Browser'ı kapatın
         Thread.sleep(2000);
         driver.quit();
    }
}
