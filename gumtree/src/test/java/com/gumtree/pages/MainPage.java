package com.gumtree.pages;

import com.gumtree.main.Main;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author waleskaa
 */
public class MainPage extends Main {

    public MainPage(WebDriver driver) {
        super();
        this.driver = driver;
    }

    public void login(String login, String password) {
        System.out.println("tutaj");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='withoutGreetings']/li/span"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='KeepLoggedIn']"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='GreetingName']"))).sendKeys(login);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='Password']"))).sendKeys(password);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='Submit']"))).click();
        System.out.println("tutaj2");
    }
}
