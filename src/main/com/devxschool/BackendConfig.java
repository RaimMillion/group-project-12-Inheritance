package com.devxschool;

// TODO SETUP THIS CLASS
public class BackendConfig extends TestBase {


     String configurations = "Backend Test Configurations";

    @Override
    public String getAppName() {
        return super.getAppName();
    }

    @Override
    public void initializeTestConfigurations() {
        System.out.println(configurations);
        System.out.println("Here I would add some backend configurations for database and other connections");
    }

    @Override
    public int hashCode() {
        return super.testId;
    }



    @Override
    public String toString() {
        return
                "\napp name: " + super.appName +
                "\ntest id: " + hashCode() +
                "\nconfig: " + configurations;
    }

    @Override
    public boolean equals(Object o) {
        return this.hashCode() == o.hashCode();
    }
}