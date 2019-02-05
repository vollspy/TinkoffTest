package ru.Tinkoff.Test;

import org.junit.Test;
import ru.Tinkoff.Pages.PaymentsPage;

public class PaymentsPageTest extends FunctionalTest{

    @Test
    public void goTo() {
        PaymentsPage paymentsPage = new PaymentsPage(driver);
        paymentsPage.click();
    }

}

//good
