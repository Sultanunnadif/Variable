import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class generalSelector {
    @Test
    public void firstPage(){
        WebDriver login = WebDriverManager.chromedriver().create();
        login.get("https://shopee.co.id/buyer/login?next=https%3A%2F%2Fshopee.co.id%2F%3Fgad_source%3D1%26gclid%3DCj0KCQiA7NO7BhDsARIsADg_hIa-1MtEqGdtJMQlH5WcBwX0989Ensrj1ypMa5zYI0J45Z6WcYSMIbYaAkXREALw_wcB");

        WebDriverWait wait = new WebDriverWait(login, Duration.ofSeconds(10));

        login.findElement(By.xpath("//input[@placeholder='Email/Phone/Username']"));
        login.findElement(By.xpath("//input[@placeholder='Password']"));
        login.findElement(By.name("button"));

        login.quit();
    }
}
