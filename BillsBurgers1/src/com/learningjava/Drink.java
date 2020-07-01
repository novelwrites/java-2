package com.learningjava;

public class Drink {

    private String coke;
    private String gatorade;
    private String sprite;
    private String beer;

    public Drink(String coke, String gatorade, String sprite, String beer) {
        this.coke = coke;
        this.gatorade = gatorade;
        this.sprite = sprite;
        this.beer = beer;
    }

    public void selectDrink(String coke, String gatorade, String sprite, String beer) {
        System.out.println("Drink choices are coke, gatorade, sprite, or beer");
    }

    public String getCoke() {
        return coke;
    }

    public String getGatorade() {
        return gatorade;
    }

    public String getSprite() {
        return sprite;
    }

    public String getBeer() {
        return beer;
    }
}
