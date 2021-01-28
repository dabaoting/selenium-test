import com.google.common.annotations.VisibleForTesting;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@Epic("selenium")
public class Test01 {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.baidu.com");
    }

    @Story("打开Chrome")
    @Test
    public void test01() throws Exception{
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.baidu.com");
        Thread.sleep(10);
        driver.quit();
    }
}
