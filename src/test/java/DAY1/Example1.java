package DAY1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;


public class Example1 {
    public static void main(String[] args) throws InterruptedException {

        //Browse Commands:
//                    driver.get
//                    driver.close
//                    driver.quit
//                    driver.gettitle
//                    driver.currentUrl
//                    driver.getPageSource
//





        //ChromeDriver d=new ChromeDriver();
        //Webdriver bir Interface obje üretilemez
        WebDriver driver=new ChromeDriver();
        WebDriver driver2=new ChromeDriver();
        // Yeni bir driver objesi oluşturuldu
        driver.get("https://www.amazon.com.tr/");
        driver2.get("https://www.amazon.com.tr/");
//        Thread.sleep(3000);
//        driver.quit();// driver ın değeri null dönüşür.// tüm browser kapanır
//        driver.get("https://www.google.com/");
//        Thread.sleep(3000);
//        driver.close();//Sadece bulunduğu driver ı kapatır


        String title=driver.getTitle();//Sayanın title bilgisi Strin olarak döndürür
        if(title.contains("amazon")){
            System.out.println("Pass");
        }else{
            System.out.println(driver.getTitle());
            System.err.println("Fail");
        }
        System.out.println("========================");
        Thread.sleep(2000);

        String url= driver.getCurrentUrl();// Sayanın mevcut url String olarak geri döndürür

        if(url.contains("https")){
            System.out.println("Pass");
        }else{
            System.err.println("Fail");
        }
        System.out.println("========================");

        String pagesource=driver.getPageSource();// sayfanın html kodlarını bizimle paylaşır

        if(pagesource.contains("button")){
            System.out.println("Pass");
        }else{
            System.err.println("Fail");
        }
        System.out.println("========================");

    }
}
