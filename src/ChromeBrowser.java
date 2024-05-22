import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/**
 1. Setup Chrome browser.
 2. Open URL.
 3. Print the title of the page.
 4. Print the current url.
 5. Print the page source.
 6. Click on ‘Forgot your password?’ link.
 7. Print the current url.
 8. Navigate back to the login page.
 9. Refresh the page.
 10. Enter the email to email field.
 11. Enter the password to password field.
 12. Click on Login Button.
 13. Close the browser.
 */
public class ChromeBrowser {
    static String baseUrl = "https://opensource-demo.orangehrmlive.com/";
    static WebDriver driver = new ChromeDriver();
    static String browser = "Chrome";

    public static void main(String[] args) {
        driver.get(baseUrl);

        //We give Implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        //Print the title of the page.
        System.out.println("The title of the page : " + driver.getTitle());

        // Print the current url.
        System.out.println("The current Url : " + driver.getCurrentUrl());

        //Print the page source.
        System.out.println("The Source : " + driver.getPageSource());

       //Click on ‘Forgot your password?’ link.
        driver.findElement(By.className("orangehrm-login-forgot")).click();

        //Print the current url.
        System.out.println("The current Url : " + driver.getCurrentUrl());

       // Navigate back to the login page.
        driver.navigate().back();

        //Refresh the page.
        driver.navigate().refresh();

        //Enter the email to email field.
        driver.findElement(By.name("username")).sendKeys("Admin");

        //Enter the password to password field.
        driver.findElement(By.name("password")).sendKeys("admin123");

        //Click on Login Button.
        driver.findElement(By.tagName("button")).click();

        //Close the browser.
        driver.close();

    }
}

