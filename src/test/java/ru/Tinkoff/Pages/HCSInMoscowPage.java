package ru.Tinkoff.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HCSInMoscowPage extends PageObject{

    String numInIdField = "123333333";
    String numInPeriodField = "222222";
    String numInVolPayField = "1111111111111111111111111111110";
    String numInPayField = "1111111111111111111111111111110";
    String numInPayFieldTwo = "5";
    String numInPayFieldThree = "150000";
    String numInPayFieldFour = "100";
    String numInVolPayFieldFour = "500";

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

    public void checkUpOne() {
        driver.navigate().refresh();
        submitButton.click();
    }

    public void checkErrorOne(){
        String StErIdFieldOne = ErIdField.getText();
        System.out.println(StErIdFieldOne);
        String StErPeriodFieldOne = ErPeriodField.getText();
        System.out.println(StErPeriodFieldOne);
        String StErPayFieldOne = ErPayField.getText();
        System.out.println(StErPayFieldOne);
    }

    public void checkUpTwo() {
        driver.navigate().refresh();
        payField.sendKeys(numInPayFieldTwo);
        submitButton.click();
    }

    public void checkErrorTwo() {
        String StErPayFieldTwo = ErPayField.getText();
        System.out.println(StErPayFieldTwo);
    }

    public void checkUpThree() {
        driver.navigate().refresh();
        payField.sendKeys(numInPayFieldThree);
        submitButton.click();
    }

    public void checkErrorThree() {
        String StErPayFieldOne = ErPayField.getText();
        System.out.println(StErPayFieldOne);
    }

    public void checkUpFour() {
        driver.navigate().refresh();
        payField.sendKeys(numInPayFieldFour);
        volPayField.sendKeys(numInVolPayFieldFour);
        submitButton.click();
    }

    public void checkErrorFour() {
        String StErVolPayField = ErVolPayField.getText();
        System.out.println(StErVolPayField);
    }


}
