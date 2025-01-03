package lessons_09;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAuthentication {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Project\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.get("https://the-internet.herokuapp.com/basic_auth");
        //şifre ve username (admin admin ) bilgilerini linke girersek direkt bizi giriş yaptığımı zsayfaya götürür.
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        //Html Komutu: https://username:password@URL bunu developerlardann istememiz lazım yani yukarıdaaki gibi username ve password yazabilmekk için yani kullanıcı adı ve şifreyi alıp sonra da sayfanın url eklememiz lazım


    }
}
