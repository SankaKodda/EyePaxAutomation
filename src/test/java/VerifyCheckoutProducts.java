public class VerifyCheckoutProducts extends CheckoutProductSteps {
    public static void main(String[] args) throws InterruptedException {
        checkoutProcess();
    }
    public static void checkoutProcess() throws InterruptedException {
        openWebLink();
        clickSignInButton();
        login();
        clickShoppingInWomenCategory();
        clickAddToCart();
        clickProceedToCart();
        clickProceedToCheckoutToSummary();
        clickProceedToCheckoutToSignIn();
        clickProceedToCheckoutToShipping();
        clickTermsAgreement();
        clickProceedToCheckoutToPayments();
    }
}
