package ru.Tinkoff.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    ///Находим ссылку из второго задания, вроде все что нам нужно на первой странице
    @FindBy(linkText = "Платежи")
    private WebElement paymentLnk;

    public void click() {
        this.paymentLnk.click();
    }



}
