package herokuapp_tests;
import org.testng.annotations.Test;

public class HomeButtonTests extends BaseTest {
    String baseURL = "https://katalon-demo-cura.herokuapp.com/";

    @Test
    public void HomeButtonFunctionalityBeingLogged() throws InterruptedException {
        driver.get(baseURL);
        loginPage.loginWithValidCredentials();
        Thread.sleep(2000);
        homeButtonPage.homePage();
        Thread.sleep(2000);
    }

    @Test
    public void HomeButtonFunctionalityWithoutBeingLogged() throws InterruptedException {
        driver.get(baseURL);
        loginPage.loginWithValidCredentials();
        Thread.sleep(2000);
        homeButtonPage.logOutButton();
        Thread.sleep(2000);
    }
}
