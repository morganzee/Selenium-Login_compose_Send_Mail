import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ARM_Assessment {

    public static void main(String[] args)throws Exception
    {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\morgan.nwaiku\\Downloads\\app\\web Drivers\\chrome driver\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        //Access url
        driver.get("https://login.yahoo.com/?done=https%3A%2F%2Fwww.yahoo.com%2F&add=1");
        System.out.println("Successfully access url");

        //maximize windows
        driver.manage().window().maximize();

        //input email address
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //wait time
        driver.findElement(By.xpath("//*[@id=\"login-username\"]")).sendKeys("mnwaiku@yahoo.com");
        System.out.println("Successfully inputted email");

        //click next button to go to next page
        driver.findElement(By.xpath("//*[@id=\"login-signin\"]")).click();
        System.out.println("Next was clicked Successfully");

        //input password
        driver.findElement(By.name("password")).sendKeys("decembermg");
        System.out.println("Successfully inputted password");

        //click next button to sign in to home page
        driver.findElement(By.xpath("//*[@id=\"login-signin\"]")).click();
        System.out.println("Next to Sign in clicked successfully");

        //click on mail on the home page
        driver.findElement(By.xpath("//*[@id=\"ybarMailLink\"]/span[1]")).click();
        System.out.println("Mail on home page clicked successfully");

        //click on compose button
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //wait time
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div[1]/nav/div/div[1]")).click();
        System.out.println("Compose button was selected");

        //input To mail address
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //wait time
        driver.findElement(By.xpath("//*[@id=\"message-to-field\"]")).sendKeys("mnwaiku@yahoo.com");
        System.out.println("To information was entered successfully");

        //input email Subject
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //wait time
        driver.findElement(By.xpath("//*[@id=\"mail-app-component\"]/div/div/div/div[1]/div[3]/div/div/input")).sendKeys("hi");
        System.out.println("Subject information was entered successfully");

        //input email body
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"editor-container\"]/div[1]")).sendKeys("Automation test");
        System.out.println("Body information was entered successfully");

        //click email send button
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"mail-app-component\"]/div/div/div/div[2]/div[2]/div/button")).click();
        System.out.println("Send Button was clicked successfully and message sent");

        //Message can be confirmed to be viewed in the "To" mailbox as seen from the playback.


    }

}
