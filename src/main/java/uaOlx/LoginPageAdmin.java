package uaOlx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageAdmin {
    public WebDriver driver;
    public LoginPageAdmin (WebDriver driver){this.driver=driver;
    }

    By loginpanel = By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div/div[2]");
    By login = By.name("email");
    By password = By.name("password");
    By submitbutton = By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div/div[2]/div/div[3]/form" +
            "/button");
    By errormessage = By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div/div[2]/div/div[3]/form/div" +
            "[2]/div/div[2]");

    public WebElement loginPanel (){return driver.findElement(loginpanel);}
    public WebElement Login (){return driver.findElement(login);}
    public WebElement Password (){return driver.findElement(password);}
    public WebElement submitButton (){return driver.findElement(submitbutton);}
    public WebElement errorMessage (){return driver.findElement(errormessage);}
    }
