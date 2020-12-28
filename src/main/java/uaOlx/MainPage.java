package uaOlx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

public class MainPage {

 public WebDriver driver;
 public MainPage (WebDriver driver){
    this.driver=driver;
 }

  By genderselect = By.xpath("//*[@id=\"root\"]/div/div/div[4]/div/div/div[4]/div/div/div[1]/div/form/" +
          "div[2]/div/div/div/div[2]/div[2]");
 By dateselect = By.xpath("//*[@id=\"root\"]/div/div/div[4]/div/div/div[4]/div/div/div[1]/div/form" +
         "/div[1]/div/input");
 By nextButton = By.xpath("//*[@id=\"root\"]/div/div/div[4]/div/div/div[4]/div/div/div[2]/div/div");

 By nextDisclamer = By.xpath("//*[@id=\"root\"]/div/div/div[4]/div/div/div[4]/div/div/div[3]/div[2]/div/div");
 By rarioBut1 = By.xpath("//*[@id=\"root\"]/div/div/div[4]/div/div/div[4]/div/div[2]/div[1]/div[2]/div[1]/div/" +
         "label/span");
 By radoi2 = By.xpath("//*[@id=\"root\"]/div/div/div[4]/div/div/div[4]/div/div[2]/div[3]/div[2]/div[1]/" +
         "div/label/span");
 By NextGerQuest = By.xpath("//*[@id=\"root\"]/div/div/div[4]/div/div/div[4]/div/div[2]/div[7]/" +
         "div/div[2]");
 By MapSelection = By.id("4-9");
 By MapNext = By.xpath("//*[@id=\"root\"]/div/div/div[4]/div/div/div[4]/div/div/div[3]/div/div/div[2]");
 By InguriesNo = By.xpath("//*[@id=\"root\"]/div/div/div[4]/div/div/div[4]/div/div/div[1]/div[2]/div/div/button[2]");
 By SymptomInput = By.xpath("//*[@id=\"root\"]/div/div/div[4]/div/div/div[4]/div/div/div[2]/div/div/div/div[2]/input");
 By NextInputSypmtop = By.xpath("//*[@id=\"root\"]/div/div/div[4]/div/div/div[4]/div/div/div[3]/div/div/div[2]");
 By Radio3 = By.xpath("//*[@id=\"root\"]/div/div/div[4]/div/div/div[4]/div/div[2]/div[3]/div[2]/div[1]/div/label/span");
 By SliderSeverity = By.xpath("//*[@id=\"root\"]/div/div/div[4]/div/div/div[4]/div/div/div[2]/div/div/div/div[1]");
 By Radio4 = By.xpath("//*[@id=\"root\"]/div/div/div[4]/div/div/div[4]/div/div[2]/div[1]/div[2]/div[1]/div/label/span");
 By nextAfterSymptInput = By.xpath("//*[@id=\"root\"]/div/div/div[4]/div/div/div[4]/div/div[2]/div[10]/div/div[2]");
 By sliderNextBut = By.xpath("//*[@id=\"root\"]/div/div/div[4]/div/div/div[4]/div/div/div[3]/div/div/div[2]");
 By LocationPainStomCheckbox = By.xpath("//*[@id=\"root\"]/div/div/div[4]/div/div/div[4]/div/div/div[2]/div/div/div[3]" +
         "/div/label/span");
 By NextButLocationPain = By.xpath("//*[@id=\"root\"]/div/div/div[4]/div/div/div[4]/div/div/div[3]/div/div/div[2]");
 By RadioButPeriodPain = By.xpath("//*[@id=\"root\"]/div/div/div[4]/div/div/div[4]/div/div/div[2]/div/div[3]/div/" +
         "label/span");
 By PainPeriodically =By.xpath("//*[@id=\"root\"]/div/div/div[4]/div/div/div[4]/div/div/div[2]/div[1]");
 By PeriodNextBut = By.xpath("//*[@id=\"root\"]/div/div/div[4]/div/div/div[4]/div/div/div[3]/div/div/div[2]");
 By BlodPress = By.xpath("//*[@id=\"root\"]/div/div/div[4]/div/div/div[4]/div/div/div[2]/div[2]");
 By PainWhenPress = By.xpath("//*[@id=\"root\"]/div/div/div[4]/div/div/div[4]/div/div/div[2]/div[1]");
 By NoseBleeds = By.xpath("//*[@id=\"root\"]/div/div/div[4]/div/div/div[4]/div/div/div[2]/div[1]");
 By PresPainLocation = By.xpath("//*[@id=\"root\"]/div/div/div[4]/div/div/div[4]/div/div/div[2]/div[2]");
 By Dizzy = By.xpath("//*[@id=\"root\"]/div/div/div[4]/div/div/div[4]/div/div/div[2]/div[1]");
 By EndTest = By.xpath("//*[@id=\"root\"]/div/div/div[4]/div/div/div[4]/div/div/div[1]");
 By EndTest2 = By.xpath("//*[@id=\"root\"]/div/div/div[4]/div/div/div[4]/div/div/div[2]");
 By StartOver = By.xpath("//*[@id=\"root\"]/div/div/div[4]/div/div/div[4]/div/div/div[5]/div[1]");
 By SaveToProfile = By.xpath("//*[@id=\"root\"]/div/div/div[4]/div/div/div[4]/div/div/div[5]/div[2]");
 By ImageOlly = By.xpath("//*[@id=\"root\"]/div/div/div[4]/div/div/div[2]/div[2]/img");
 By mainresult = By.xpath("//*[@id=\"root\"]/div/div/div[4]/div/div/div[4]/div/div/div[2]");
 By backbutton = By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div[1]/div[2]");
 By yuoranswers = By.xpath("//*[@id=\"root\"]/div/div/div[4]/div/div/div[4]/div/div/div[4]");
 By backbutton2 = By.xpath("//*[@id=\"root\"]/div/div/div/div[3]/div/div[1]/div[2]");

    public WebElement dropDown (){
      return driver.findElement(genderselect);
    }
    public WebElement date (){
          return  driver.findElement(dateselect);
    }
    public WebElement NextButton (){
          return  driver.findElement(nextButton);
    }
    public WebElement Nextdis (){
          return driver.findElement(nextDisclamer);
    }
    public WebElement Radio1 (){
          return driver.findElement(rarioBut1);
    }
    public WebElement Radio2 (){
          return driver.findElement(radoi2);
    }
    public WebElement nextgerQuest (){
          return driver.findElement(NextGerQuest);
    }
    public WebElement mapSelect (){
          return driver.findElement(MapSelection);
    }
    public WebElement mapNext (){
          return driver.findElement(MapNext);
    }
    public WebElement IngurNo (){
          return driver.findElement(InguriesNo);
    }
    public WebElement symptomInput (){
          return driver.findElement(SymptomInput);
    }
    public WebElement nextInputSymptom (){
          return driver.findElement(NextInputSypmtop);
    }
    public WebElement radio3 (){
          return driver.findElement(Radio3);
    }
    public WebElement radio4 (){
        return driver.findElement(Radio4);
    }
    public WebElement NextButAfterSymptomInput (){
        return driver.findElement(nextAfterSymptInput);
    }
    public WebElement NextButSlider (){
        return driver.findElement(sliderNextBut);
    }
    public WebElement CheckBoxLocationPain (){
        return driver.findElement(LocationPainStomCheckbox);
    }
    public WebElement NextLocPain (){
        return driver.findElement(NextButLocationPain);
    }
    public WebElement RadioPainPeriod (){
        return driver.findElement(RadioButPeriodPain);
    }
    public WebElement PeriodPainBack (){
        return driver.findElement(PainPeriodically);
    }
    public WebElement BlodPressure (){
        return driver.findElement(BlodPress);
    }
    public WebElement PainPressStomac (){
        return driver.findElement(PainWhenPress);
    }
    public WebElement LocationPainPress (){
        return driver.findElement(PresPainLocation);
    }
    public WebElement NextButPeriod (){
        return driver.findElement(PeriodNextBut);
    }
    public WebElement NoseBleed (){
        return driver.findElement(NoseBleeds);
    }
    public WebElement DizzyFeel (){
        return driver.findElement(Dizzy);
    }
    public WebElement End (){
        return driver.findElement(EndTest);
    }
    public WebElement End2(){
        return driver.findElement(EndTest2);
    }
    public WebElement StOverBut () {
        return driver.findElement(StartOver);
    }
    public WebElement SaveProfile (){
        return driver.findElement(SaveToProfile);
    }
    public WebElement ImgOlly (){
        return driver.findElement(ImageOlly);
    }
    public WebElement mainResult (){return driver.findElement(mainresult);}
    public WebElement backButton (){return driver.findElement(backbutton);}
    public WebElement yourAnswers (){return driver.findElement(yuoranswers);}
    public WebElement backBut2 (){return driver.findElement(backbutton2);}

}
