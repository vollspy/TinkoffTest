package ru.Tinkoff.Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static ru.Tinkoff.Pages.PaymentsPage.HCSHeadText;


public class FindDeptPage extends PageObject{

    @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div[1]/div[6]/div/div[2]/div[1]/div/div/div/div[2]/div/div")
    private WebElement DeptHeadText; //на данной странице заголовок
    private static String HCSHeadTextNow;

    public FindDeptPage(WebDriver driver) {
        super(driver);
    }

    public void setHCSHeadText(String HCSHeadText) {
        this.HCSHeadTextNow = HCSHeadText;
    }

    public void setAndComp() {

        String StDeptHeadText = DeptHeadText.getText();
        //System.out.println(StDeptHeadText);
        Assert.assertTrue(StDeptHeadText.equals(HCSHeadTextNow));
        //if (StDeptHeadText == HCSHeadTextNow) {
        //    driver.findElement(By.linkText("Платежи")).click();
        //} else {
        //    System.out.println(HCSHeadTextNow + " hi");
        //    System.out.println(StDeptHeadText + " end");
        //}

    }
}
