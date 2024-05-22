package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderPage {

    private WebDriver driver;
    // Локатор для инпута "Имя"
    private By inputName = By.xpath("//*[@id='root']/div/div[2]/div[2]/div[1]/input");
    // Локатор для инпута "Фамилия"
    private By inputSurName = By.xpath("//*[@id='root']/div/div[2]/div[2]/div[2]/input");
    // Локатор для инпута "Адрес"
    private By inputAddress = By.xpath("//*[@id='root']/div/div[2]/div[2]/div[3]/input");
    // Локатор для "Станция метро"
    private By inputMetroStation = By.xpath("//*[@id='root']/div/div[2]/div[2]/div[4]/div/div/input");
    // Локатор для выпадающего списка "Станций метро"
    private By dropDownMetroStation = By.xpath("//*[@id='root']/div/div[2]/div[2]/div[4]/div/div[2]/ul/li[4]/button");
    // Локатор для инпута "Номер телефона"
    private By inputPhoneNumber = By.xpath("//*[@id='root']/div/div[2]/div[2]/div[5]/input");
    // Локатор для кнопки "Далее"
    private By buttonContinue = By.xpath(("//*[@id='root']/div/div[2]/div[3]/button"));

    public OrderPage(WebDriver driver){
        this.driver = driver;
    }

    public void setInputName(String name) {
        driver.findElement(inputName).sendKeys(name);
    }

    public void setInputSurName(String surName) {
        driver.findElement(inputSurName).sendKeys(surName);
    }

    public void setInputAddress(String address) {
        driver.findElement(inputAddress).sendKeys(address);
    }

    public void clickInputMetroStation() {
        driver.findElement(inputMetroStation).click();
    }

    public void clickDropDownMetroStation() {
        driver.findElement(dropDownMetroStation).click();
    }

    public void setInputPhoneNumber(String phoneNumber) {
        driver.findElement(inputPhoneNumber).sendKeys(phoneNumber);
    }

    public void clickButtonContinue() {
        driver.findElement(buttonContinue).click();
    }

}

