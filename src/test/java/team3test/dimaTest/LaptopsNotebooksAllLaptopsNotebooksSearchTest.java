package team3test.dimaTest;

import com.opencart.navigation.Navigation;
import com.opencart.steps.CategoriesHeaderPageBL;
import com.opencart.steps.MainPageBL;
import org.testng.annotations.Test;
import team3test.BaseTest;

import static com.opencart.enums.URLs.BASE_URL;

public class LaptopsNotebooksAllLaptopsNotebooksSearchTest extends BaseTest {


    @Test
    public void laptopsNotebooksCategoryAllLaptopsNotebooksOpen(){
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        CategoriesHeaderPageBL categoriesHeaderPageBL =mainPageBL.getCategoriesHeaderPageBL()
                .clickOnLaptopsNotebooksButton()
                .clickOnAllLaptopsNotebooksButton()
                .checkCategory();
        categoriesHeaderPageBL.verifyAllLaptopsNotebooksCategoryOpen();

    }
}
