package ru.Tinkoff.Test;

import org.junit.Test;
import ru.Tinkoff.Pages.*;


public class TinkoffTestCase extends FunctionalTest {

    @Test //переход на вкладку платежи
    public void goTo1() {
        //driver.get("https://www.tinkoff.ru/");
        HomePage homePage = new HomePage(driver);
        homePage.click();
        System.out.println("1");

    }

    @Test //переход на вкладку ЖКХ
    public void goTo2() {

        PaymentsPage paymentsPage = new PaymentsPage(driver);
        paymentsPage.click();
        System.out.println("2");
    }


    @Test //проверка, переход на выбор региона
    public void goTo3() {
        HCSCheckPage hcsCheckPage = new HCSCheckPage(driver);
        hcsCheckPage.checkArea();
        System.out.println("3");

    }

    @Test //в выборе региона выбираем Москву
    public void goTo4() {
        RegionPage regionPage = new RegionPage(driver);
        regionPage.pickMoskow();

    }

    @Test //выбор ЖКУ-Москва
    public void goTo5() {
        System.out.println("5");
        MoscowPage moscowPage = new MoscowPage(driver);
        moscowPage.pickHCS();
    }

    @Test //выбор оплатить ЖКУ в Москве
    public void goTo6() {
        HCSMoscowPayPage hcsMoscowPayPage = new HCSMoscowPayPage(driver);
        hcsMoscowPayPage.pickMSK();
    }



}

//good
