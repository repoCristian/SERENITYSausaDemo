package com.utest.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import static com.utest.ui.FilterPriceUI.*;


public class FilterQuestions {


    public static int comparePrices(Actor actor) {
        String leftText = actor.asksFor(Text.of(LEFT_PRICE));
        String rightText = actor.asksFor(Text.of(RIGHT_PRICE));
        try {
            int leftPrice = Integer.parseInt(leftText);
            int rightPrice = Integer.parseInt(rightText);

            // Direct comparison using Java's built-in comparison operators
            if (leftPrice < rightPrice) {
                System.out.println("The first price is less than the second price.");
                return rightPrice;
            } else if (leftPrice > rightPrice) {
                System.out.println("The first price is greater than the second price.");
                return leftPrice;
            } else {
                System.out.println("The prices are equal.");
                return leftPrice;
            }
        } catch (NumberFormatException e) {
            // Handle the exception, e.g., log an error or throw a custom exception
            System.err.println("Error parsing prices: " + e.getMessage());
        }
        return 1;
    }


}
