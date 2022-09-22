package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.findElement(By.className("ico-login")).click();

        driver.findElement(By.id("Email")).sendKeys("patelmv.16993@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("Admin@123");

//        driver.findElement(By.className("button-1 login-button")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();

    }
}
