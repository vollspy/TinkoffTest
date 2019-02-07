package ru.Tinkoff.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HCSCheckPage extends PageObject{

    String AreaT = "Москве";

    private WebDriver driver;


    @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div[1]/div[6]/div/div[2]/div/div/div/div[2]/div/div/div/span/span/span")
    private WebElement NOW_AREA; //текущий регион




    public HCSCheckPage(WebDriver driver) {
        super(driver);
    }

    public void checkArea() {

        String AreaF = NOW_AREA.getText();
        if ( AreaF == AreaT) {
            driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div[1]/div[5]/div/div/div/div/div/div[2]/div/div[2]/div[1]/div/span/a/span")).click();


        }else {
            NOW_AREA.click();
        }
    }

    public void pickRegionPage() {
        NOW_AREA.click();
    }

}
