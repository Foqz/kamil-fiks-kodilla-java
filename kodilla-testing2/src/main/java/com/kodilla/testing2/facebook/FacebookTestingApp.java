package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_SELECT_BDAY = "//div[contains(@class, \"_5k_5\")]/span/span/select[1]";
    public static final String XPATH_SELECT_BMONTH = "//div[contains(@class, \"_5k_5\")]/span/span/select[2]";
    public static final String XPATH_SELECT_BYEAR = "//div[contains(@class, \"_5k_5\")]/span/span/select[3]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        WebElement selectCombo1 = driver.findElement(By.xpath(XPATH_SELECT_BDAY));
        Select selectBday = new Select(selectCombo1);
        selectBday.selectByIndex(20);

        WebElement selectCombo2 = driver.findElement(By.xpath(XPATH_SELECT_BMONTH));
        Select selectBmonth = new Select(selectCombo2);
        selectBmonth.selectByIndex(5);

        WebElement selectCombo3 = driver.findElement(By.xpath(XPATH_SELECT_BYEAR));
        Select selectByear = new Select(selectCombo3);
        selectByear.selectByValue("1995");

    }
}
