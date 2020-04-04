package com.framework.atf.testcases.guiTestCases;

import com.framework.atf.boilerplates.BasicPage;
import com.framework.atf.boilerplates.LoginPage;
import com.framework.atf.utils.Profile;
import com.framework.atf.utils.TestEngine;

public class DemoTestTBD {

    public static void main(String[] args) {
        LoginPage objLoginPage = new LoginPage();
        objLoginPage.goTo(Profile.getProperty("url"));
        objLoginPage.doLogin("Admin", "admin123");
        objLoginPage.close();
    }
}
