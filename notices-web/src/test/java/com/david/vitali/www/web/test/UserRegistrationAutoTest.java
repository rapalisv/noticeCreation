package com.david.vitali.www.web.test;

import static org.junit.Assert.fail;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserRegistrationAutoTest{
  private WebDriver driver;
  private String baseUrl;

  @Before
  public void setUp() throws Exception {
    System.setProperty("webdriver.chrome.driver", "../notices-web/src/main/resources/libs/chromedriver.exe");
    driver = new ChromeDriver();
    baseUrl = "http://localhost:8080/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  @Ignore
  public void testUntitled() throws Exception {
    driver.get(baseUrl);
    driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
    driver.findElement(By.cssSelector("input.form-control")).clear();
    driver.findElement(By.cssSelector("input.form-control")).sendKeys("user");
    driver.findElement(By.xpath("//input[@type='email']")).clear();
    driver.findElement(By.xpath("//input[@type='email']")).sendKeys("user@mail.com");
    driver.findElement(By.xpath("//input[@type='password']")).clear();
    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("usermail");
    driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
    
    // Find Alert Message
    String alertMsg = driver.findElement(By.xpath("//div/div[2]/div[1]/h3")).getText();

    if(alertMsg.contains("Network Error")){
      fail("Network Error");
    }
    
    
  }

  @After
  public void tearDown() throws Exception {
//    driver.quit();
  }
}