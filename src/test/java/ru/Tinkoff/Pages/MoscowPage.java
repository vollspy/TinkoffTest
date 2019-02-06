package ru.Tinkoff.Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MoscowPage extends PageObject {

    //@FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div[1]/div[6]/div/div[2]/div/div/div/section/ul/li[1]/span[1]/a/span/div/div")
    //private WebElement HCSMoscow;

    WebElement HCSMoscow = (new WebDriverWait(driver,10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div[1]/div[6]/div/div[2]/div/div/div/section/ul/li[1]/span[1]/a/span/div/div")));


    public MoscowPage(WebDriver driver) {
        super(driver);

    }

    public void pickHCS() {
        this.HCSMoscow.click();
        String HCSMoscowSave = HCSMoscow.getText();
        System.out.println(HCSMoscowSave);
    }
}
