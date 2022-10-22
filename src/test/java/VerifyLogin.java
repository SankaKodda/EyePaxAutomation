public class VerifyLogin extends LoginSteps {
    public static void main(String[] args) throws InterruptedException {
        openBrowser();
        maximizeBrowser();
        login();
    }
    public static void login() throws InterruptedException {
        enterValidEmail();
        enterValidPassword();
        clickLogin();
    }
}
