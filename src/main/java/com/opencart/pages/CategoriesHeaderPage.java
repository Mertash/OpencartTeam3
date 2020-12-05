package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CategoriesHeaderPage extends BasePage {
    //////////////////////////////
    /* Desktops category button*/
    @FindBy(xpath = ".//*[@class='nav navbar-nav']//a[contains(text(),'Desktops') and @class='dropdown-toggle']")//Head Desktops button
    private WebElement desktopsButton;

    @FindBy(xpath = ".//*[@class='list-unstyled']//a[contains(text(),'PC (0)')]")//PC button
    private WebElement pcCategoryButton;

    @FindBy(xpath = ".//*[@class='list-unstyled']//a[contains(text(),'Mac (1)')]")//Mac button
    private WebElement macCategoryButton;

    @FindBy(xpath = ".//*[@class='dropdown-menu']//a[contains(text(),'Show') and contains(@href,'path=20')]")//All Desktops button
    private WebElement allDesktopsCategoryButton;

    //////////////////////////////
    /*Laptops & Notebooks category button */

    @FindBy(xpath = ".//*[@class='nav navbar-nav']//a[contains(text(),'Laptops & Notebooks') and @class='dropdown-toggle']")//Head Laptops & Notebooks button
    private WebElement laptopsNotebooksButton;

    @FindBy(xpath = ".//*[@class='list-unstyled']//a[contains(text(),'Macs (0)')]")//Macs button
    private WebElement MacsCategoryButton;

    @FindBy(xpath = ".//*[@class='list-unstyled']//a[contains(text(),'Windows (0)')]")//Windows button
    private WebElement windowsCategoryButton;

    @FindBy(xpath = ".//*[@class='dropdown-menu']//a[contains(text(),'Show') and contains(@href,'path=18')]")//All Laptops & Notebooks button
    private WebElement allLaptopsNotebooksCategoryButton;

    //////////////////////////////
    /*Components category button */
    @FindBy(xpath = ".//*[@class='nav navbar-nav']//a[contains(text(),'Components')and @class='dropdown-toggle']")//Head Components button
    private WebElement componentsButton;

    @FindBy(xpath = ".//*[@class='list-unstyled']//a[contains(text(),'Mice and Trackballs (0)')]")//Mice and Trackballs button
    private WebElement miceTrackballsCategoryButton;

    @FindBy(xpath = ".//*[@class='list-unstyled']//a[contains(text(),'Monitors (2)')]")//Monitors button
    private WebElement monitorsCategoryButton;

    @FindBy(xpath = ".//*[@class='list-unstyled']//a[contains(text(),'Printers (0)')]")//Printers button
    private WebElement printersCategoryButton;

    @FindBy(xpath = ".//*[@class='list-unstyled']//a[contains(text(),'Scanners (0)')]")//Scanners button
    private WebElement scannersCategoryButton;

    @FindBy(xpath = ".//*[@class='list-unstyled']//a[contains(text(),'Web Cameras (0)')]")//Web Cameras button
    private WebElement webCamerasCategoryButton;

    @FindBy(xpath = ".//*[@class='dropdown-menu']//a[contains(text(),'Show') and contains(@href,'path=25')]")//All Components button
    private WebElement allComponentsCategoryButton;

    //////////////////////////////
    /*Tablets category button */
    @FindBy(xpath = ".//*[@class='nav navbar-nav']//a[contains(text(),'Tablets')and contains(@href,'path=57')]")//Head Tablets button
    private WebElement tabletsButton;

    //////////////////////////////
    /*Software category button */
    @FindBy(xpath = ".//*[@class='nav navbar-nav']//a[contains(text(),'Software')and contains(@href,'path=17')]")//Head Software button
    private WebElement softwareButton;

    //////////////////////////////
    /*Phones & PDAs category button */
    @FindBy(xpath = ".//*[@class='nav navbar-nav']//a[contains(text(),'Phones & PDAs')and contains(@href,'path=24')]")//Head Phones & PDAs button
    private WebElement phonesPDAsButton;

    //////////////////////////////
    /*Cameras category button */
    @FindBy(xpath = ".//*[@class='nav navbar-nav']//a[contains(text(),'Cameras')and contains(@href,'path=33')]")//Head Cameras button
    private WebElement camerasButton;

    //////////////////////////////
    /*MP3 Players category button */
    @FindBy(xpath = ".//*[@class='nav navbar-nav']//a[contains(text(),'MP3 Players')and @class='dropdown-toggle']")//Head MP3 Players button
    private WebElement mp3PlayersButton;

    @FindBy(xpath = ".//*[@class='dropdown-menu']//a[contains(text(),'Show') and contains(@href,'path=34')]")//All MP3 Players button
    private WebElement allMp3PlayersCategoryButton;

    //////////////////////////////
    /* Getters */

    /////Desktops category/////
    public WebElement getDesktopsButton() {
        wait.until(ExpectedConditions.visibilityOf(desktopsButton));
        return desktopsButton;
    }

    public WebElement getPcCategoryButton() {
        wait.until(ExpectedConditions.visibilityOf(pcCategoryButton));
        return pcCategoryButton;
    }

    public WebElement getMacCategoryButton() {
        return macCategoryButton;
    }

    public WebElement getAllDesktopsCategoryButton() {
        return allDesktopsCategoryButton;
    }

    /////Laptops & Notebooks category/////

    public WebElement getLaptopsNotebooksButton() {
        return laptopsNotebooksButton;
    }

    public WebElement getMacsCategoryButton() {
        return MacsCategoryButton;
    }

    public WebElement getWindowsCategoryButton() {
        return windowsCategoryButton;
    }

    public WebElement getAllLaptopsNotebooksCategoryButton() {
        return allLaptopsNotebooksCategoryButton;
    }

    /////Components category/////

    public WebElement getComponentsButton() {
        return componentsButton;
    }

    public WebElement getMiceTrackballsCategoryButton() {
        return miceTrackballsCategoryButton;
    }

    public WebElement getMonitorsCategoryButton() {
        return monitorsCategoryButton;
    }

    public WebElement getPrintersCategoryButton() {
        return printersCategoryButton;
    }

    public WebElement getScannersCategoryButton() {
        return scannersCategoryButton;
    }

    public WebElement getWebCamerasCategoryButton() {
        return webCamerasCategoryButton;
    }

    public WebElement getAllComponentsCategoryButton() {
        return allComponentsCategoryButton;
    }

    /////Tablets category/////

    public WebElement getTabletsButton() {
        return tabletsButton;
    }

    /////Software category/////

    public WebElement getSoftwareButton() {
        return softwareButton;
    }

    /////Phones & PDAs category/////

    public WebElement getPhonesPDAsButton() {
        return phonesPDAsButton;
    }

    /////Cameras category/////

    public WebElement getCamerasButton() {
        return camerasButton;
    }

    /////MP3 Players category/////

    public WebElement getMp3PlayersButton() {
        return mp3PlayersButton;
    }

    public WebElement getAllMp3PlayersCategoryButton() {
        return allMp3PlayersCategoryButton;
    }

}
