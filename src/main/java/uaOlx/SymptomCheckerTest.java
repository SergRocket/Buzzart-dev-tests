package uaOlx;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import uaOlx.MainPage;
import java.util.concurrent.TimeUnit;

public class SymptomCheckerTest {
    WebDriver driver;
    @BeforeTest
    public void settingTest (){
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver.get("https://website-dev.stryproject-b.ch/");
    }

    @Test
    public void SymptCheck () throws InterruptedException {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        MainPage MP = new MainPage(driver);
        MP.dropDown().click();
        Assert.assertTrue(MP.ImgOlly().isDisplayed());
        MP.dropDown().sendKeys(Keys.ARROW_DOWN);
        MP.dropDown().sendKeys(Keys.ENTER);
        MP.date().sendKeys("11111999");
        Assert.assertTrue(driver.getCurrentUrl().contains("persoenliche-informationen"));
        MP.NextButton().click();
        WebDriverWait LinkWait = new WebDriverWait(driver, 6);
        LinkWait.until(ExpectedConditions.urlContains("disclaimer"));
        MP.Nextdis().click();
        MP.Radio1().click();
        MP.Radio2().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("generelle-fragen"));
        MP.nextgerQuest().click();
        Thread.sleep(500);
        MP.mapSelect().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("regionen"));
        MP.mapNext().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("physische-verletzung"));
        MP.IngurNo().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("symptomeingabe"));
        MP.nextInputSymptom().click();
        Thread.sleep(500);
        MP.radio3().click();
        MP.radio4().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("kritische-symptome"));
        MP.NextButAfterSymptomInput().click();
        Thread.sleep(500);
        Assert.assertTrue(driver.getCurrentUrl().contains("weitere-fragen"));
        MP.NextButSlider().click();
        MP.CheckBoxLocationPain().click();
        MP.NextLocPain().click();
        Thread.sleep(500);
        MP.RadioPainPeriod().click();
        MP.NextButPeriod().click();
        MP.PeriodPainBack().click();
        MP.BlodPressure().click();
        MP.PainPressStomac().click();
        MP.LocationPainPress().click();
        MP.PainPressStomac().click();
        MP.NoseBleed().click();
        MP.DizzyFeel().click();
        Thread.sleep(4000);
        Assert.assertTrue(MP.End().isDisplayed() && MP.End2().isDisplayed() && MP.StOverBut().isDisplayed()
                && MP.SaveProfile().isDisplayed());
        Assert.assertTrue(driver.getCurrentUrl().contains("resultate"));
        MP.mainResult().click();
        Thread.sleep(1000);
        Assert.assertTrue(driver.getCurrentUrl().contains("/erklaerung"));
        MP.backButton().click();
        Thread.sleep(1000);
        Assert.assertTrue(driver.getCurrentUrl().contains("resultate"));
        MP.yourAnswers().click();
        Thread.sleep(1000);
        Assert.assertTrue(driver.getCurrentUrl().contains("antworten"));
        MP.backBut2().click();
        Thread.sleep(1000);
        Assert.assertTrue(driver.getCurrentUrl().contains("resultate"));
        MP.StOverBut().click();
        Thread.sleep(1000);
        Assert.assertTrue(driver.getCurrentUrl().contains("disclaimer"));

    }

    @AfterTest
    public void Shuttingdown (){
        driver.manage().deleteAllCookies();
        if(driver!=null){
            driver.close();
            driver.quit();
        }
    }

}


