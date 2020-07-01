package com.learningjava;

public class Side {

    private String frenchfries;
    private String chips;
    private String potatosalad;

    public Side(String frenchfries, String chips, String potatosalad) {
        this.frenchfries = frenchfries;
        this.chips = chips;
        this.potatosalad = potatosalad;
    }

    public static void side() {

        System.out.println("Side does not inherit from PlainHamburger");
    }

    public void selectSide(String frenchfries, String chips, String potatosalad) {
        System.out.println("Side choices are frenchfries, chips, or potato salad");
    }

    public String getFrenchfries() {
        return frenchfries;
    }

    public String getChips() {
        return chips;
    }

    public String getPotatosalad() {
        return potatosalad;
    }
}
