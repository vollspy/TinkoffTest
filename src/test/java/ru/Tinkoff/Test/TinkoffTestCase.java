package ru.Tinkoff.Test;

import org.junit.Assert;
import org.junit.Test;
import ru.Tinkoff.Pages.*;

import java.util.concurrent.TimeUnit;

import static ru.Tinkoff.Pages.HCSMoscowPayPage.HCSHeadTextNow;


public class TinkoffTestCase extends FunctionalTest {

    //MoscowPage moscowPage = new MoscowPage(driver);


    @Test //переход на вкладку платежи
    public void goTo01() {
        //https://www.tinkoff.ru/
        HomePage homePage = new HomePage(driver);
        homePage.click();

    }

    @Test //переход на вкладку ЖКХ
    public void goTo02() {
        //https://www.tinkoff.ru/payments/
        PaymentsPage paymentsPage = new PaymentsPage(driver);
        paymentsPage.click();

    }


    @Test //проверка, переход на выбор региона
    public void goTo03() {
        //https://www.tinkoff.ru/payments/categories/kommunalnie-platezhi/
        HCSCheckPage hcsCheckPage = new HCSCheckPage(driver);
        hcsCheckPage.checkArea();
        System.out.println("3");

    }

    @Test //в выборе региона выбираем Москву
    public void goTo04() {
        //https://www.tinkoff.ru/payments/categories/kommunalnie-platezhi/?popup=REGIONS_CHANGE-458718.1549480251261
        RegionPage regionPage = new RegionPage(driver);
        regionPage.pickMoskow();

    }

    @Test //выбор ЖКУ-Москва
    public void goTo05() {
        //driver.get("https://www.tinkoff.ru/payments/categories/kommunalnie-platezhi/");
        MoscowPage moscowPage = new MoscowPage(driver);
        moscowPage.saveAttribute();
        moscowPage.pickHCS();




    }

    @Test //выбор оплатить ЖКУ в Москве
    public void goTo06() {
        //https://www.tinkoff.ru/zhku-moskva/
        HCSMoscowPayPage hcsMoscowPayPage = new HCSMoscowPayPage(driver);
        hcsMoscowPayPage.saveHeadText();
        hcsMoscowPayPage.pickMSK();

    }

    @Test //проверка на невалидные значения
    public void goTo07() {
        //driver.get("https://www.tinkoff.ru/zhku-moskva/oplata/?tab=pay");
        HCSInMoscowPage hcsInMoscowPage = new HCSInMoscowPage(driver);
        HomePage homePage = new HomePage(driver);
        hcsInMoscowPage.checkUp();
        hcsInMoscowPage.checkError();
        homePage.click();



    }

    @Test //ввод в строку ЖКУ-Москва
    public void goTo08() {
        //driver.get("https://www.tinkoff.ru/payments/");
        PaymentsPage paymentsPage = new PaymentsPage(driver);
        paymentsPage.setText();
        paymentsPage.checkField();
        paymentsPage.clickField();


    }



    //@Test
    //public void  goTo09() throws InterruptedException {
    //    //driver.get("https://www.tinkoff.ru/zhku-moskva/");
    //    PaymentsPage paymentsPage = new PaymentsPage(driver);
    //    paymentsPage.clickField();
    //    driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
    //}

    //@Test
    //public void goTo11() {
    //    PaymentsPage paymentsPage = new PaymentsPage(driver);
    //    paymentsPage.setAndCompWithNowTitle();
    //}




}

//good
