package com.example.demo.cases;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CheckChild {



    @Test
    public void testChild() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);

            driver.manage().window().maximize();

            driver.get("http://167.114.201.175:5000/");

            WebElement username = driver.findElement(By.name("userName"));
            username.sendKeys("Admin");
            WebElement pass = driver.findElement(By.name("password"));
            pass.sendKeys("Admin@Navi");
            WebElement btn = driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/div/form/button"));
            btn.click();
            Thread.sleep(5000);

            WebElement childFilter = driver.findElement(By.xpath("/html/body/app-root/app-clients/header/div[2]/div[1]/ul/li[1]"));
            childFilter.click();

        }



    }