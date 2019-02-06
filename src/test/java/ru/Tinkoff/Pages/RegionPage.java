package ru.Tinkoff.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegionPage extends PageObject {

    @FindBy(linkText = "г. Москва")
    private WebElement TRUE_REGION;

    public void pickMoskow() {
        this.TRUE_REGION.click();
        //driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div[1]/div[6]/div/div[2]/div/div/div/section/ul/li[1]/span[2]/a/span/div")).click();
    }


    public RegionPage(WebDriver driver) {
        super(driver);
    }


}
