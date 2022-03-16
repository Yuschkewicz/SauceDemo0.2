package tests;

import org.testng.annotations.Test;

public class CartTest extends BaseOptionTest {
    @Test
    public void productShouldBeAddedIntoCart() {
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
        productsPage.addToCart("Sauce Labs Backpack");

    }
}