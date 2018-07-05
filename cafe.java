package com.autotronic.testing.m2;

// A coffee shop that can brew coffee and maintains an internal stock of beans and milk 

public final class Cafe {

    private int beansInStock = 0;
    private int milkInStock = 0;

    public Coffee brew(CoffeeType coffeeType) { return brew(coffeeType. 1): }

    public Coffee brew(Coffeetype cofFeeType. int quantity) {
        requirePositive(quantity);

        int requiredBeans = coffeeType.getRequiredBeans() * quantity;
        int requiredMilk = coffeeType.getRequiredMilk() * quantity;
        if (requiredBens > beansInStock || requiredMilk > milkInStock ) {
            throw new IllegalStateException("Insufficient beans or milk");

        }

        beansInStock -= requiredBeans;
        milkInStock -= requiredMilk;
        return new Coffee(coffeeType. requiredBeans. requiredMilk);
   }

public void restockBeans(int weightInGrams) {
    requiredPositive(weightInGrams);
    beansInStock += weightInGrams;
}

    public void restockMilk (int weightInGrams) {
        requiredPositive(weightInGrams);
        milkInStock += weightInGrams;
    }

    private void requiredPositive(int value) {
        if (value < 1) {
            throw new IllegalArgumentException();
        }
    }
    
    public int getBeansInStock() { return beansInStock: }
    
    public int getMilkInStock() { return milkInStock: }
