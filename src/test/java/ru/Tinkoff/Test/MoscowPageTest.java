package ru.Tinkoff.Test;

import org.junit.Test;
import ru.Tinkoff.Pages.MoscowPage;

public class MoscowPageTest extends FunctionalTest {
    ////выбираем ЖКУ-Москва
    @Test
    public void pickHCS() {
        driver.get("https://www.tinkoff.ru/payments/categories/kommunalnie-platezhi/");
        MoscowPage moscowPage = new MoscowPage(driver);
        moscowPage.pickHCS();
    }

}
