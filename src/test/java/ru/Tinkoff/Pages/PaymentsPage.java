package ru.Tinkoff.Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class PaymentsPage extends PageObject{

    @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div[1]/div[6]/div/div[2]/div[1]/div[2]/div/div[2]/div/div[2]/div/a/span/div/div[2]/div/div/div")
    private WebElement HCSLink;

    @FindBy(xpath = "//*[@id=\"search-and-pay-container\"]/div[2]/div[2]/div/form/div[3]/div/div/div/div/label/div/input")
    private WebElement inputField;

    @FindBy(xpath = "//*[@id=\"search-and-pay-container\"]/div[2]/div[2]/div/form/div[3]/div/div/div/div[2]/div/div[1]/div/div/div[1]/div/div[1]/div[1]")
    private WebElement foundField;

    //WebElement nowTitle = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/head/title")));

    //public static String nowTitle;

    public static String HCSText;
    public static String HCSHeadText;

    public PaymentsPage(WebDriver driver) {
        super(driver);
    }

    public void click() {
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        this.HCSLink.click();
    }

    public void setHCSText(String HCS){ //принимает ЖКУ-Москва
        this.HCSText=HCS; //HCSText - ЖКУ-Москва
    }

    //public void setHCSHeadText(String HeadText) {
    //    this.HCSHeadText = HeadText;
    //}

    public void setText() {
        System.out.println(HCSText);
        this.inputField.sendKeys(HCSText);
    }

    public void checkField() {
        Assert.assertTrue(HCSText.equals(foundField.getAttribute("innerText")));
    }

    public void clickField() {

        this.foundField.click();

    }

    //public void setAndCompWithNowTitle() {
//
    //    Assert.assertTrue(HCSHeadText.equals(HCSTitle));
//
    //}



}
