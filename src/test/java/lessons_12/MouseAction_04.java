package lessons_12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction_04 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Project\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // https://demoqa.com/droppable adresine gidelim
        String url = "https://demoqa.com/droppable";
        driver.get(url);

        //"Drag me" butonunu tutup "Drop here" kutusunun üstüne bırakalım
        WebElement dragMeElement = driver.findElement(By.id("draggable"));
        WebElement dropHereMeElement = driver.findElement(By.id("droppable"));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(dragMeElement, dropHereMeElement).perform();
        Thread.sleep(2000);

        //"Drop here" yazısı yerine "Drapped!" olduğunu test edin.
        String expectedResult = "Dropped!";
        String actualResult =  dropHereMeElement.getText();
        if(expectedResult.equals(actualResult))
        {
            System.out.println("Actual Result "+actualResult);
            System.out.println("Test passed!...");
        }
        Thread.sleep(2000);
        driver.quit();
    }
}
