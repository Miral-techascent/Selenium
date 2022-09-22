package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:/Software/Driver/chromedriver.exe");
//        System.setProperty("webdriver.edge.driver","C:/Software/Driver/msedgedriver.exe");
//        System.setProperty("webdriver.gecko.driver","C:/Software/Driver/geckodriver.exe");

        WebDriver driver = new ChromeDriver();
//        WebDriver driver1 = new EdgeDriver();
//        WebDriver driver2 = new FirefoxDriver();

        driver.get("https://demo.nopcommerce.com");
//        driver1.get("https://demo.nopcommerce.com");
//        driver2.get("https://demo.nopcommerce.com");

        System.out.println(driver.getTitle());
//        System.out.println(driver1.getTitle());
//        System.out.println(driver2.getTitle());

        String Title = driver.getTitle();
//        String Title1 = driver1.getTitle();
//        String Title2 = driver2.getTitle();

/*        if (Title.equals("nopCommerce demo store")){
            System.out.println("Title is correct");
        }else {
            System.out.println("Title is incorrect");
        }

        if (Title1.equals("nopCommerce demo store")){
            System.out.println("Title is correct");
        }else {
            System.out.println("Title is incorrect");
        }

        if (Title2.equals("nopCommerce demo store")){
            System.out.println("Title is correct");
        }else {
            System.out.println("Title is incorrect");
        }
        */
        driver.manage().window().maximize();
        driver.findElement(By.className("ico-login")).click();

        driver.findElement(By.id("Email")).sendKeys("test000@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("test@123");
        Thread.sleep(2000);
//        driver.findElement(By.linkText("Log in")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();
    }
}
