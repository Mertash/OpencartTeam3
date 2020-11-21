import com.opencart.navigation.Navigation;
import com.opencart.pages.BasePage;
import com.opencart.steps.MainPageBL;
import com.opencart.steps.login.LoginPageBL;
import com.opencart.steps.register.RegisterPageBL;
import com.opencart.steps.search.SearchPageBL;
import org.testng.annotations.Test;

import static com.opencart.enums.URLs.BASE_URL;

public class UserRegisterTest extends BaseTest {


    @Test
    public void registerUserWithValidParameters() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        RegisterPageBL registerPageBL = mainPageBL.getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnRegisterButton()
                .registerNewPerson();
        registerPageBL.verifyUserRegistration();
    }


    @Test
    public void loginUserWithValidParameters() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        BasePage basePage = new BasePage();
        MainPageBL mainPageBL = new MainPageBL();
        LoginPageBL loginPageBL = mainPageBL.getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnLoginButton()
                .loginPerson();
        loginPageBL.verifyUserLogin();
    }



    @Test
    public void SearchUserWithValidParameters() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        SearchPageBL searchPageBL = mainPageBL.getHeaderPageBL()
                .clickOnSearchButton()
                .SearchProduct();
//       searchPageBL.verifyUserSearch();
    }

}
