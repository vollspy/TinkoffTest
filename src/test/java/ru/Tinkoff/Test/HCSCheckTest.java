package ru.Tinkoff.Test;

import org.junit.Test;
import ru.Tinkoff.Pages.HCSCheck;


public class HCSCheckTest extends FunctionalTest {

    @Test
    public void check() {

        HCSCheck hcsCheck = new HCSCheck(driver);
        hcsCheck.checkArea();

    }

}


//good
