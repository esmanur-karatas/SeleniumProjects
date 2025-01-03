package lessons_15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Project\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //https://the-internet.herokuapp.com/upload adresine gidin
        String url = "https://the-internet.herokuapp.com/upload";
        driver.get(url);

        //Dosya seç butonuna basalım
        WebElement fileChoose = driver.findElement(By.id("file-upload"));

        // yüklemek istediğiniz dosyayı seçelim
        String filePath = System.getProperty("user.home") + "\\Downloads\\Prakash_Reddy_Resume.pdf";
        fileChoose.sendKeys(filePath);
        Thread.sleep(2000);

        // upload butonuna basalım
        WebElement fileUpload = driver.findElement(By.id("file-submit"));
        fileUpload.click();
        Thread.sleep(2000);

        //"File Uploaded!" textinin görüntülendiğini test edelim.
        WebElement text = driver.findElement(By.xpath("//h3[.='File Uploaded!']"));
        if(text.isEnabled()) {
            System.out.println("Test Passed!");
        }else {
            System.out.println("Test Failed!");
        }

        Thread.sleep(2000);
        driver.quit();

    }
}
