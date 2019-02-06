package ru.Tinkoff.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class HCSCheckPage extends PageObject{

    String AreaT = "Москве";

    private WebDriver driver;


    @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div[1]/div[6]/div/div[2]/div/div/div/div[2]/div/div/div/span/span/span")
    private WebElement NOW_AREA;


    //@FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div[1]/div[5]/div/div/div/div/div/div[2]/div/div[2]/div[1]/div/span/a/span")
    //private WebElement HCSMoscow;

    public HCSCheckPage(WebDriver driver) {
        super(driver);
    }

    public void checkArea() {
        String AreaF = NOW_AREA.getText();
        System.out.println(AreaF);
        System.out.println(AreaT);
        if ( AreaF == AreaT) {
            driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div[1]/div[5]/div/div/div/div/div/div[2]/div/div[2]/div[1]/div/span/a/span")).click();


        }else {
            this.NOW_AREA.click();
            //driver.findElement(By.linkText("г. Москва")).click();
            //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            //driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div[1]/div[5]/div/div/div/div/div/div[2]/div/div[2]/div[1]/div/span/a/span")).click();
        }
    }

}
