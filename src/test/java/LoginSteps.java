import org.openqa.selenium.By;
public class LoginSteps extends Tc_VerifyAUser{
    public static void enterValidEmail() throws InterruptedException {
        // Enter Valid Username
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("rusanka123@gmail.com");

        Thread.sleep(5000);
    }

    public static void enterValidPassword() throws InterruptedException {
        //Enter Valid Password
        driver.findElement(By.id("passwd")).clear();
        driver.findElement(By.id("passwd")).sendKeys("sankakodi");
        System.out.println("Enter Valid Password");
        Thread.sleep(5000);

    }

    public static void clickLogin() throws InterruptedException {
        //Click on Login BUtton
        driver.findElement(By.id("SubmitLogin")).click();
        System.out.println();
        Thread.sleep(5000);
    }
}
