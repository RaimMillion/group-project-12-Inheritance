package com.devxschool;

// TODO SETUP THIS CLASS
public class TestBase {

      String appName = "DevXSchool Application Test Base";
      String configurations = "Base Test Configurations";
      int testId = 100;

    public String getAppName() {
        return appName;
    }

    public void initializeTestConfigurations() {
        System.out.println(configurations);
    }

    @Override
    public int hashCode() {
        return testId;
    }

    public int getTestId() {
        return hashCode();
    }
}
