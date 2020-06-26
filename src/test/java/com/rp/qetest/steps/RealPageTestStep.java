package com.rp.qetest.steps;
import com.rp.qetest.Models.DataModel;

import net.thucydides.core.annotations.Step;

import java.util.logging.Logger;


public class RealPageTestStep {


    private static final Logger LOGGER = Logger.getLogger(RealPageTestStep.class.getName());
    com.rp.qetest.pageobjects.RealPageTestPageObject RealPageTestPageObject;
    DataModel constructorModel = new DataModel();



    @Step
    public void openApp(){

        RealPageTestPageObject.open();

    }

    public void searchWomen(){

            RealPageTestPageObject.searchWomenItems();

    }

    public void addItems() {

        int selectedItems =  constructorModel.getItemsCount();

        while (selectedItems == 0 || selectedItems == 1) {

                RealPageTestPageObject.searchWomenItems();

            RealPageTestPageObject.addItems();
            selectedItems =  constructorModel.getItemsCount();

        }

        LOGGER.info("User can add multiple items to cart");

    }

    public void continueShopping() {
        RealPageTestPageObject.continueShopping();

    }

    public void searchDress() {
        RealPageTestPageObject.searchDress();
    }

    public void addItemPopUp() {
        RealPageTestPageObject.addItemPopUp();
    }

    public void search2Dress(int items) {

        int counter = 1;
        while(counter <= items){
            RealPageTestPageObject.searchDress();
            RealPageTestPageObject.addItemPopUp();
            counter ++;

        }


    }

    public void verifyCart(String quantity) {
        RealPageTestPageObject.verifyCart(quantity);
    }

    public void authenticationScreen(String text) {

        RealPageTestPageObject.authenticationScreen(text);
    }
}
