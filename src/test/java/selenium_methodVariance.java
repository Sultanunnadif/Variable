import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class selenium_methodVariance {
    @Test
    public void browserMethod(){
        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.get("https://www.saucedemo.com");

        String title = driver.getTitle();
        String currentURL = driver.getCurrentUrl();
        System.out.println("title = "+title);
        System.out.println("Url = "+currentURL);
    }
}
