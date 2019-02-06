package ru.Tinkoff.Test;

import org.junit.Test;
import ru.Tinkoff.Pages.HCSCheckPage;


public class HCSCheckTest extends FunctionalTest {
    ////Переход на выбор региона
    @Test
    public void check() {
        driver.get("https://www.tinkoff.ru/payments/categories/kommunalnie-platezhi/");
        HCSCheckPage hcsCheck = new HCSCheckPage(driver);
        hcsCheck.checkArea();

    }

}


//good
