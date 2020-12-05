package com.opencart.pages.SuccessPage;

import com.opencart.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SuccessCategoryPage extends BasePage {

    /* Desktops success */
    @FindBy(xpath = ".//*[@id='content']/h2")
    private WebElement pcCategoryTitle;

    @FindBy(xpath = ".//*[@id='content']/h2")
    private WebElement macCategoryTitle;

    @FindBy(xpath = ".//*[@id='content']/h2")
    private WebElement allDesktopsCategoryTitle;

    /* Laptops & Notebooks success */

    @FindBy(xpath = ".//*[@id='content']/h2")
    private WebElement macsCategoryTitle;

    @FindBy(xpath = ".//*[@id='content']/h2")
    private WebElement windowsCategoryTitle;

    @FindBy(xpath = ".//*[@id='content']/h2")
    private WebElement allLaptopsNotebooksCategoryTitle;

    /* Components success */

    @FindBy(xpath = ".//*[@id='content']/h2")
    private WebElement miceTrackballsCategoryTitle;

    @FindBy(xpath = ".//*[@id='content']/h2")
    private WebElement monitorsCategoryTitle;

    @FindBy(xpath = ".//*[@id='content']/h2")
    private WebElement printersCategoryTitle;

    @FindBy(xpath = ".//*[@id='content']/h2")
    private WebElement scannersCategoryTitle;

    @FindBy(xpath = ".//*[@id='content']/h2")
    private WebElement webCamerasCategoryTitle;

    @FindBy(xpath = ".//*[@id='content']/h2")
    private WebElement allComponentsCategoryTitle;

    /* Tablets success */
    @FindBy(xpath = ".//*[@id='content']/h2")
    private WebElement tabletsCategoryTitle;

    /* Software success */
    @FindBy(xpath = ".//*[@id='content']/h2")
    private WebElement softwareCategoryTitle;

    /* Phones & PDAs success */
    @FindBy(xpath = ".//*[@id='content']/h2")
    private WebElement phonesPDAsCategoryTitle;

    /* Phones & PDAs success */
    @FindBy(xpath = ".//*[@id='content']/h2")
    private WebElement camerasCategoryTitle;

    /* MP3 Players success */
    @FindBy(xpath = ".//*[@id='content']/h2")
    private WebElement allMp3PlayersCategoryTitle;


    ////////Getters Desktops success ////////

    public WebElement getPcCategoryTitle() {
        return pcCategoryTitle;
    }

    public WebElement getMacCategoryTitle() {
        return macCategoryTitle;
    }

    public WebElement getAllDesktopsCategoryTitle() { return allDesktopsCategoryTitle; }

    ////////Getters Laptops & Notebooks success ////////


    public WebElement getMacsCategoryTitle() {
        return macsCategoryTitle;
    }

    public WebElement getWindowsCategoryTitle() {
        return windowsCategoryTitle;
    }

    public WebElement getAllLaptopsNotebooksCategoryTitle() {
        return allLaptopsNotebooksCategoryTitle;
    }

    ////////Getters Components success ////////

    public WebElement getMiceTrackballsCategoryTitle() {
        return miceTrackballsCategoryTitle;
    }

    public WebElement getMonitorsCategoryTitle() {
        return monitorsCategoryTitle;
    }

    public WebElement getPrintersCategoryTitle() {
        return printersCategoryTitle;
    }

    public WebElement getScannersCategoryTitle() {
        return scannersCategoryTitle;
    }

    public WebElement getWebCamerasCategoryTitle() {
        return webCamerasCategoryTitle;
    }

    public WebElement getAllComponentsCategoryTitle() { return allComponentsCategoryTitle; }

    ////////Getters Tablets success ////////

    public WebElement getTabletsCategoryTitle() {
        return tabletsCategoryTitle;
    }

    ////////Getters Software success ////////

    public WebElement getSoftwareCategoryTitle() {
        return softwareCategoryTitle;
    }

    ////////Getters Phones & PDAs success ////////

    public WebElement getPhonesPDAsCategoryTitle() {
        return phonesPDAsCategoryTitle;
    }
    ////////Getters Cameras success ////////

    public WebElement getCamerasCategoryTitle() {
        return camerasCategoryTitle;
    }

    ////////MP3 Players Cameras success ////////

    public WebElement getAllMp3PlayersCategoryTitle() {
        return allMp3PlayersCategoryTitle;
    }

}
