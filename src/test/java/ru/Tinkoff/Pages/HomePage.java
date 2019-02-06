package ru.Tinkoff.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class HomePage extends PageObject {


    ///Находим ссылку из второго задания, вроде все что нам нужно на первой странице
    @FindBy(linkText = "Платежи")
    private WebElement paymentLink;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void click() {
        this.paymentLink.click();
    }

}
