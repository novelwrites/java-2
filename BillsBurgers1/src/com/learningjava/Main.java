package com.learningjava;

public class Main {

    public static void main(String[] args) {


PlainHamburger pricing = new PlainHamburger("plainBurger","sesame seed bun", "shredded chicken",
        "ranch dressing", "tomatos", "", "",
        "", "", "", "", 2,3.49);

        System.out.println(pricing.getBurgerType());
        System.out.println(pricing.getBreadRollType());
        System.out.println(pricing.getMeat());
        System.out.println(pricing.getTopping1());
        System.out.println(pricing.getTopping2());
        System.out.println(pricing.getNumberToppings());

            pricing.burgerPrice();

        HealthyBurger healthy = new HealthyBurger("healthyBurger", "wheat bread", "baked chicken", "vinegarette)",
                "tomato", "romaine lettuce", "", "", "", "",
                "", 4, 3.49);

        System.out.println(healthy.getBurgerType());
        System.out.println(healthy.getBreadRollType());
        System.out.println(healthy.getMeat());
        System.out.println(healthy.getTopping1());
        System.out.println(healthy.getTopping2());
        System.out.println(healthy.getTopping3());
        System.out.println(healthy.getNumberToppings());

        healthy.burgerPrice();


        DeluxeBurger deluxe = new DeluxeBurger("deluxeBurger","sourdough bread", "double beef", "mayonnaise",
                "mustard", "ketchup", "onions", "pickles", "tomato",
                "American cheese", "lettuce", 8, 3.49);

            System.out.println(deluxe.getBurgerType());
            System.out.println(deluxe.getBreadRollType());
            System.out.println(deluxe.getMeat());
            System.out.println(deluxe.getTopping1());
            System.out.println(deluxe.getTopping2());
            System.out.println(deluxe.getTopping3());
            System.out.println(deluxe.getTopping4());
            System.out.println(deluxe.getTopping5());
            System.out.println(deluxe.getTopping6());
            System.out.println(deluxe.getTopping7());
            System.out.println(deluxe.getTopping8());
            System.out.println(deluxe.getNumberToppings());

            deluxe.burgerPrice();

        Bread.bread();
        Meat.meat();
        Side.side();

PlainHamburger burger = new PlainHamburger("plainBurger","sesame seed bun", "shredded chicken",
        "ranch dressing", "tomatos", "", "",
        "", "", "", "", 2,3.49);

Drink drink = new Drink("coke", "gatorade", "sprite", "beer");

Side side = new Side("french fries", "chips", "potato salad");

Meal theMeal = new Meal(burger, drink, side);

        System.out.println(theMeal);

    }


}
