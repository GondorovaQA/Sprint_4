import PageObject.MainPage;
import org.junit.Test;
import org.openqa.selenium.By;



public class MainPageTest extends Annotations {

    @Test
    public void checkTextDropDownPrice() {
        MainPage objMainPage = new MainPage(driver);
        driver.findElement(By.xpath("//*[@id='rcc-confirm-button']")).click();

        objMainPage.clickButtonDropDownPrice();
        objMainPage.checkTextDropDownPrice();

        objMainPage.clickButtonDropDownSomeScooter();
        objMainPage.checkTextDropDownSomeScooter();

        objMainPage.clickButtonDropDownRentalTime();
        objMainPage.checkTextDropDownRentalTime();

        objMainPage.clickButtonDropDownOrderToDay();
        objMainPage.checkTextDropDownOrderToDay();

        objMainPage.clickButtonDropDownExtendOrder();
        objMainPage.checkTextDropDownExtendOrder();

        objMainPage.clickButtonDropDownCharge();
        objMainPage.checkTextDropDownCharge();

        objMainPage.clickButtonDropDownCancelOrder();
        objMainPage.checkTextDropDownCancelOrder();

        objMainPage.clickButtonDropDownMkad();
        objMainPage.checkTextDropDownMkad();
    }
}

