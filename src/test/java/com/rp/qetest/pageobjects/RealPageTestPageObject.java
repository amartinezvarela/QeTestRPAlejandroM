package com.rp.qetest.pageobjects;

import com.rp.qetest.Models.DataModel;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

import java.util.logging.Logger;

@DefaultUrl("http://automationpractice.com/")
public class RealPageTestPageObject extends PageObject {



    private static final Logger LOGGER = Logger.getLogger(RealPageTestPageObject.class.getName());
    DataModel constructorModel = new DataModel();

    @FindBy(xpath = "//div[@class='fancybox-wrap fancybox-desktop fancybox-type-iframe fancybox-opened']//child::iframe")
    WebElementFacade iframe;


    public void searchWomenItems () {

        findBy("//a[@title='Women'] ").click();
        findBy("//h2[@class='title_block']//following::a[1]").click();
        findBy("//h2[@class='title_block']//following::a[2]").click();

    }

    public void addItems() {

        findBy("//ul[@class='product_list grid row']//child::li[1]").click();
        findBy("//span[text()='Add to cart']").click();
        constructorModel.setItemsCount(constructorModel.getItemsCount()+1);

    }

    public void continueShopping() {

        WebElementFacade title=$("//title[text()='My Store']");
        findBy("//span[@title='Continue shopping']").click();

        if (title.isVisible()){
            LOGGER.info("page redirected to homepage");
        }else{

            LOGGER.info("Homepage is not found");
            Assert.fail("Home page is not found, this is an error");

            }

        }

    public void searchDress() {

        findBy("//a[@title='Women'] ").click();
        findBy("//h2[@class='title_block']//following::a[4]").click();
        findBy("//h2[@class='title_block']//following::li[2]").click();

        Actions action = new Actions(getDriver());
        WebElementFacade popUp = $("//ul[@class='product_list grid row']//child::li[1]");
        action.moveToElement(popUp).perform();


        findBy("//span[text()='Quick view']").click();

    }

    public void addItemPopUp() {

        WebElementFacade closeWin = $("//span[@class='cross']");

        getDriver().switchTo().defaultContent();
        getDriver().switchTo().frame(iframe);
        findBy("//div[@class='primary_block row']//following::form//following::button").click();

        closeWin.waitUntilClickable().click();

    }

    public void verifyCart(String quantity) {


        WebElementFacade totalItems= $("//span[@id='summary_products_quantity']");

        findBy("//a[@title='View my shopping cart']").click();
        String[] total = totalItems.getText().split(" ") ;
        if(total[0].equals(quantity)) {
            LOGGER.info("Are "+ total + "items in cart");
        }else{
            Assert.fail("Shopping Cart don't have "+ total +"items");
        }



    }

    public void authenticationScreen(String text) {

        findBy("//span[text()='Proceed to checkout']").click();
        WebElementFacade authenticationLabel= $("//h1[@class='page-heading']");



        if(authenticationLabel.getText().equals(text)) {
            LOGGER.info("the webpage is in authentication page");
        }else{
            Assert.fail("authentication page is not present");
        }

    }
}

