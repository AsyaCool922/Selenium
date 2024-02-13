package DAY2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserManage {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        WebDriver driver1 =new ChromeDriver();
        //
        driver1.get("https://www.bkmkitap.com/");
        Thread.sleep(1000);
        String currentUrl=driver1.getCurrentUrl();
        String title= driver1.getTitle();
        System.out.println("title = " + title);
        System.out.println("currentUrl = " + currentUrl);
        System.out.println("driver = " + driver1);
        System.out.println("============================================");
        System.out.println(currentUrl);
        driver.get("https://www.kahve.com/");
        Thread.sleep(1000);
        currentUrl=driver.getCurrentUrl();
        title=driver.getTitle();
        System.out.println(currentUrl);
        System.out.println("title = " + title);
        System.out.println("currentUrl = " + currentUrl);
        System.out.println("driver = " + driver);
        if (driver.equals(driver1)){
            System.out.println(true);
        }
        Thread.sleep(3000);
        driver.close();
        driver1.close();


    }
}
