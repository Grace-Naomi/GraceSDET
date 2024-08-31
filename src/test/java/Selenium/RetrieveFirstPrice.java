package Selenium;

import javafx.scene.input.InputMethodTextRun;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RetrieveFirstPrice {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\grace\\IdeaProjects\\javaproject\\chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
      // driver.get("https://www.amazon.com/");  //page is asking for captcha

        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        System.out.println(driver.getCurrentUrl());
        WebElement searchElement = driver.findElement(By.xpath("//input[@autocomplete='off']"));
        searchElement.sendKeys("iphone 15");



        driver.findElement(By.xpath("//button[@type='submit']")).click();

        WebElement price= driver.findElement(By.cssSelector("div[data-id='MOBGTAGPAQNVFZZY'] div[class='_30jeq3 _1_WHN1']"));



        System.out.println(driver.getTitle());

        System.out.println(price.getText());
        driver.close();


    }
}
