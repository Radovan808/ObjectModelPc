package cz.rado.model;

public class Pamet {
    private String velikost;
    private String rychlost;

    public Pamet(String velikost, String rychlost) {
        this.velikost = velikost;
        this.rychlost = rychlost;
    }

    public String getVelikost() {
        return velikost;
    }

    public String getRychlost() {
        return rychlost;
    }

    @Override
    public String toString() {
        return "Pamet{" +
                "velikost='" + velikost + '\'' +
                ", rychlost='" + rychlost + '\'' +
                '}';
    }
}
