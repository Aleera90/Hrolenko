package tests;


import Pages.DetailPage;
import Pages.SearchPage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class googleTests {
    private static  SearchPage searchPage;

    private  static WebDriver driver;
    private static DetailPage detailPage;

    @BeforeAll
    public static void init() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        searchPage = new SearchPage(driver);
        detailPage = new DetailPage(driver);
    }

    @Test
    public void test1() {

        driver.get("http://google.com");
        searchPage.search("selenium");
        //assertEquals(10,searchPage.results.size());

    }
    @Test
    public void test2(){
        driver.get("http://google.com");
        searchPage.search("selenium");

       // assertEquals("Selenium",detailPage.getname());
       // assertEquals("3.141.59 (14 ноября 2018 года)",detailPage.getLastVersion());
       // assertEquals("Apache License 2.0",detailPage.getLicense());

    }

    @AfterAll
    public static void teardown(){
        driver.quit();

    }
}
