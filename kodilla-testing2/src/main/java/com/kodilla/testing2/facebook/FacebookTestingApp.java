package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FacebookTestingApp {
    public static final String XPATH_COOKIES = "/html/body/div[3]/div[2]/div/div/div/div/div[3]/div[2]/div/div[2]/div[1]/div/div[1]/div/span/span"; // [1]
    public static final String XPATH_CREATE = "//a[contains(@class, '_42ft') and contains(@class, '_4jy0')]";
    public static final String XPATH_DAY = "//div[contains(@class, \"_5k_5\")]/span/span/select[1]";
    public static final String XPATH_MONTH = "//div[contains(@class, \"_5k_5\")]/span/span/select[2]";
    public static final String XPATH_YEAR = "//div[contains(@class, \"_5k_5\")]/span/span/select[3]";
    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com");

        while (!driver.findElement(By.xpath(XPATH_COOKIES)).isDisplayed());
        driver.findElement(By.xpath(XPATH_COOKIES)).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement createAccountButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(XPATH_CREATE)));
        createAccountButton.click();
        driver.findElement(By.xpath(XPATH_COOKIES)).click();
        WebElement dayElement = driver.findElement(By.xpath(XPATH_DAY));
        dayElement.sendKeys("14");
        WebElement monthElement = driver.findElement(By.xpath(XPATH_MONTH));
        Select monthSelect = new Select(monthElement);
        monthSelect.selectByValue("5");//May
        WebElement yearElement = driver.findElement(By.xpath(XPATH_YEAR));
        yearElement.sendKeys("1990");
    }
}
