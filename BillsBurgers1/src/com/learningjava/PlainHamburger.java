package com.learningjava;

public class PlainHamburger {

    private String burgerType;
    private String breadRollType;
    private String meat;
    private String topping1; //Need the possibility for eight different toppings on same burger
    private String topping2;
    private String topping3;
    private String topping4;
    private String topping5;
    private String topping6;
    private String topping7;
    private String topping8;
    private int numberToppings;
    private double plainBurgerPrice;

    //Initialize values of object

    public PlainHamburger(String burgerType, String breadRollType, String meat, String topping1, String topping2,
                          String topping3, String topping4, String topping5, String topping6,
                          String topping7, String topping8, int numberToppings, double plainBurgerPrice) {

        this.burgerType = burgerType;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.topping1 = topping1;
        this.topping2 = topping2;
        this.topping3 = topping3;
        this.topping4 = topping4;
        this.topping5 = topping5;
        this.topping6 = topping6;
        this.topping7 = topping7;
        this.topping8 = topping8;
        this.numberToppings = numberToppings;
        this.plainBurgerPrice = plainBurgerPrice;


    }

    public void burgerPrice() { //calculates burger price

        //System.out.println("A plain hamburger without toppings costs " + plainBurgerPrice);
        //this.plainBurgerPrice += (numberToppings * .60); //calculate price with toppings
        String burgerType = "healthyBurger"; //Choose Plain ("plainBurger"), Healthy ("healthyBurger") or Deluxe Burger ("deluxeBurger")
        switch (burgerType) {
            case "plainBurger":

                this.plainBurgerPrice += (numberToppings * .60); //calculate price with toppings
                if (this.plainBurgerPrice > 4.69) { //price of burger plus two toppings
                    System.out.println("Sorry, you are only allowed up to two toppings on the plain hamburger");
                } else {
                    double toppingsBurgerPrice = this.plainBurgerPrice;
                    System.out.println("This plain hamburger has " + numberToppings + " toppings and costs " + toppingsBurgerPrice);

                }

                break;

            case "healthyBurger":
                Class HealthyBurger;
                this.plainBurgerPrice += (numberToppings * .60); //calculate price with toppings
                if (this.plainBurgerPrice > 5.89) //price of burger plus four toppings

                {
                    System.out.println("Sorry, you are only allowed up to four toppings on the healthy hamburger");
                } else {
                    double toppingsBurgerPrice = this.plainBurgerPrice;
                    System.out.println("This healthy hamburger has " + numberToppings + " toppings and costs " + toppingsBurgerPrice);
                }
                break;
            case "deluxeBurger":
                Class DeluxeBurger;
                this.plainBurgerPrice += (numberToppings * .60); //calculate price with toppings
                if (this.plainBurgerPrice > 9.49) //price of burger plus eight toppings

                {
                    System.out.println("Sorry, you are only allowed up to eight toppings on the deluxe hamburger");
                } else {
                    double toppingsBurgerPrice = this.plainBurgerPrice;
                    System.out.println("This deluxe hamburger has " + numberToppings + " toppings and costs " + toppingsBurgerPrice);
                }
                break;

        }
    }

    public String getBurgerType() {
        return burgerType;
    }

    public void setBurgerType(String burgerType) {
        this.burgerType = burgerType;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public void setBreadRollType(String breadRollType) {
        this.breadRollType = breadRollType;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public String getTopping1() {
        return topping1;
    }

    public void setTopping1(String topping1) {
        this.topping1 = topping1;
    }

    public String getTopping2() {
        return topping2;
    }

    public void setTopping2(String topping2) {
        this.topping2 = topping2;
    }

    public String getTopping3() {
        return topping3;
    }

    public void setTopping3(String topping3) {
        this.topping3 = topping3;
    }

    public String getTopping4() {
        return topping4;
    }

    public void setTopping4(String topping4) {
        this.topping4 = topping4;
    }

    public String getTopping5() {
        return topping5;
    }

    public void setTopping5(String topping5) {
        this.topping5 = topping5;
    }

    public String getTopping6() {
        return topping6;
    }

    public void setTopping6(String topping6) {
        this.topping6 = topping6;
    }

    public String getTopping7() {
        return topping7;
    }

    public void setTopping7(String topping7) {
        this.topping7 = topping7;
    }

    public String getTopping8() {
        return topping8;
    }

    public void setTopping8(String topping8) {
        this.topping8 = topping8;
    }

    public int getNumberToppings() {
        return numberToppings;
    }

    public void setNumberToppings(int numberToppings) {
        this.numberToppings = numberToppings;
    }

    public double getPlainBurgerPrice() {
        return plainBurgerPrice;
    }

    public void setPlainBurgerPrice(double plainBurgerPrice) {
        this.plainBurgerPrice = plainBurgerPrice;
    }

}
