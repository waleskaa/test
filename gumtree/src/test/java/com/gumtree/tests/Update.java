package com.gumtree.tests;

import com.gumtree.main.Main;
import com.gumtree.pages.MainPage;
import org.testng.annotations.Test;

/**
 *
 * @author waleskaa
 */
public class Update extends Main {

    @Test
    public void update() {
        MainPage mainPage = new MainPage(driver);

        mainPage.login("maria.czapla89", "mariaczapla");

    }
}
