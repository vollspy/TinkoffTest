package ru.Tinkoff.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentsPage extends PageObject{

    @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div[1]/div[6]/div/div[2]/div[1]/div[2]/div/div[2]/div/div[2]/div/a/span/div/div[2]/div/div/div")
    private WebElement HCSLink;

    public PaymentsPage(WebDriver driver) {
        super(driver);
    }

    public void click() {
        this.HCSLink.click();
    }

}
