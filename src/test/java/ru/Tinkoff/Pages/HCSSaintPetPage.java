package ru.Tinkoff.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HCSSaintPetPage extends PageObject{

    public static String HCSText;

    public void setHCSTextTo(String HCS){ //принимает ЖКУ-Москва
        this.HCSText=HCS; //HCSText - ЖКУ-Москва
    }

    public HCSSaintPetPage(WebDriver driver) {
        super(driver);
    }

    public void Print() {
        boolean isPresent = driver.findElements(By.linkText(HCSText)).size()>0;
        System.out.println(isPresent);
    }
}
