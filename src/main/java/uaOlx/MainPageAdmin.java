package uaOlx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MainPageAdmin {
    public WebDriver driver;
    public MainPageAdmin (WebDriver driver){this.driver=driver;
    }

    By search = By.name("Search");
    By userslist = By.xpath("//*[@id=\"root\"]/div/div[3]/table");
    By userstab = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div/div[1]");
    By diagnosestab = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div/div[2]");
    By downloadbutton = By.cssSelector("#root > div > div.listViewHeader-0-2-3 > " +
            "div.tableToolsContainer-0-2-7 > " +
            "div.root-0-2-61.downloadButton-0-2-8 > abbr > svg");
    By paginationblock = By.xpath("//*[@id=\"root\"]/div/div[5]/div");
    By listperpage = By.xpath("//*[@id=\"root\"]/div/div[4]/div/div/div/div[2]/div[2]");
    By ollylogobutton = By.xpath("//*[@id=\"root\"]/div/div[1]/div");
    By logoutbutton = By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]");
    By paginationright = By.cssSelector("#root > div > div.pagingContainer-0-2-11 > div >" +
            " div.Component-item-0-2-102." +
            "Component-arrow-0-2-106.Component-rightArrow-0-2-108");
    By username = By.xpath("//*[@id=\"root\"]/div/div[3]/table/tbody/tr[1]/td[3]");
    By paginationcounter = By.className("Component-item-0-2-102");

    public WebElement Search (){return driver.findElement(search);}
    public WebElement userList (){return driver.findElement(userslist);}
    public WebElement usersTab (){return driver.findElement(userstab);}
    public WebElement diagnosesTab (){return driver.findElement(diagnosestab);}
    public WebElement downloadButton (){return driver.findElement(downloadbutton);}
    public WebElement paginationBlock (){return driver.findElement(paginationblock);}
    public WebElement listperPage (){return driver.findElement(listperpage);}
    public WebElement ollylogoutButton (){return driver.findElement(ollylogobutton);}
    public WebElement logoutButton (){return driver.findElement(logoutbutton);}
    public WebElement paginationRight (){return driver.findElement(paginationright);}
    public WebElement userName (){return driver.findElement(username);}
    public List<WebElement>  paginationCounter () {return driver.findElements(paginationcounter);}
}
