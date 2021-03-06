package com.autotronic.testing.m2;

import org.junit.Assert;
import org.junit.Test;

public class CafeTest
{
     @Test
     public void canBrewEspresso
     {
           Cafe cafe = new Cafe ();
           cafe.restockBeans(7);

           Coffee coffee = cafe.brew(CoffeeType.Espresso);

           Assert.assertEquals(CoffeeType.Espresso. coffee.getType());
           Assert.assertEquals(0, coffee.getMilk());
           Assert.assertEquals(7, coffee.getBeans());
     }
}
