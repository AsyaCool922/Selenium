package DAY2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();

        //Navigate Command
        //navigate.to
         /*
Invoke Chrome Browser
Navigate to URL: https://www.w3schools.com/
Navigate to URL: https://stackoverflow.com/
Come back to the w3schools using the back command.
Again go back to the stackoverflow website using forward command
Refresh the Browser using refresh command.
Close the Browser.
 */

        driver.navigate().to("https://www.w3schools.com/"); // drivet.get(url)
        Thread.sleep(2000);
        driver.navigate().to(" https://stackoverflow.com/");
        Thread.sleep(2000);
        driver.navigate().back();// bir önceki sayafaya geri gelir
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.quit();

    }
}
