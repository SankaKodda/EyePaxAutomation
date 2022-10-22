import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class AddingPersonalDetails extends VerifyUserSteps {
    public static void addPersonDetail() throws InterruptedException {
        selectTitle();
        enterCustomerFirstName();
        enterCustomerSecondName();
        enterCustomerEmail();
        enterCustomerPassword();
        selectDateOfBirthDay();
        selectDateOfBirthMonth();
        selectDateOfBirthYear();
        selectSignupForNewsletters();
        selectReceiveSpecialOffers();
        enterFirstName();
        enterSecondName();
        enterCustomerCompany();
        enterCustomerAddressLine1();
        enterCustomerAddressLine2();
        enterCustomerCity();
        selectCustomerState();
        enterCustomerPostalCode();
        selectCustomerCountry();
        enterCustomerAdditionalInformation();
        enterCustomerHomePhoneNumber();
        enterCustomerMobilePhoneNumber();
        enterCustomerFutureAliasAddress();
        clickRegisterButton();
        signOut();
    }

    public static void selectTitle() throws InterruptedException {
        try {
            //Click Title if Mr
            driver.findElement(By.id("id_gender1")).click();
            //Click Title if Mrs
//            driver.findElement(By.id("id_gender2")).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Thread.sleep(5000);
    }

    public static void enterCustomerFirstName() throws InterruptedException {
        try {
            //Enter Customer FirstName
            driver.findElement(By.id("customer_firstname")).clear();
            driver.findElement(By.id("customer_firstname")).sendKeys("Sanka");
        } catch (Exception e) {
            e.printStackTrace();
        }
        Thread.sleep(5000);
    }

    public static void enterCustomerSecondName() throws InterruptedException {
        try {
            //Enter Customer Last Name
            driver.findElement(By.id("customer_lastname")).clear();
            driver.findElement(By.id("customer_lastname")).sendKeys("Kodippily");
        } catch (Exception e) {
            e.printStackTrace();
        }
        Thread.sleep(5000);
    }

    public static void enterCustomerEmail() throws InterruptedException {
        try {
            //Enter Customer Email
            driver.findElement(By.id("email")).clear();
            driver.findElement(By.id("email")).sendKeys("rusanka123@gmail.com");
        } catch (Exception e) {
            e.printStackTrace();
        }
        Thread.sleep(5000);
    }

    public static void enterCustomerPassword() throws InterruptedException {
        try {
            //Enter Customer Password
            driver.findElement(By.id("passwd")).clear();
            driver.findElement(By.id("passwd")).sendKeys("sankakodi");
        } catch (Exception e) {
            e.printStackTrace();
        }
        Thread.sleep(5000);
    }

    public static void selectDateOfBirthDay() throws InterruptedException {
        try {
            //Enter Customer Birth Date
            Select dropdown = new Select(driver.findElement(By.id("days")));
            dropdown.selectByValue("4");
        } catch (Exception e) {
            e.printStackTrace();
        }
        Thread.sleep(5000);
    }

    public static void selectDateOfBirthMonth() throws InterruptedException {
        try {
            //Enter Customer Birth Month
            Select dropdown = new Select(driver.findElement(By.id("months")));
            dropdown.selectByValue("11");
        } catch (Exception e) {
            e.printStackTrace();
        }
        Thread.sleep(5000);
    }

    public static void selectDateOfBirthYear() throws InterruptedException {
        try {
            //Enter Customer Birth Year
            Select dropdown = new Select(driver.findElement(By.id("years")));
            dropdown.selectByValue("1996");
        } catch (Exception e) {
            e.printStackTrace();
        }
        Thread.sleep(5000);
    }

    public static void selectSignupForNewsletters() throws InterruptedException {
        try {
            //customerSelectNewsLetter

            driver.findElement(By.id("newsletter")).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Thread.sleep(5000);
    }

    public static void selectReceiveSpecialOffers() throws InterruptedException {
        try {
            //customerSelect Receive Special offers

            driver.findElement(By.id("optin")).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Thread.sleep(5000);
    }

    public static void enterFirstName() throws InterruptedException {
        try {
            //Enter Customer FirstName
            driver.findElement(By.id("firstname")).clear();
            driver.findElement(By.id("firstname")).sendKeys("Sanka");
        } catch (Exception e) {
            e.printStackTrace();
        }
        Thread.sleep(5000);
    }

    public static void enterSecondName() throws InterruptedException {
        try {
            //Enter Customer LastName
            driver.findElement(By.id("lastname")).clear();
            driver.findElement(By.id("lastname")).sendKeys("Kodippily");
        } catch (Exception e) {
            e.printStackTrace();
        }
        Thread.sleep(5000);
    }

    public static void enterCustomerCompany() throws InterruptedException {
        try {
            //Enter Customer's Company
            driver.findElement(By.id("company")).clear();
            driver.findElement(By.id("company")).sendKeys("MAS");
        } catch (Exception e) {
            e.printStackTrace();
        }
        Thread.sleep(5000);
    }

    public static void enterCustomerAddressLine1() throws InterruptedException {
        try {
            //Enter Customer's Address Line 1
            driver.findElement(By.id("address1")).clear();
            driver.findElement(By.id("address1")).sendKeys("26/14A, Yahampath Mw");
        } catch (Exception e) {
            e.printStackTrace();
        }
        Thread.sleep(5000);
    }

    public static void enterCustomerAddressLine2() throws InterruptedException {
        try {
            //Enter Customer's Address Line 2
            driver.findElement(By.id("address2")).clear();
            driver.findElement(By.id("address2")).sendKeys("Yahampath Garden");
        } catch (Exception e) {
            e.printStackTrace();
        }
        Thread.sleep(5000);
    }

    public static void enterCustomerCity() throws InterruptedException {
        try {
            //Enter Customer's City
            driver.findElement(By.id("city")).clear();
            driver.findElement(By.id("city")).sendKeys("Maharagama");
        } catch (Exception e) {
            e.printStackTrace();
        }
        Thread.sleep(5000);
    }

    public static void selectCustomerState() throws InterruptedException {
        try {
            //Select Customer's State
            Select dropdown = new Select(driver.findElement(By.id("id_state")));
            dropdown.selectByVisibleText("New York");
        } catch (Exception e) {
            e.printStackTrace();
        }
        Thread.sleep(5000);
    }

    public static void enterCustomerPostalCode() throws InterruptedException {
        try {
            //Enter Customer's ZipCode
            driver.findElement(By.id("postcode")).clear();
            driver.findElement(By.id("postcode")).sendKeys("10240");
        } catch (Exception e) {
            e.printStackTrace();
        }
        Thread.sleep(5000);
    }

    public static void selectCustomerCountry() throws InterruptedException {
        try {
            //Select Customer's Country
            Select dropdown = new Select(driver.findElement(By.id("id_country")));
            dropdown.selectByVisibleText("United States");
        } catch (Exception e) {
            e.printStackTrace();
        }
        Thread.sleep(5000);
    }

    public static void enterCustomerAdditionalInformation() throws InterruptedException {
        try {
            //Enter Customer's Additional info
            driver.findElement(By.id("other")).clear();
            driver.findElement(By.id("other")).sendKeys("Sports");
        } catch (Exception e) {
            e.printStackTrace();
        }
        Thread.sleep(5000);
    }

    public static void enterCustomerHomePhoneNumber() throws InterruptedException {
        try {
            //Enter Customer's Phone
            driver.findElement(By.id("phone")).clear();
            driver.findElement(By.id("phone")).sendKeys("0717571196");
        } catch (Exception e) {
            e.printStackTrace();
        }
        Thread.sleep(5000);
    }

    public static void enterCustomerMobilePhoneNumber() throws InterruptedException {
        try {
            //Enter Customer's Mobile
            driver.findElement(By.id("phone_mobile")).clear();
            driver.findElement(By.id("phone_mobile")).sendKeys("0717571196");
        } catch (Exception e) {
            e.printStackTrace();
        }
        Thread.sleep(5000);
    }

    public static void enterCustomerFutureAliasAddress() throws InterruptedException {
        try {
            //Enter Customer's Alias address
            driver.findElement(By.id("alias")).clear();
            driver.findElement(By.id("alias")).sendKeys("Nawaloka");
        } catch (Exception e) {
            e.printStackTrace();
        }
        Thread.sleep(5000);
    }

    public static void clickRegisterButton() throws InterruptedException {
        try {
            //Click Register account button
            driver.findElement(By.id("submitAccount")).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Thread.sleep(5000);
    }



}
