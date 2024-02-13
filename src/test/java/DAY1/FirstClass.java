package DAY1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstClass {
    public static void main(String[] args) {
//        System.setProperty("webdriver.chrome.driver",".idea/resources/driver/chromedriver.exe");
       System.setProperty("webdriver.chrome.driver",".idea/resources/driver/chromedriver.exe");
//        WebDriver d=new ChromeDriver();
//        d.get("https://www.amazon.com.tr/");
        WebDriver f=new FirefoxDriver();
        f.get("https://www.amazon.com.tr/");
    }

}
