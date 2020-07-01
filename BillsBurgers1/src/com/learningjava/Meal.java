package com.learningjava;

public class Meal {

    private PlainHamburger burger;
    private Drink drink;
    private Side side;
    private int sideNum;

    public Meal(PlainHamburger burger, Drink drink, Side side) {
        this.burger = burger;
        this.drink = drink;
        this.side = side;
    }


    public void selectMeal(String burgerType, String drink, String side) {
        System.out.println("Meal includes " + burgerType + ", " + drink + ", " + side + ".");


        if (sideNum > 3) {
            System.out.println("Sorry, you are only allowed up to three sides for your meal");
        }

    }
    public PlainHamburger getBurger() {
        return burger;
    }

    public Drink getDrink() {
        return drink;
    }

    public Side getSide() {
        return side;
    }
}
