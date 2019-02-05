package ru.Tinkoff.Test;

import org.junit.Test;
import ru.Tinkoff.Pages.HomePage;

public class HomePageTest extends FunctionalTest {

    @Test
    public void goTo() {

        driver.get("https://www.tinkoff.ru/");
        HomePage homePage = new HomePage(driver);
        homePage.click();





    }

}

//good
