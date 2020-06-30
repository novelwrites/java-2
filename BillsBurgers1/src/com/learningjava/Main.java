package com.learningjava;

public class Main {

    public static void main(String[] args) {

PlainHamburger pricing = new PlainHamburger("sesame seed bun", "shredded chicken",
        "ranch dressing", "tomatos", "", "",
        "", "", "", "", 2,3.49);

        System.out.println(pricing.getBreadRollType());
        System.out.println(pricing.getMeat());
        System.out.println(pricing.getTopping1());
        System.out.println(pricing.getTopping2());
        System.out.println(pricing.getNumberToppings());
        System.out.println(pricing.getPlainBurgerPrice());



        pricing.burgerPrice();
    }
}
