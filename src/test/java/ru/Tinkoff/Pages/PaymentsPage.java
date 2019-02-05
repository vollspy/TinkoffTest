package ru.Tinkoff.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentsPage {

    @FindBy(linkText = "ЖКХ")
    private WebElement HCSLink;

    public void click() {
        this.HCSLink.click();
    }

}
