package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Register {

    public static void SelectValueFromDropdown(WebElement element, String value){
        Select select = new Select(element);
        select.selectByValue(value);

    }
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");

        driver.findElement(By.className("ico-register")).click();
        driver.findElement(By.id("gender-male")).click();
//        driver.findElement(By.id("gender-female")).click();

        driver.findElement(By.id("FirstName")).sendKeys("Miral");
        driver.findElement(By.id("LastName")).sendKeys("Patel");

        WebElement Day = driver.findElement(By.name("DateOfBirthDay"));
        WebElement Month = driver.findElement(By.name("DateOfBirthMonth"));
        WebElement Year = driver.findElement(By.name("DateOfBirthYear"));

        SelectValueFromDropdown(Day,"10");
        SelectValueFromDropdown(Month,"2");
        SelectValueFromDropdown(Year,"1993");

        driver.findElement(By.id("Email")).sendKeys("patelmv.16993@gmail.com");
        driver.findElement(By.id("Company")).sendKeys("Unify Testing");

        driver.findElement(By.xpath("//*[@id=\"Newsletter\"]")).click();
//        driver.findElement(By.linkText("Newsletter")).click();

//        Thread.sleep(5000);

        driver.findElement(By.id("Password")).sendKeys("Admin@123");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("Admin@123");

        driver.findElement(By.id("register-button")).click();

    }
}
