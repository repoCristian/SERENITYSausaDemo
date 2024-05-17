package com.utest.ui;

import net.serenitybdd.screenplay.targets.Target;

public class FilterPriceUI {
    public static final Target BTN_FILTER = Target.the("button filter").locatedBy("//select[@data-test='product_sort_container']//option[text()='Price (low to high)']");
    public static final Target LEFT_PRICE = Target.the("left price").locatedBy("(//div[@class='inventory_item_price'])[1]");

    public static final Target RIGHT_PRICE = Target.the("right price").locatedBy("(//div[@class='inventory_item_price'])[2]");

}
