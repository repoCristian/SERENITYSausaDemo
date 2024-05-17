package com.utest.ui;

import net.serenitybdd.screenplay.targets.Target;

public class CartUI {
    public static final Target BTN_UNO= Target.the("btn uno").locatedBy("(//button[contains(@id, 'add-to-cart')])[1]");
    public static final Target BTN_DOS= Target.the("btn dos").locatedBy("(//button[contains(@id, 'add-to-cart')])[2]");
    public final static Target BTN_cart = Target.the("btn cart").locatedBy("//div[@id='shopping_cart_container']");
    public final static Target BTN_checkout = Target.the("btn checkout").locatedBy("//button[@id='checkout']");
    public final static Target BTN_continue = Target.the("btn continue").locatedBy(".btn_action");
    public final static Target BTN_end = Target.the("btn end").locatedBy(".cart_button");
}
