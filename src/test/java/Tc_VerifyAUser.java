public class Tc_VerifyAUser extends AddingPersonalDetails {
    public static void main(String[] args) throws InterruptedException {
        openBrowser();
        maximizeBrowser();
        clickSignInButton();
        enterEmailToCreateNewAccount();
        clickCreateAccountButton();
        addPersonDetail();

    }
}
