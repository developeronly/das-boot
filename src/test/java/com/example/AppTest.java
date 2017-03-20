package com.example;

import com.example.controller.HomeController;
import org.junit.Assert;
import org.junit.Test;

public class AppTest {

    @Test
    public void testApp() {
        HomeController homeController = new HomeController();
        String response = homeController.home();
        Assert.assertEquals(response, "Das boot, reporting for duty.");
    }

}
