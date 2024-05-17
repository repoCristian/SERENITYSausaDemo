package com.utest.ui;


import net.serenitybdd.screenplay.targets.Target;

public class LoginUI {

    public static final Target USERNAME = Target.the("username").locatedBy("//input[@id='user-name']");

    public static final Target PASS = Target.the("username").locatedBy("//input[@id='password']");

    public static final Target BTN_SUBMIT= Target.the("pass").locatedBy("//input[@type='submit']");

    public static final Target INF_ERROR= Target.the("infoError").locatedBy("//h3[@data-test='error']");
}

