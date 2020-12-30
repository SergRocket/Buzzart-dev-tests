package uaOlx;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class AdminSmokeTest {
    WebDriver driver;
    @BeforeTest
    public void SettingTest (){
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver.get("https://admin-dev.stryproject-b.ch/login");
    }

    @Test
    public void smoketest () throws InterruptedException {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        LoginPageAdmin LPA = new LoginPageAdmin(driver);
        LPA.Login().sendKeys("liubov@stryber.com");
        LPA.Password().sendKeys("123asdQQ**");
        LPA.submitButton().click();
        Thread.sleep(2000);
        Assert.assertTrue(driver.getCurrentUrl().contains("list/users"));
        Thread.sleep(2000);
        MainPageAdmin MPA = new MainPageAdmin(driver);
        driver.navigate().refresh();
        Assert.assertTrue(MPA.diagnosesTab().isDisplayed() && MPA.downloadButton().isDisplayed()  &&
                MPA.listperPage().isDisplayed() && MPA.ollylogoutButton().isDisplayed() &&
                MPA.paginationBlock().isDisplayed() && MPA.Search().isDisplayed() && MPA.userList().isDisplayed() &&
                MPA.usersTab().isDisplayed());
        WebDriverWait wait = new WebDriverWait(driver, 9);
        wait.until(ExpectedConditions.elementToBeClickable(MPA.paginationRight()));
        for (int i = 0; i < 3; i++){
            MPA.paginationRight().click();
        }
        Thread.sleep(2500);
        Assert.assertTrue(MPA.diagnosesTab().isDisplayed() && MPA.downloadButton().isDisplayed()  &&
                MPA.listperPage().isDisplayed() && MPA.ollylogoutButton().isDisplayed() &&
                MPA.paginationBlock().isDisplayed() && MPA.Search().isDisplayed() && MPA.userList().isDisplayed() &&
                MPA.usersTab().isDisplayed());
        MPA.diagnosesTab().click();
        Thread.sleep(1500);
        MPA.usersTab().click();
        Thread.sleep(2700);
        if(MPA.paginationCounter().size() >= 7){
            System.out.print("The pagination quantity is valid");
        }else{
            System.out.print("The pagination quantity is small");
        }
        MPA.Search().sendKeys("joy");
        Thread.sleep(5000);
        Assert.assertTrue(MPA.userName().getText().contains("joy"));
        MPA.ollylogoutButton().click();
        MPA.logoutButton().click();
    }

    @AfterTest
    public void ShuttingDown (){
        driver.manage().deleteAllCookies();
        if(driver!=null){
            driver.close();
            driver.quit();
            System.out.print("The test is ended");
        }
    }
}
