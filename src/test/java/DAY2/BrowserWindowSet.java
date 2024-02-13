package DAY2;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowSet {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");

        driver.manage().window().fullscreen();
        Thread.sleep(1000);
        System.out.println("driver.manage().window().getPosition() = " + driver.manage().window().getPosition());
        Point d1=driver.manage().window().getPosition();
        Point d2=   new Point(10,10);
        if (d1.x== d2.x){
            System.out.println("Pozisyonlar aynı");
        }else{
            System.out.println(d1.x- d2.x);
        }
        Thread.sleep(1000);
        System.out.println("driver.manage().window().getSize() = " + driver.manage().window().getSize());
        Dimension s1=driver.manage().window().getSize();
        Dimension s2=new Dimension(1500,1400);
        Thread.sleep(1000);
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.manage().window().minimize();
        Thread.sleep(1000);
        driver.manage().window().setSize(s2);
        if (s2.height== s1.getHeight()){
            System.out.println("Aynı dimension");
        }else {
            System.out.println("farklı");
        }
        driver.quit();
    }
}
