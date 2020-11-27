package SuccessfulTests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.Map;

public class Twitter {

    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void TwitterLogoClick() throws InterruptedException {
        driver.get("https://scodein.tech/");
        driver.manage().window().maximize();
        driver.findElement(By.className("twitter")).click();
        String newUrl = driver.getWindowHandle();       //getting url of new page after click
        driver.switchTo().window(newUrl);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div/div[2]/div/div[2]/div/div/div/div[3]/section/a/div/span/span")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("name")).click();
        driver.findElement(By.name("name")).sendKeys("Daniela");
        driver.findElement(By.name("phone_number")).click();
        driver.findElement(By.name("phone_number")).sendKeys("123456789");
    }
}

