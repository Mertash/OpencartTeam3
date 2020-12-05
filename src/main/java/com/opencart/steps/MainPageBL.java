package com.opencart.steps;



import com.opencart.pages.HeaderPage;
import com.opencart.steps.ShoppingCart.ShoppingCartPageBL;


public class MainPageBL {


    public CategoriesHeaderPageBL getCategoriesHeaderPageBL(){
            return new CategoriesHeaderPageBL();

    }
    public HeaderPageBL getHeaderPageBL() {
        return new HeaderPageBL();
    }

}
