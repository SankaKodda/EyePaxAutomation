public class VerifyCheckoutProducts extends CheckoutProductSteps {
    public static void main(String[] args) throws InterruptedException {
        openWebLink();
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
