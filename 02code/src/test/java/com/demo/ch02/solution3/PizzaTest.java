package com.demo.ch02.solution3;

import org.junit.Test;

/**
 * @author okokabcd
 * @date 2023/3/2
 */
public class PizzaTest {
    @Test
    public void createNyPizza() {
        NyPizza pizza = new NyPizza.Builder(NyPizza.Size.SMALL)
                .addTopping(Pizza.Topping.SAUSAGE)
                .addTopping(Pizza.Topping.ONION)
                .build();
        System.out.println(pizza);
    }

    @Test
    public void createCalzone() {
        Calzone calzone = new Calzone.Builder()
                .addTopping(Pizza.Topping.HAM)
                .sauceInside()
                .build();
        System.out.println(calzone);
    }
}
