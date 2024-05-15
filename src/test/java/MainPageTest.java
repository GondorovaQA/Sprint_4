import PageObject.MainPage;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class MainPageTest {
    private WebDriver driver;

    @Test
    public void checkTextDropDown() {
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.get("https://qa-scooter.praktikum-services.ru/");
        MainPage objMainPage = new MainPage(driver);

        driver.findElement(By.xpath("//*[@id='rcc-confirm-button']")).click();
        objMainPage.clickButtonDropDown();
        objMainPage.checkTextDropDown();


    }

    @After
    public void teardown() {
        // Закрой браузер
        driver.quit();
    }
}

