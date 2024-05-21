package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainPage {
    private WebDriver driver;

    // Локаторы для вопросов и ответов
    private By[] buttonDropDowns = {
            By.id("accordion__heading-0"),
            By.id("accordion__heading-1"),
            By.id("accordion__heading-2"),
            By.id("accordion__heading-3"),
            By.id("accordion__heading-4"),
            By.id("accordion__heading-5"),
            By.id("accordion__heading-6"),
            By.id("accordion__heading-7")
    };

    private By[] textDropDowns = {
            By.cssSelector("[aria-labelledby='accordion__heading-0']"),
            By.cssSelector("[aria-labelledby='accordion__heading-1']"),
            By.cssSelector("[aria-labelledby='accordion__heading-2']"),
            By.cssSelector("[aria-labelledby='accordion__heading-3']"),
            By.cssSelector("[aria-labelledby='accordion__heading-4']"),
            By.cssSelector("[aria-labelledby='accordion__heading-5']"),
            By.xpath("//*[@id='accordion__panel-6']/p"),
            By.cssSelector("[aria-labelledby='accordion__heading-7']")
    };

    // Локатор для кнопка "Заказать" на верху страницы
    private By buttonOrderUp = By.xpath("//*[@id='root']/div/div/div[4]/div[2]/div[5]/button");
    // Локатор для кнопка "Заказать" на верху страницы
    private By buttonOrderDown = By.xpath("//*[@id='root']/div/div/div[4]/div[2]/div[5]/button");



    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    // Метод для клика по вопросу и возврата текста ответа
    public String clickAndGetAnswer(int questionIndex) {
        driver.findElement(buttonDropDowns[questionIndex]).click();
        return driver.findElement(textDropDowns[questionIndex]).getText();
    }

    public void clickButtonOrderUp () {
        driver.findElement(buttonOrderUp).click();
    }
    public void clickButtonOrderDown () {
        driver.findElement(buttonOrderDown).click();
    }
}
