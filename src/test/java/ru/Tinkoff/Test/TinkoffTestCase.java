package ru.Tinkoff.Test;

import org.junit.Test;
import ru.Tinkoff.Pages.*;



public class TinkoffTestCase extends FunctionalTest {



    //TODO рассчитываю тут на порядок, знаю что это неправильно, но пока в разработке!
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
        hcsInMoscowPage.checkUpOne();
        hcsInMoscowPage.checkErrorOne();
        hcsInMoscowPage.checkUpTwo();
        hcsInMoscowPage.checkErrorTwo();
        hcsInMoscowPage.checkUpThree();
        hcsInMoscowPage.checkErrorThree();
        hcsInMoscowPage.checkUpFour();
        hcsInMoscowPage.checkErrorFour();
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

    @Test //далее по сценарию до выбора г. Санкт-Петербург
    public void goTo09() {
        FindDeptPage findDeptPage = new FindDeptPage(driver);
        HomePage homePage = new HomePage(driver);
        PaymentsPage paymentsPage = new PaymentsPage(driver);
        HCSCheckPage hcsCheckPage = new HCSCheckPage(driver);
        RegionPage regionPage = new RegionPage(driver);
        findDeptPage.setAndComp();
        homePage.click();
        paymentsPage.click();
        hcsCheckPage.pickRegionPage();
        regionPage.pickSaint();

    }

    @Test //Поиск ЖКУ-Москва на вкладке ЖКХ в Санкт-Петербурге
    public void goTo10() {
        HCSSaintPetPage hcsSaintPetPage = new HCSSaintPetPage(driver);
        hcsSaintPetPage.Print();
    }




}


