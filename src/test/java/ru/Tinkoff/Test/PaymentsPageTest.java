package ru.Tinkoff.Test;

import org.junit.Test;
import ru.Tinkoff.Pages.PaymentsPage;

public class PaymentsPageTest extends FunctionalTest{

    @Test
    public void goTo() {

        driver.get("https://www.tinkoff.ru/payments/");
        PaymentsPage paymentsPage = new PaymentsPage(driver);
        paymentsPage.click();

    }

}

//good
