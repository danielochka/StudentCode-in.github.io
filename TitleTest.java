package SuccessfulTests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.Map;

public class TitleTest {

    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;

    @Before
    public void setUp(){
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }

    @After
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void Title(){
        driver.get("https://scodein.tech/");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        Assert.assertTrue("title should start differently", driver.getTitle().startsWith("Student Code-In"));
        System.out.println("Webpage title is: " +title);
    }
}
