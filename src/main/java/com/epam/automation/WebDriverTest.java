package com.epam.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class WebDriverTest implements Cloneable{

     public String str1;
     public String name;

     public static void main(String[] args) throws CloneNotSupportedException {
         WebDriverTest first = new WebDriverTest();
         first.name = "First";
         first.str1 = "Secondly";
         WebDriverTest first1 = (WebDriverTest) first.clone();
         System.out.println(Helper.getDateTimeNow());
         System.out.println(first.equals(first1));

         System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

         WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         
         driver.navigate().to("https://google.com");
         
         WebElement searchField = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
         searchField.click();
         searchField.sendKeys("Yahoo!");
         searchField.sendKeys(Keys.ENTER);

         driver.close();
         driver.quit();
         
         
         

     }

     @Override
     public boolean equals(Object obj) {

         WebDriverTest objA = (WebDriverTest) obj;
         return this.str1 == objA.str1 && this.name == objA.name;
     }

    @Override
    public String toString() {
        return this.name;
    }

    public static class Helper {
         public static String getDateTimeNow(){
             DateTimeFormatter format = DateTimeFormatter.ofPattern("MM/dd/YYYY");
             LocalDateTime dateTime = LocalDateTime.now();

             return format.format(dateTime);
         }
     }

 }


