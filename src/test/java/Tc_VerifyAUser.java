public class Tc_VerifyAUser extends AddingPersonalDetails {
    public static void main(String[] args) throws InterruptedException {
        openWebLink();
        registerNewUser();
    }
    public static void openWebLink() throws InterruptedException {
        openBrowser();
        maximizeBrowser();
    }
    public static void registerNewUser() throws InterruptedException {
        clickSignInButton();
        enterEmailToCreateNewAccount();
        clickCreateAccountButton();
        addPersonDetail();
    }
}
