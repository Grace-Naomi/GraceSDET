package Selenium;

import com.sun.xml.internal.stream.events.AttributeImpl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import sun.plugin.dom.core.Element;

import java.util.concurrent.TimeUnit;

public class AssertionMethodsYouTube {
    public static void openYouTube(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\grace\\IdeaProjects\\javaproject\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");
        driver.manage().window().maximize();

        System.out.println(driver.getCurrentUrl());
        String title = driver.getTitle();
        System.out.println("title is " + title);
    }
    public static void main(String[] arg) throws InterruptedException {
      /*  System.setProperty("webdriver.chrome.driver", "C:\\Users\\grace\\IdeaProjects\\javaproject\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");
        driver.manage().window().maximize();

        System.out.println(driver.getCurrentUrl());


        String title = driver.getTitle();
        System.out.println("title is " + title);

       */
        //openYouTube();
  /*
        ************************************************************************************
        public static void allTab(){

            WebElement allTabelement = driver.findElement(By.xpath("//yt-formatted-string[text()='All']"));
            System.out.println(allTabelement.getAttribute("title"));

        }

        public void liveTab(){
            driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
            WebElement liveTabelement = driver.findElement(By.xpath("//yt-formatted-string[text()='Live']"));

            System.out.println(liveTabelement.getAttribute("title"));
        }
        WebDriver driver =new ChromeDriver();
        WebElement allTabelement = driver.findElement(By.xpath("//yt-formatted-string[text()='All']"));
        System.out.println(allTabelement.getAttribute("title"));
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        WebElement liveTabelement = driver.findElement(By.xpath("//yt-formatted-string[text()='Live']"));



      //  System.out.println(liveTabelement.getAttribute("title"));

        // driver.findElement(By.xpath("//yt-formatted-string[text()='Live']")).click();




        Assert.assertNotEquals(allTabelement, liveTabelement);
        System.out.println("Its a Live Tab");
        **********************************************************************************************
   */
    }
}

