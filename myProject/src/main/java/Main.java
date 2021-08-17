import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        try {

            driver.get("https://store.steampowered.com/login/");

            Thread.sleep(5000);

            WebElement login =driver.findElement(By.id("input_username"));
            WebElement password =driver.findElement(By.id("input_password"));
            login.sendKeys("TexantUser");
            password.sendKeys("Z<K`'2+en=H$~_Ck", Keys.ENTER);

        }
        catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }

    }
}
