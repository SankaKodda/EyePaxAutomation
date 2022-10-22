import com.relevantcodes.extentreports.LogStatus;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyUserSteps  {
    public static WebDriver driver;
    public static void openBrowser() throws InterruptedException {
        // Open Browser
        /*System.setProperty("webdriver.chrome.driver","D:\\T2FAbattoir\\driver\\chromedriver.exe");*/
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        try {
            // Open URL
            driver.get("http://automationpractice.com/index.php");
        }catch (Exception e){
            e.printStackTrace();
        };


    }
    public static void maximizeBrowser(){
        try{
            // Maximise the Browser
            driver.manage().window().maximize();
            Thread.sleep(5000);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void clickSignInButton() throws InterruptedException {
        try {
            //Click Create an account button
            driver.findElement(By.xpath("//div[@class='header_user_info']")).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Thread.sleep(5000);
    }
    public static void enterEmailToCreateNewAccount() throws InterruptedException {
        try {
            //Enter Valid mail
            driver.findElement(By.id("email_create")).clear();
            driver.findElement(By.id("email_create")).sendKeys("rusanka123@gmail.com");
        } catch (Exception e) {
            e.printStackTrace();
        }
        Thread.sleep(5000);
    }
    public static void clickCreateAccountButton() throws InterruptedException {
        try {
            //Click Create an account button
            driver.findElement(By.id("SubmitCreate")).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Thread.sleep(5000);
    }


    public static void closeBrowser(){

    }
}
