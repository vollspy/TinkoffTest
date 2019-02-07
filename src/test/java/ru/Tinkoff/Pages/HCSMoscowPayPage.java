package ru.Tinkoff.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HCSMoscowPayPage extends PageObject{

    @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div[1]/div[6]/div/div[2]/div[1]/div/div/div/div[2]/div/div")
    private WebElement HCSHeadText;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div[1]/div[6]/div/div[2]/div[1]/div/div/div/div[3]/div/ul/li[2]/div/a/span")
    private WebElement PayHCSMSK;



    public HCSMoscowPayPage(WebDriver driver) {
        super(driver);
    }

    public void pickMSK() {
        this.PayHCSMSK.click();
    }


    public void saveHeadText() {
        FindDeptPage findDeptPage = new FindDeptPage(driver);
        findDeptPage.setHCSHeadText(this.HCSHeadText.getText());
        System.out.println(HCSHeadText + " метод seveHeadText");
    }

}
