package ru.Tinkoff.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MoscowPage extends PageObject {

    @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div[1]/div[6]/div/div[2]/div/div/div/section/ul/li[1]/span[2]/a/span/div")
    private WebElement HCSMoscow;

    public MoscowPage(WebDriver driver) {
        super(driver);
    }

    public void pickHCS() {
        this.HCSMoscow.click();
    }
}
