package lesson_06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Project\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Facebook adresine git.
        String url = "https://www.facebook.com/";
        driver.get(url);

        //"Yeni Hesap Oluşturun" buttonuna basın
        WebElement buttonNewAccount = driver.findElement(By.xpath("(//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"])"));
        buttonNewAccount.click();

        //RadioButton elemenlerini locate edin
        WebElement radioFemale = driver.findElement(By.xpath("(//input[@class=\"_8esa\"])[1]"));
        WebElement radioMale = driver.findElement(By.xpath("(//input[@class=\"_8esa\"])[1]"));
        WebElement radioPersonel = driver.findElement(By.xpath("(//input[@class=\"_8esa\"])[1]"));

        //Seçili değilse cinsiyet butonunda size uygun olanı seçin.
        if(!radioFemale.isSelected()){
            radioFemale.click();
        }

        driver.close();
    }
}
