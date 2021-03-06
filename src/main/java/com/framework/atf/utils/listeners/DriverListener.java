package com.framework.atf.utils.listeners;

import com.framework.atf.boilerplates.BasicPage;
import com.framework.atf.utils.Profile;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class DriverListener implements ITestListener {

    public void onTestStart(ITestResult result) {
        System.out.println(result.getName() + " test case started");
    }

    public void onTestSuccess(ITestResult result) {
        Profile.getInstance().closeDriver();
    }

    public void onTestFailure(ITestResult result) {
    }

    public void onTestSkipped(ITestResult result) {
        System.out.println("The name of the testcase Skipped is :" + result.getName());

    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
    }

    public void onTestFailedWithTimeout(ITestResult result) {
        this.onTestFailure(result);
    }

    public void onStart(ITestContext context) {
    }

    public void onFinish(ITestContext context) {
    }
}
