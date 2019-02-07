package ru.Tinkoff.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HCSInMoscowPage extends PageObject{

    String numInIdField = "123333333";
    String numInPeriodField = "222222";
    String numInVolPayField = "1111111111111111111111111111110";
    String numInPayField = "1111111111111111111111111111110";

    @FindBy(xpath = "//*[@id=\"payerCode\"]")
    private WebElement idField;

    @FindBy(xpath = "//*[@id=\"period\"]")
    private WebElement periodField;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div[1]/div[6]/div/div[2]/div[1]/div/div/div/div[4]/div[1]/form/div[3]/div/div/label/div/input")
    private WebElement volPayField;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div[1]/div[6]/div/div[2]/div[1]/div/div/div/div[4]/div[1]/form/div[4]/div/div/div/div/div/div/div/div/label/div/input")
    private WebElement payField;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div[1]/div[6]/div/div[2]/div[1]/div/div/div/div[4]/div[1]/form/div[6]/div/div[1]/div/div/button")
    private WebElement submitButton;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div[1]/div[6]/div/div[2]/div[1]/div/div/div/div[4]/div[1]/form/div[1]/div/div[2]")
    private WebElement ErIdField;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div[1]/div[6]/div/div[2]/div[1]/div/div/div/div[4]/div[1]/form/div[2]/div/div[2]")
    private WebElement ErPeriodField;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div[1]/div[6]/div/div[2]/div[1]/div/div/div/div[4]/div[1]/form/div[3]/div/div[2]")
    private WebElement ErVolPayField;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div[1]/div[6]/div/div[2]/div[1]/div/div/div/div[4]/div[1]/form/div[4]/div/div/div/div/div/div/div/div[2]")
    private WebElement ErPayField;


    public HCSInMoscowPage(WebDriver driver) {
        super(driver);
    }

    public void checkUp() {

        volPayField.sendKeys(numInVolPayField);
        payField.sendKeys(numInPayField);
        idField.sendKeys(numInIdField);
        periodField.sendKeys(numInPeriodField);
        submitButton.click();

    }

    public void checkError() {
        String StErIdField = ErIdField.getText();
        System.out.println(StErIdField);
        String StErPeriodField = ErPeriodField.getText();
        System.out.println(StErPeriodField);
        String StErVolPayField = ErVolPayField.getText();
        System.out.println(StErVolPayField);
        String StErPayField = ErPayField.getText();
        System.out.println(StErPayField);

    }



}
