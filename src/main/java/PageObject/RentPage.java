package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RentPage {

    private WebDriver driver;

    public RentPage(WebDriver driver) {
        this.driver = driver;
    }
    // Локатор для инпута "Календарь"
    private By inputCalendar = By.xpath("//*[@id='root']/div/div[2]/div[2]/div[1]/div/div/input");
    // Локатор для клика по выпдающему списку "Календаря"
    private By calendarDate = By.xpath("//*[@id='root']/div/div[2]/div[2]/div[1]/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[3]");
    // Локатор для инпута "Срок Аренды"
    private By inputRent = By.xpath("//*[@id='root']/div/div[2]/div[2]/div[2]/div");
    // Локатор для клика по выпадающему списку "Срок Аренды"
    private By dropDownRent = By.xpath("//*[@id='root']/div/div[2]/div[2]/div[2]/div[2]/div[1]");
    // Локатор для "Цвет самоката"
    private By checkBoxColor = By.className(("Checkbox_Input__14A2w"));
    // Локатор для инпута "Комментарий"
    private By inputComment = By.xpath("//*[@id='root']/div/div[2]/div[2]/div[4]/input");
    // Локатор для кнопки "Заказать"
    private By buttonOrder = By.xpath(("//*[@id='root']/div/div[2]/div[3]/button[2]"));
    // Локатор для всплывающего окна и клика по кнопке "Да"
    private By buttonYes = By.xpath("//*[@id='root']/div/div[2]/div[5]/div[2]/button[2]");
    // Локатор для проверки отображения всплывающего окна "Заказ оформляется"
    private By orderIsProcessed = By.className("Order_Modal__YZ-d3");

    public void clickInputCalendar() {
        driver.findElement(inputCalendar).click();
    }

    public void clickCalendarDate() {
        driver.findElement(calendarDate).click();
    }

    public void clickDropDownRent() {
        driver.findElement(dropDownRent).click();
    }

    public void clickInputRent() {
        driver.findElement(inputRent).click();
    }

    public void clickCheckBoxColor() {
        driver.findElement(checkBoxColor).click();
    }

    public void setInputComment(String comment) {
        driver.findElement(inputComment).sendKeys(comment);
    }

    public void clickButtonOrder() {
        driver.findElement(buttonOrder).click();
    }

    public void clickButtonYes() {
        driver.findElement(buttonYes).click();
    }

    public void checkOrderIsProcessed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(orderIsProcessed));

        WebElement orderModal = driver.findElement(orderIsProcessed);
        if (orderModal!= null) {
            System.out.println("Заказ оформляется.");
        } else {
            System.out.println("Модальное окно с обработкой заказа не найдено на странице.");
        }
    }


}

