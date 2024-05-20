package PageObject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.junit.jupiter.api.Assertions.assertEquals;



public class MainPage {


    private WebDriver driver;

    // Локатор для выпадающего списка "Вопросы о важном"
    private By buttonDropDownPrice = By.id("accordion__heading-0");
    // Локатор для выпадающего списка "Несколько самокатов"
    private By buttonDropDownSomeScooter = By.id("accordion__heading-1");
    // Локатор для выпадающего списка "Время аренды"
    private By buttonDropDownRentalTime = By.id("accordion__heading-2");
    // Локатор для выпадающего списка "Заказать сегодня"
    private By buttonDropDownOrderToDay = By.id("accordion__heading-3");
    // Локатор для выпадающего списка "Продлить заказ"
    private By buttonDropDownExtendOrder = By.id("accordion__heading-4");
    // Локатор для выпадающего списка "Зарядка"
    private By buttonDropDownCharge = By.id("accordion__heading-5");
    // Локатор для выпадающего списка "Отмена заказа"
    private By buttonDropDownCancelOrder = By.id("accordion__heading-6");
    // Локатор для выпадающего списка "Живу за МКАДом"
    private By buttonDropDownMkad = By.id("accordion__heading-7");


    // Локатор для текста после клика "Вопросы о важном"
    private By textDropDownPrice = By.cssSelector("[aria-labelledby='accordion__heading-0']");
    // Локатор для текста после клика "Несколько самокатов"
    private By textDropDownSomeScooter = By.cssSelector("[aria-labelledby='accordion__heading-1']");
    // Локатор для текста после клика "Время аренды"
    private By textDropDownRentalTime = By.cssSelector("[aria-labelledby='accordion__heading-2']");
    // Локатор для текста после клика "Заказать сегодня"
    private By textDropDownOrderToDay = By.cssSelector("[aria-labelledby='accordion__heading-3']");
    // Локатор для текста после клика "Продлить заказ"
    private By textDropDownExtendOrder = By.cssSelector("[aria-labelledby='accordion__heading-4']");
    // Локатор для текста после клика "Зарядка"
    private By textDropDownCharge = By.cssSelector("[aria-labelledby='accordion__heading-5']");
    // Локатор для текста после клика "Отмена заказа"
    private By textDropDownCancelOrder = By.xpath("//*[@id='accordion__panel-6']/p");
    // Локатор для текста после клика "Живу за МКАДом"
    private By textDropDownMkad = By.cssSelector("[aria-labelledby='accordion__heading-7']");


    // Локатор для кнопка "Заказать" на верху страницы
    private By buttonOrderUp = By.xpath("//*[@id='root']/div/div/div[4]/div[2]/div[5]/button");
    // Локатор для кнопка "Заказать" на верху страницы
    private By buttonOrderDown = By.xpath("//*[@id='root']/div/div/div[4]/div[2]/div[5]/button");

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickButtonDropDownPrice() {
        driver.findElement(buttonDropDownPrice).click();
    }
    public void clickButtonDropDownSomeScooter() {
        driver.findElement(buttonDropDownSomeScooter).click();
    }
    public void clickButtonDropDownRentalTime() {
        driver.findElement(buttonDropDownRentalTime).click();
    }
    public void clickButtonDropDownOrderToDay() {
        driver.findElement(buttonDropDownOrderToDay).click();
    }
    public void clickButtonDropDownExtendOrder() {
        driver.findElement(buttonDropDownExtendOrder).click();
    }
    public void clickButtonDropDownCharge() {
        driver.findElement(buttonDropDownCharge).click();
    }
    public void clickButtonDropDownCancelOrder() {
        driver.findElement(buttonDropDownCancelOrder).click();
    }
    public void clickButtonDropDownMkad() {
        driver.findElement(buttonDropDownMkad).click();
    }

    public void checkTextDropDownPrice() {
        String expected = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
        String actual = driver.findElement(textDropDownPrice).getText();
        assertEquals(expected, actual);
    }
    public void checkTextDropDownSomeScooter() {
        String expected = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
        String actual = driver.findElement(textDropDownSomeScooter).getText();
        assertEquals(expected, actual);
    }
    public void checkTextDropDownRentalTime() {
        String expected = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
        String actual = driver.findElement(textDropDownRentalTime).getText();
        assertEquals(expected, actual);
    }
    public void checkTextDropDownOrderToDay() {
        String expected = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
        String actual = driver.findElement(textDropDownOrderToDay).getText();
        assertEquals(expected, actual);
    }
    public void checkTextDropDownExtendOrder() {
        String expected = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
        String actual = driver.findElement(textDropDownExtendOrder).getText();
        assertEquals(expected, actual);
    }
    public void checkTextDropDownCharge() {
        String expected = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
        String actual = driver.findElement(textDropDownCharge).getText();
        assertEquals(expected, actual);
    }
    public void checkTextDropDownCancelOrder() {
        String expected = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
        String actual = driver.findElement(textDropDownCancelOrder).getText();
        assertEquals(expected, actual);
    }
    public void checkTextDropDownMkad() {
        String expected = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
        String actual = driver.findElement(textDropDownMkad).getText();
        assertEquals(expected, actual);
    }
        public void clickButtonOrderUp () {
            driver.findElement(buttonOrderUp).click();
        }
        public void clickButtonOrderDown () {
            driver.findElement(buttonOrderDown).click();
        }

    }





