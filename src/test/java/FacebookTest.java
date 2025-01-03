import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FacebookTest {
    @Test
    public void loginTest(){
        WebDriver login = WebDriverManager.chromedriver().create();
        login.get("https://www.facebook.com/");

        login.findElement(By.id("email"));
        login.findElement(By.id("pass"));
        login.findElement(By.name("login"));

        login.quit();
    }
}
