package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;


public class First {
@Test
    public void poc() throws InterruptedException {

        // declaration and instantiation of objects/variables
        System.setProperty("webdriver.chrome.driver", "D:\\webdrivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
    TakesScreenshot scrShot =((TakesScreenshot)driver);
        // open Jenkins
        driver.navigate().to("http://localhost:8080/");
        //max the screen
        driver.manage().window().maximize();
        //enter the cred

        driver.findElement(By.name("j_username")).sendKeys("sunilPOCaccount");
//        driver.manage().window().fullscreen();
        Thread.sleep(500);
        driver.findElement(By.name("j_password")).sendKeys("Ash@1234");
        Thread.sleep(500);
        driver.findElement(By.name("Submit")).click();


        driver.findElement(By.xpath("//*[@id=\"tasks\"]/div[4]/span/a")).click();

        driver.findElement(By.xpath("//*[@id=\"main-panel\"]/section[2]/div/div[6]/a")).click();

        driver.findElement(By.xpath("//*[@id=\"main-panel\"]/form/div[1]/section/div[2]/div[2]/div/div[1]/div[1]/div/label")).click();
    Thread.sleep(1000);
//    File scource = scrShot.getScreenshotAs(OutputType.FILE);
//
//
//    //Copy the file to a location and use try catch block to handle exception
//    try {
//        FileUtils.copyFile(scource, new File("C:\\projectScreenshots\\homePageScreenshot.png"));
//    } catch (IOException e) {
//        System.out.println(e.getMessage());
//    }



        driver.quit();



    }

}  