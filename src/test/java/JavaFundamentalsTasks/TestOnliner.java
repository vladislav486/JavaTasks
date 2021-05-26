package JavaFundamentalsTasks;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestOnliner {

    @Test
    public void onlinerVerify (){
        System.setProperty("webdriver.chrome.driver","C:\\Projects\\maven-demo\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://onliner.by");
        driver.manage().window().maximize();

        WebElement loginButton = driver.findElement(By.xpath("//div[@class='auth-bar__item auth-bar__item--text']"));
        loginButton.click();

        WebElement loginField = driver.findElement(By.xpath("//input[@placeholder='Ник или e-mail']"));
        WebElement passwordField = driver.findElement(By.xpath("//input[@placeholder='Пароль']"));
        WebElement submitButton = driver.findElement(By.xpath("//div/button[@type='submit']"));

        loginField.sendKeys("mtw.atn@mail.ru");
        passwordField.sendKeys("wanrltw");
        submitButton.click();
    }
}
