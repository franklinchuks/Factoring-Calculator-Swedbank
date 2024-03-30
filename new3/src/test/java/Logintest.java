import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Logintest {

    @Test
    void loginTest() {
        //chromedriver
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        //web driver
        WebDriver driver = new ChromeDriver();
        //maximize window
        driver.manage().window().maximize();
        //get website
        driver.get("https://www.swedbank.lt/business/finance/trade/factoring?language=ENG");

        
        WebElement inputField;
        WebElement button;

        //locate invoice amount field
        inputField = driver.findElement(By.name("calc_d5"));
        inputField.clear();
        inputField.sendKeys("700");

        //locate advance rate field
        inputField = driver.findElement(By.name("calc_d6"));
        //inputField.clear();
        inputField.sendKeys("85");

        //locate interest rate field
        inputField = driver.findElement(By.name("calc_d7"));
        inputField.clear();
        inputField.sendKeys("4");

        //locate payment term field
        inputField = driver.findElement(By.name("calc_d8"));
        //inputField.clear();
        inputField.sendKeys("60");

        //locate commission fee field
        inputField = driver.findElement(By.name("calc_d9"));
        inputField.clear();
        inputField.sendKeys("0.02");

        //locate calculate button
        button = driver.findElement(By.id("calculate-factoring"));
        //button.click();

        driver.quit();
    }
}
