package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;

    public class MainPage {
        private WebDriver driver;

        // Локатор для выпадающего списка "Вопросы о важном"
        private By buttonDropDown = By.xpath("//*[@id='accordion__heading-0' and @aria-disabled='false' and @aria-expanded='false']");
        // Локатор для текста после клика "Вопросы о важном"
        private By textDropDown = By.xpath("//*[@id='accordion__panel-0']/p");
        // Локатор для кнопка "Заказать" на верху страницы
        private By buttonOrderUp = By.xpath("//*[@id='root']/div/div/div[4]/div[2]/div[5]/button");
        // Локатор для кнопка "Заказать" на верху страницы
        private By buttonOrderDown = By.xpath("//*[@id='root']/div/div/div[4]/div[2]/div[5]/button");

        public MainPage(WebDriver driver){
            this.driver = driver;
        }

        public void clickButtonDropDown() {
            driver.findElement(buttonDropDown).click();
        }

        public void checkTextDropDown() {
            WebElement elementTextDropDown = driver.findElement(textDropDown);
            assertEquals("Сутки — 400 рублей. Оплата курьеру — наличными или картой.", elementTextDropDown.getText());
        }

        public void clickButtonOrderUp () {
            driver.findElement(buttonOrderUp).click();
        }
        public void clickButtonOrderDown() {
            driver.findElement(buttonOrderDown).click();
        }

        }


