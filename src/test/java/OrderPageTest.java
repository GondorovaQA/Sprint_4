import PageObject.MainPage;
import PageObject.OrderPage;
import PageObject.RentPage;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class OrderPageTest {

    private WebDriver driver;
    private String name;
    private String surName;

    public OrderPageTest(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"Ольга", "Гондорова"},
                {"Иван", "Иванов"},
                {"Алексей", "Пупкин"}
        });
    }

    @Test
    public void sendOrderUP() {
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.get("https://qa-scooter.praktikum-services.ru/");

        MainPage objMainPage = new MainPage(driver);
        driver.findElement(By.xpath("//*[@id='rcc-confirm-button']")).click();
        objMainPage.clickButtonOrderUp();

        OrderPage objOrderPage = new OrderPage(driver);
        objOrderPage.setInputName(name);
        objOrderPage.setInputSurName(surName);
        objOrderPage.setInputAddress("Калининград, Ялтинская улица, 72");
        objOrderPage.clickInputMetroStation();
        objOrderPage.clickDropDownMetroStation();
        objOrderPage.setInputPhoneNumber("89114612680");
        objOrderPage.clickButtonContinue();

        RentPage objRentPage = new RentPage(driver);
        objRentPage.clickInputCalendar();
        objRentPage.clickCalendarDate();
        objRentPage.clickInputRent();
        objRentPage.clickDropDownRent();
        objRentPage.clickCheckBoxColor();
        objRentPage.setInputComment("123йцу");
        objRentPage.clickButtonOrder();
        objRentPage.clickButtonYes();
        objRentPage.checkOrderIsProcessed();
    }


    @Test
    public void sendOrderDown() {
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.get("https://qa-scooter.praktikum-services.ru/");

        MainPage objMainPage = new MainPage(driver);
        driver.findElement(By.xpath("//*[@id='rcc-confirm-button']")).click();
        objMainPage.clickButtonOrderDown();

        OrderPage objOrderPage = new OrderPage(driver);
        objOrderPage.setInputName(name);
        objOrderPage.setInputSurName(surName);
        objOrderPage.setInputAddress("Калининград, Ялтинская улица, 72");
        objOrderPage.clickInputMetroStation();
        objOrderPage.clickDropDownMetroStation();
        objOrderPage.setInputPhoneNumber("89114612680");
        objOrderPage.clickButtonContinue();

        RentPage objRentPage = new RentPage(driver);
        objRentPage.clickInputCalendar();
        objRentPage.clickCalendarDate();
        objRentPage.clickInputRent();
        objRentPage.clickDropDownRent();
        objRentPage.clickCheckBoxColor();
        objRentPage.setInputComment("123йцу");
        objRentPage.clickButtonOrder();
        objRentPage.clickButtonYes();
        objRentPage.checkOrderIsProcessed();

    }

    @After
    public void teardown() {
        driver.quit();
    }
}
