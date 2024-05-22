import PageObject.MainPage;
import PageObject.OrderPage;
import PageObject.RentPage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class OrderPageTest extends BaseTest {

    private String name;
    private String surName;
    private String phoneNumber;

    public OrderPageTest(String name, String surName,String phoneNumber) {
        this.name = name;
        this.surName = surName;
        this.phoneNumber = phoneNumber;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"Ольга", "Гондорова", "+79114805632"},
                {"иван", "иванов", "79114805632"},
                {"Alex", "Pupkin", "(4012)584295"}
        });
    }

    @Test
    public void sendOrderUP() {
        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickButtonOrderUp();

        OrderPage objOrderPage = new OrderPage(driver);
        objOrderPage.setInputName(name);
        objOrderPage.setInputSurName(surName);
        objOrderPage.setInputAddress("Калининград, Ялтинская улица, 72");
        objOrderPage.clickInputMetroStation();
        objOrderPage.clickDropDownMetroStation();
        objOrderPage.setInputPhoneNumber(phoneNumber);
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


        MainPage objMainPage = new MainPage(driver);
        objMainPage.clickButtonOrderDown();

        OrderPage objOrderPage = new OrderPage(driver);
        objOrderPage.setInputName(name);
        objOrderPage.setInputSurName(surName);
        objOrderPage.setInputAddress("Калининград, Ялтинская улица, 72");
        objOrderPage.clickInputMetroStation();
        objOrderPage.clickDropDownMetroStation();
        objOrderPage.setInputPhoneNumber(phoneNumber);
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

}
