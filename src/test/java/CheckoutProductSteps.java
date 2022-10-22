import org.openqa.selenium.By;

public class CheckoutProductSteps extends VerifyLogin {

    public static void clickShoppingInWomenCategory() throws InterruptedException {
        try {
            //Click Women button
            driver.findElement(By.xpath("(//a[@class='sf-with-ul'])[1]")).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Thread.sleep(5000);
    }

    public static void clickAddToCart() throws InterruptedException {
        try {
            //Click Add to Cart a Blouse
            driver.findElement(By.xpath("(//a[@class='button ajax_add_to_cart_button btn btn-default'])[2]")).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Thread.sleep(5000);
    }

    public static void clickProceedToCart() throws InterruptedException {
        try {
            //Click Proceed to Cart
            driver.findElement(By.xpath("//a[@class='btn btn-default button button-medium']")).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Thread.sleep(5000);
    }
    //a[@class='button btn btn-default standard-checkout button-medium']
    public static void clickProceedToCheckoutToSummary() throws InterruptedException {
        try {
            //Click Proceed to Checkout
            driver.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']")).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Thread.sleep(5000);
    }
    //a[@class='button btn btn-default standard-checkout button-medium']
    public static void clickProceedToCheckoutToSignIn() throws InterruptedException {
        try {
            //Click Proceed to Checkout
            driver.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']")).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Thread.sleep(5000);
    }
    public static void clickProceedToCheckoutToShipping() throws InterruptedException {
        try {
            //Click Proceed to Checkout
            driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']")).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Thread.sleep(5000);
    }
    public static void clickTermsAgreement() throws InterruptedException {
        try {
            //Click Terms agreement
            driver.findElement(By.id("cgv")).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Thread.sleep(5000);
    }

    public static void clickProceedToCheckoutToPayments() throws InterruptedException {
        try {
            //Click Proceed to Checkout
            driver.findElement(By.xpath("//button[@class='button btn btn-default standard-checkout button-medium']")).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Thread.sleep(5000);
    }
}
