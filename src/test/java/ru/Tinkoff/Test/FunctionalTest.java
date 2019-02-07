package ru.Tinkoff.Test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FunctionalTest {
    public static WebDriver driver;
    private static String cfgBeg;
    private static String cfgEnd;


    @BeforeClass
    public static void setUp() {

        cfgBeg = "webdriver.chrome.driver";//override this for your environment
        cfgEnd = "/home/vollspy/Downloads/chromedriver_linux64/chromedriver";//override this for your environment

        System.setProperty(cfgBeg, cfgEnd);
        driver = new ChromeDriver();
        driver.get("https://www.tinkoff.ru/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @After
    public void cleanUp() {
        driver.manage().deleteAllCookies();
    }

    @AfterClass
    public static void tearDown() {
        driver.close();
    }

}
