package ru.Tinkoff.Test;

import org.junit.Test;
import ru.Tinkoff.Pages.RegionPage;

public class RegionPageTest extends FunctionalTest{
    ////в выборе региона выбираем Москву
    @Test
    public void pick() {
        driver.get("https://www.tinkoff.ru/payments/categories/kommunalnie-platezhi/?popup=REGIONS_CHANGE-786197.1549410904949");
        RegionPage regionPage = new RegionPage(driver);
        regionPage.pickMoskow();
    }
}
