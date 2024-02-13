package DAY2;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3 {
    public static void main(String[] args) {
        // Go to www.yahoo.com
// Maximize Window
// Go to www.amazon.com
// Maximize Window
// ***Navigate Back***
// ***Navigate Forward***
// ***Refresh The Page***

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().window().getSize();//widht ve height
        driver.manage().window().getPosition();
        Point p1=new Point(10,10);
        driver.manage().window().setPosition(p1);

        Dimension d1=new Dimension(150,200);

        driver.manage().window().setSize(d1);



    }
}
