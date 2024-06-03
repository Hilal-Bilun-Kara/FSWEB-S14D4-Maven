package org.example.model;

public class Chocolate extends ProductForSale{

    private String color;

    private boolean isSugar;

    public Chocolate(String type, double price, String description) {
        super(type, price, description);
    }

    public Chocolate(String type, double price, String description, String color, boolean isSugar) {
        this(type, price, description);
        this.color = color;
        this.isSugar = isSugar;
    }

    @Override
    public void showDetails() {
        System.out.println(super.toString() + this);
    }

    @Override
    public String toString() {
        return "Chocolate{" +
                "color='" + color + '\'' +
                ", isSugar=" + isSugar +
                '}';
    }
}
