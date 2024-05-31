package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
        WebDriver webDriver;

        @BeforeMethod
        public void initDriver()
        {
            webDriver = new ChromeDriver();
        }

        @AfterMethod
        public void quitDriver()
        {
            webDriver.quit();
        }

        @Test
    public void findElement()
        {
            webDriver.get("https://ti.ua/ru/");
            WebElement flag = webDriver.findElement(By.className("logo-mobile"));
flag.isDisplayed();
        }

}

