package lesson_07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Dropdown {
    public static void main(String[] args) {
        System.setProperty( "webdriver.chrome.driver", "C:\\Project\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com.tr/");
        //Bunların hepsi dropdownlarda da hızlı bir şekilde seçiliyor aynı zamanda consola da yazdırılıyor.
        //dropdown locate ediyoruz.
        WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));

        //select classından bir parametreli(dropdown elementi olacak) obje oluşturuyoruz.
        Select select = new Select(dropdown);

        //1. yöntem 3 diye yazarsak 3. değeri konsola getirecek
        select.selectByIndex(3);
        System.out.println("3. Indexteki Eleman: " + select.getFirstSelectedOption().getText()); // Bebek yazması lazım


        //2. Yöntem kodlardaki istediğimiz metnin value sunu alıp yazdırabiliriz.
        select.selectByValue("search-alias=home");
        System.out.println("Value: " + select.getFirstSelectedOption().getText()); //Kitaplar yazması lazım konsola

        //3.Yöntem direkt dropdown içindeki metni de girerek istediğimiz değeri elde edebiiliriz
        select.selectByVisibleText("Amazon Depo");
        System.out.println("Visible Text: " + select.getFirstSelectedOption().getText()); //konsola Amazon Depo yazdıracak

        //Tüm Option(seçenekleri) getirmek istiyorum. Bunun içinde bir liste oluşşturuyorum.
        List<WebElement> optionsList = select.getOptions();
        int count = 1;
        System.out.println("\nTüm Liste\n");

        for(WebElement option : optionsList){
            System.out.println(count + " : " + option.getText());
            count++;
        }
        driver.close();
    }
}
